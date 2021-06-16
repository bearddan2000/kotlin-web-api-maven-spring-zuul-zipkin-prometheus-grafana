# kotlin-web-api-maven-spring-zuul-zipkin-prometheus-grafana

## Description
A springboot app that uses zuul
as a reverse proxy. All requests
to `/api` will be forwarded to nodejs
server.
Uses prometheus to graph response times
and grafana for low level metrics.

### STEP 1
Once the project is done building, make
some api calls `http://localhost:81`.

### STEP 2
- goto http://localhost
- click on "Find a trace"
  - search by "serviceName"

To see a graph of response times:
- Nav to http://localhost:82
- Classic UI
  - Click Graph tab
    - Search: 'scrape_series_added'
      or 'scrape_duration_second'
      or 'http_request_duration_ms_bucket'
    - Duration 1m

For health check:
- Nav to http://localhost:82
- Targetes

To see Prometheus dashboards:
- Nav to http://localhost:83
- Login with `admin/admin`
- configuration -> datasources
  - Select Prometheus
    - dashboards
      - import and click label

To see Zipkin dashboards:
- Nav to http://localhost:83
- Login with `admin/admin`
- Explore
  - Change datasource to Zipkin

## Tech stack
- kotlin
- maven
  - springboot
  - netflix zuul
  - sleuth
  - zipkin
- nodejs
- prometheus

## Docker stack
- openjdk:11-jdk
- node:latest
- openzipkin/zipkin
- prom/prometheus
- grafana/grafana

## To run
`sudo ./install.sh -u`
- ZIPKIN DASHBOARD http://localhost
- API http://localhost:81/all
- API remote service http://localhost:81/api/all
- PROMETHEUS DASHBOARD http://localhost:82
- GRAFANA DASHBOARD http://localhost:83
  - Login with `admin/admin`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- https://spring.io/guides/gs/routing-and-filtering/
- https://github.com/openzipkin-attic/docker-zipkin/blob/master/docker-compose.yml
- https://cloud.spring.io/spring-cloud-sleuth/1.3.x/multi/multi__sending_spans_to_zipkin.html
- https://howtodoinjava.com/microservices/spring-cloud-zipkin-sleuth-tutorial/
- https://www.javainuse.com/spring/cloud-sleuth
