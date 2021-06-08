package com.springboot.zuul.filter

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants

class MyZuulFilter(): ZuulFilter() {

    override fun run(): Any? {

        println("Entered MyZuulFilter run Method")

        var requestContext = RequestContext.getCurrentContext()
        var request = requestContext.request

        var method = request.method
        var url = request.requestURL.toString()

        println("method: $method, url: $url")

        return null
    }

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun filterType(): String {
        return FilterConstants.PRE_TYPE
    }

    override fun filterOrder(): Int {
        return 0
    }
}
