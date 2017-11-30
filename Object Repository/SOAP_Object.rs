<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SOAP_Object</name>
   <tag></tag>
   <elementGuidId>9c9b4ef2-da0c-480c-9f5a-ee274032babe</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:ns=&quot;http://virginmedia/schema/RetrieveDiagnostic_V2/1/0&quot; xmlns:ns1=&quot;http://virginmedia/schema/RequestHeader/1/4&quot; xmlns:ns2=&quot;http://virginmedia/schema/BaseType/1/3&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;ns:RetrieveDiagnosticRequest>
         &lt;requestHeader>
            &lt;ns1:id>123123&lt;/ns1:id>
            &lt;!--Optional:-->
            &lt;ns1:source>IVR&lt;/ns1:source>
            &lt;ns1:user>
               &lt;ns2:userId>IVRCNSC&lt;/ns2:userId>
               &lt;ns2:credentials>qwerty1234&lt;/ns2:credentials>
            &lt;/ns1:user>
         &lt;/requestHeader>
         &lt;!--You have a CHOICE of the next 2 items at this level-->
         &lt;retrieveByDiagnosticId>
            &lt;diagnosticId>80007&lt;/diagnosticId>
         &lt;/retrieveByDiagnosticId>
      &lt;/ns:RetrieveDiagnosticRequest>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceFunction>RetrieveDiagnostic_V2</soapServiceFunction>
   <wsdlAddress>http://10.110.202.45:7200/RetrieveDiagnostic_V2/VirginMedia?wsdl</wsdlAddress>
</WebServiceRequestEntity>
