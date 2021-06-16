package example.filters;

import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;

class SimpleFilter : ZuulFilter() {

  override fun filterType(): String {
    return "pre";
  }

  override fun filterOrder(): Int {
    return 1;
  }

  override fun shouldFilter(): Boolean {
    return true;
  }

  override fun run(): Any {
    val ctx :RequestContext = RequestContext.getCurrentContext();
    val request: HttpServletRequest = ctx.getRequest();

    println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

    return Any();
  }

}
