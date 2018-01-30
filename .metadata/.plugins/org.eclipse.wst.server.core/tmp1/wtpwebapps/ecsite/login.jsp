<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta http-equiv="Content-Style-Type" content="text/css" />
 <meta http-equiv="Content-Script-Type" content="text/javascript" />
 <meta http-equiv="imagetoolbar" content="no" />
 <meta name="description" content="" />
 <meta name="keywords" content="" />
 <title>Login</title>

 <style type="text/css">
  body{
   margin:0;
   padding:0;
   line-height:1.6;
   letter-spacing:1px;
   font-size:12px;
   color:#333;
   background:#fff;
   }

  table{
   text-align: center;
   margin: 0 auto;
   }

  #top{
   width: 100%;
   margin: 30px auto;
   border: 1px so;id #333;
   }

  #header{
   width:100%;
   height:80px;
   background-color:black;
  }

  #main{
   width:100%;
   height:500px;
   text-align:center;
  }

  #footer{
   width:100%;
   height:80px;
   bacground-color:black;
   clear:both;
  }

  #text-link{
   display:inline-block;
   text-align:right;
  }
  #loginB{
  background-color:blue;
  padding:25px 25px;
  border-style:none;
  cursor: pointer;
  border-radius: 50%;
  @-webkit-border-radius: 50%;
  @-moz-border-radius: 50%;
  float:right;
  }
 </style>

</head>
<body>
 <div id="header">
  <div id="pr"></div>
 </div>

 <div id="main">
  <div id="top">
   <p>Login</p>
  </div>
  <div>
   <h3>商品を購入する際にはログインをお願いします。</h3>
   <div id="login">
    <s:form action="LoginAction">
     <div id="login_left">
      <s:textfield name="loginUserId"/>
      <s:password name="loginPassword"/>
     </div>
     <div id="login_right">
      <s:submit value="ログイン" id="loginB"/>
     </div>
    </s:form>
   </div>
   <br/>
   <div id="text-link">
    <p>新規ユーザー登録は
     <a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
    <p>Homeへ戻る場合は
     <a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
   </div>
  </div>
 </div>
 <div id="footer">
  <div id="pr"></div>
 </div>

</body>
</html>