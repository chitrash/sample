<?xml version="1.0" encoding="UTF-8" ?>
   <!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
     <log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/">
       <appender name="appender" class="org.apache.log4j.FileAppender">
           <param name="File" value="${jboss.server.log.dir}/hl7service.log"/>
           <param name="Append" value="true"/>
        <layout class="org.apache.log4j.PatternLayout">
           <param name="ConversionPattern" value="%d [%t] %p - %m%n"/>
        </layout>
       </appender>
     <root>
      <priority value ="trace"/>
    <appender-ref ref="appender"/>
     </root>
    </log4j:configuration>
