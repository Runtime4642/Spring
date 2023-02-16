
# Controller


## dispatcherServlet



![없음](./download.PNG)
출처 : https://www.codenuclear.com/spring-mvc-flow-with-example/

dispatcherServlet 가 요청을 먼저 받아서 적절한 Controller를 찾아서 실행시킨다.

<br>
<br>

![없음](./hihi.PNG)
*(이해를 돕기위한 이미지)*

원본 dispatchServlet 코드를 보면 이해가 어렵기 때문에.. 비슷한 다른 Servlet 코드로 준비했습니다.

들어온 요청을 보고 적절한 Controller를 찾아서 실행해준다.


<br>
<br>
<br>

# HTTP


요청
>>GET /restapi/v1.0 HTTP/1.1
>>Accept: application/json
>>Authorization: Bearer UExBMDFUMDRQV1MwMnzpdvtYYNWMSJ7CL8h0zM6q6a9ntw


응답

>HTTP/1.1 200 OK  
Date: Mon, 23 May 2005 22:38:34 GMT  
Content-Type: text/html; charset=UTF-8  
Content-Encoding: UTF-8  
Content-Length: 138  
Last-Modified: Wed, 08 Jan 2003 23:11:55 GMT  
Server: Apache/1.3.3.7 (Unix) (Red-Hat/Linux)  
ETag: "3f80f-1b6-3e1cb03b"  
Accept-Ranges: bytes  
Connection: close  

