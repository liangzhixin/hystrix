# hystrix



hystrix更多属性见https://github.com/Netflix/Hystrix/wiki/Configuration#CommandCircuitBreaker

断路器的开启和关闭:
     断路器开启要满足以下条件: 
          1、整个链路达到一定的阀值，默认情况下，10秒内产生超过20次请求，则符合第一个条件。 
          2、满足第一个条件的情况下，如果请求的错误百分比大于阀值，则会打开断路器，默认为50%。 
     断路器关闭:
          断路器打开后，在一段时间内，命令不会再执行（一直触发回退），这段时间我们称作“休眠期”，休眠期默认值为5秒。
          休眠期结束后，Hystrix会尝试性的执行一次命令，此时断路器的状态不是开启，也不是关闭，而是一个半开的状态。
          如果这一次命令执行成功，则会关闭断路器并清空链路的健康信息，如果执行失败，断路器会继续保持打开的状态

Hystrix监控面板:
     Delay：该参数用来控制服务器上轮询监控信息的延迟时间，默认为2000毫秒，我们可以通过配置该属性来降低客户端的网络和CPU消耗。
     Title：该参数对应了上图头部标题Hystrix Stream之后的内容，默认会使用具体监控实例的URL，我们可以通过配置该信息来展示更合适的标题。
     
     
     
