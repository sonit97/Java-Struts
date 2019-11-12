<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <title>AUTA151 学生情報 試合ー更新 </title>
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <script src="js/jquery-1.11.2.min.js"></script>
</head>

<body>
	<div class="page-disable" id="page-disable" style="display:none"></div> 
    <div class="wrapper">
        <div class="header">
            <div class="row">
                <div class="col-sm-12">
                    <div class="col-sm-4">
                        <label  for="">AUTB151</label>
                    </div>
                    <div class="col-sm-4">
                        <label style="font-weight: bold;"> 学生情報 試合ー更新 </label>
                    </div>
                    <div class="col-sm-4">
                       <label  id="processDate"></label>
                    </div>
                </div>
            </div>
        </div>
		 
        <div class="error" style="display: none;">
            <div class="row">
                <div class="col-sm-12">
                <span style="color: black;"  id="error0" ></span>
                <span style="color: black;"  id="error1" ></span>
                <span style="color: black;"  id="error2" ></span>
                <span style="color: black;"  id="error3" ></span>
                <span style="color: black;"  id="error4" ></span>
                <span style="color: black;"  id="error5" ></span>
                <span style="color: black;"  id="error6" ></span>  
                <span style="color: black;"  id="error7" ></span>  
                <span style="color: black;"  id="error8" ></span> 
                <span style="color: black;"  id="error9" ></span>  
                <span style="color: black;"  id="error10" ></span>  
                <span style="color: black;"  id="error11" ></span>
                <span style="color: black;"  id="error12" ></span>
                <span style="color: black;"  id="error13" ></span>
                <span style="color: black;"  id="error14" ></span>
                <span style="color: black;"  id="error15" ></span>                
                </div>
            </div>
        </div>
        <html:form action="/screenStudent" method="post">
        
			<logic:notEmpty name="studentForm" property="listMessage"> 
		         <div class="success" >
			           <logic:notEmpty name="studentForm" property="messageUpdate">
							<div class="row">
								<div class="col-sm-12" id="message1">
									<span id="updateSpan"> <img src="images/ok.png" width="20px" height="20px">
										<bean:write name="studentForm" property="messageUpdate" />
									</span>
								</div>
							</div>
						</logic:notEmpty>
						 <logic:notEmpty name="studentForm" property="messageDelete">
							<div class="row">
								<div class="col-sm-12" id="message1">
									<span id="updateSpan"> <img src="images/ok.png" width="20px" height="20px">
										<bean:write name="studentForm" property="messageDelete" />
									</span>
								</div>
							</div>
						</logic:notEmpty>
		        </div>
	        </logic:notEmpty>
	        <logic:notEmpty name="studentForm" property="messageSearch" >
				<div class="error" id="hideMessageUpdate" >
					<div class="row">
						<div class="col-sm-12" id="message1">
							<span id="deleteSpan"> <img src="images/error.png" width="20" height="20">
								<bean:write name="studentForm" property="messageSearch" />
							</span>
						</div>
					</div>
				</div>
			</logic:notEmpty> 
        </html:form>
        

        <div class="search">
            <div class="row">
            <html:form  styleClass="form col-sm-12" action="/screenStudent" method="post">
            
               
                    <div class="formcontrol col-sm-12">
                        <div class="row col-sm-12">
                            <label style="margin-left: -10px;width: 183px; height: 30px;" class="col-sm-2">機関</label>
                            <div class="col-sm-2">
                            <html:select  tabindex="1" styleId="yyy" property="insitution1" style="width: 318px;height: 30px;" >
            							<html:option value=""></html:option>
            							<html:optionsCollection name="studentForm" property="listInstitution" label="institutionCode" value="institutionCode" />
            				</html:select>
            				
            				<%-- 	<html:text  property="insitution" ></html:text> --%>
            				<%--  <input id="xxxxxx" type="text" name="xxxxxx"  list="browsers" > 
            				 <datalist id="browsers">
            				 <html:select tabindex="1" styleId="yyy" property="insitution" style="width: 318px;height: 30px;" >
            						<html:option value=""></html:option>
            						<html:optionsCollection name="studentForm" property="listInstitution" label="institutionCode" value="institutionCode" />
            				</html:select> 	   						
							 </datalist> --%>
							                                       
                                     <%--  <bean:define id="insitution" name="studentForm" property="insitution"></bean:define>
												<input type="text" id="favGtrPlayer" maxlength="10" style="width: 318px;height: 30px;"   list="GtrPlayers"
												name="institutionCode" value="${insitution}"> 
												<datalist id="GtrPlayers">
												<html:select  styleId="yyy" property="insitution" name="studentForm"
												style="width: 164px;height: 22px;">
												<html:option value=""></html:option>
												<html:optionsCollection name="studentForm"
												property="listInstitution" value="institutionCode" label="institutionCode" />
												</html:select>
												
												</datalist>​
                                        --%>
                                      
                            </div>
                        </div>
                        <div class="row col-sm-12">
                            <label style="    margin-left: -10px;width: 183px; height: 30px;" class="col-sm-2">タイトル</label>
                            <div class="col-sm-2">
                            	<html:text tabindex="2"  styleId="zzz" style="width: 318px;" maxlength="20" styleClass="col-sm-2" property="title1"></html:text>
                            </div>
                        </div>                  
                    </div>
                    <div class="formbutton col-sm-12">
                        <div class="row">
                            <div class="col-sm-6"></div>
                            <div class="col-sm-6 padding-0">
                                <div class="col-sm-3"></div>
                                <div class="col-sm-3 padding-1">
                                   <!--  <input id="search" type="button"   tabindex="3" value="検索(S)" /> -->
                                    <html:submit styleId="search" tabindex="3" style="width:132px;"  value="検索(S)" property="submit"></html:submit>
                                </div>
                                <div class="col-sm-3 padding-1">
                                    <input id="resetSearch"  class="button" style="width:132px;"   tabindex="4" type="button" value="キャンセル(C)" />
                                </div>
                                <div class="col-sm-3 padding-1">
                                    <input onclick="location.href='./152.jsp'" type="button" style="width:132px;" tabindex="5" value="新規登録(N)" />
                                </div>
                            </div>
                        </div>
                    </div>
                   </html:form>
              
            </div>
        </div>
        <logic:notEmpty name="studentForm" property="listStudent">
        <div class="tableUpdate">
            <div class="row">
                <html:form  styleId="form1" styleClass="form col-sm-12" action="/screenStudent" method="post">
               
                    <div class="navigation col-sm-12">
                        <div class="row">
                            <div id="navPage" class="col-sm-12">
                                <label id="currentPage">1</label> /
                                <label id="totalPage">5</label>
                                <label style="font-weight: bold;">ページ</label>
                                <div>
                                    <input onclick="functionPre();" id="backlock" class="navibutton" type="button" value="" />
                                </div>                              
                                <div>
                                    <input onclick="functionNext();" id="next" class="navibutton" type="button" value="" />
                                </div>
                                
                                <label style="font-weight: bold;">ページ</label>
                                <input id="goPage" type="text" value="1" style="width: 50px;" />
                                <input onclick="functionGoPage();" id="resett" type="button" value="表示" class="Japanbutton" />                                                         
                            </div>
                        </div>
                    </div>
                    <div class="mainTable col-sm-12">
                        <div class="table-group">
                            <table class="table table-striped table-bordered" id="datatable" data-page-length='1'>
                                <thead>                                   
                                    <tr>                                    
                                        <th style="display: none;"></th>
                                    </tr>
                                </thead>
                                <tbody>
                                <logic:notEmpty name="studentForm" property="listStudent">
                             
							<logic:iterate name="studentForm" property="listStudent" id="student">
							
                                    <tr>
                                        <td style="padding: 0px;" >
                                            <div class="col-container">
                                                
                                             <div id ="trai" style="padding-left: 20px; padding-top: 3px;" class="col-sm-6" >

                                               <div class="row">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                         <label>名<span style="color: red">(*)</span></label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                      <html:text styleId="ten"  name="student" tabindex="6"  maxlength="20"  style="width: 89%;margin-left: -63px;"  property="firstName"></html:text>
                                                     </div>                                                
                                                </div>
                                                 <div class="row">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                        <label>姓<span style="color: red">(*)</span></label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">                                                  
                                                           <html:text name="student" styleId="ho"  tabindex="7"  maxlength="10"  style="width: 89%;margin-left: -63px;"  property="lastName"></html:text>
                                                    </div>                                              
                                                </div>
                                                <div style="padding-top: 20px;">
                                                <div class="row">
                                                      <div id ="d" class="col-xs-6 col-md-3">
                                                         <label>タイトル<span style="color: red">(*)</span></label>


                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                           <html:text styleClass="titlee" name="student" styleId="title"  tabindex="8"  maxlength="20"  style="width: 89%;margin-left: -63px;"  property="title"></html:text>
                                                     </div>                                                
                                                </div>
                                                <div class="row">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                        <label>機関<span style="color: red">(*)</span></label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">                                                  
                                                    <html:text name="student"  styleId="tochuc" tabindex="8"  maxlength="10"  style="width: 89%;margin-left: -63px;background-color: #DFDFDF;"  readonly="true" property="insitution"></html:text>
                                                    </div>                                              
                                                </div>
                                                <div class="row">
                                                      <div id ="d" class="col-xs-6 col-md-3">
                                                        <label>学生の数<span style="color: red">(*)</span></label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                  		<html:text name="student" styleId="soluong" maxlength="15"  style="text-align: right;width: 89%;margin-left: -63px;background-color: #DFDFDF;"  readonly="true" property="quantity"></html:text>
                                                    </div>                                              
                                                </div>
                                                </div>
                                                <div style="padding-top: 20px;">
                                                <div class="row">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                         <label>電話番号<span style="color: red">(*)</span></label>


                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">                                                       
                                                    		<html:text name="student" styleId="sodienthoai"  tabindex="9"  maxlength="10"  style="text-align: right;width: 89%;margin-left: -63px;"  property="phone"></html:text>
                                                     </div>                                                
                                                </div>
                                                <div class="row">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                        <label>Eメール<span style="color: red">(*)</span></label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">                                             
                                                          <html:text name="student" styleId="email" tabindex="10"  maxlength="30"  style="background-color: #DFDFDF;width: 89%;margin-left: -63px;" readonly="true" property="email"></html:text>
                                                    </div>                                              
                                                </div>
                                                </div>
                                                   <div style="padding-top: 20px; padding-bottom: 5px;">
                                                <div class="row">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                         <label>住所</span></label>


                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                         <!--  <input tabindex="11" maxlength="10"  style="width: 89%;margin-left: -63px;" type="text" name=""> -->
                                                          <html:text name="student" styleId="diachi"  tabindex="11"  maxlength="10"  style="width: 89%;margin-left: -63px;"  property="address"></html:text>
                                                     </div>                                                
                                                </div>
                                                  <div class="row" style="padding-bottom: 3px;">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                        <label>国</label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                        <html:select tabindex="12" name="student"  property="country" style="width: 89%;margin-left: -63px;height: 30px;" onchange="loadVendor(this.value)">
                                                        		
            													<html:optionsCollection name="studentForm" property="listCountry" label="name" value="code" />
            											</html:select>

                                                    </div>                                              
                                                </div>
                                                <div class="row" style="padding-bottom: 3px;">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                        <label>状態<span style="color: red">(*)</span></label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                        <html:select tabindex="12"  property="state" style="width: 89%;margin-left: -63px;height: 30px;" >
                                                        		 <option id="statesss" ></option> -->
            													<html:optionsCollection name="studentForm" property="listStates" label="name" value="name" />
            											</html:select>
                                                      
                                                    </div>                                              
                                                </div>
                                                <div class="row">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                        <label>郵便番号</label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                    <html:text name="student" styleId="zip"  tabindex="14"  maxlength="30"  style="width: 89%;margin-left: -63px;"  property="zipCode"></html:text>
                                                    </div>                                              
                                                </div>
                                                <div class="row" style="padding-bottom: 3px;">
                                                      <div id ="d"  class="col-xs-6 col-md-3">
                                                        <label>都市</label>
                                                      </div>
                                                      <div  class="col-xs-6 col-md-8">
                                                        <html:select tabindex="12"  name="student"   property="city" style="width: 89%;margin-left: -63px;height: 30px;"  styleId="listCity">            											
            											<option id="city"></option>
            											</html:select>
                                                    </div>                                              
                                                </div>
                                                </div>
                                         </div>
                                    	<div class="col-sm-6" style="padding-left: 20px; padding-top: 3px;" >
                                                   <div id="left" class="row">  
                                                        <label >現在のシステム</label>
                                                         <html:select name="student" tabindex="20" property="systemName" onchange="loadSystem(this.value)" >                                                         
            											<option id="systeemm"></option>
            											 <html:optionsCollection name="studentForm" property="listSystems" label="systemName" value="systemName" />
            											</html:select>                                                                              
                                                </div>
                                                 <div id="left" class="row" style="margin-top: -3px;">  
                                                        <label >購入の時間枠</label>
                                                        <html:select  name="student" tabindex="21" styleId="listTime"  property="timePurchase"  >
            											 <%-- <html:optionsCollection name="studentForm" property="listSystems" label="systemName" value="systemName" /> --%>
            											<option id=x></option>	
            											</html:select>  
            											                                                                        
                                                </div>
                                                
                                                 <div id="left" class="row" style="padding-top: 20px;">  
                                                        <label >どこで知りま</label>
                                                          <html:text name="student" styleId="where"  tabindex="22"  maxlength="20"  property="place"></html:text>
                                                          
                                                          
                                                                                            
                                                </div>
                                                <div  id="left" class="row" style="padding-top: 30px;">  
                                                        <label  > コメントや質問</label>
                                                        <!-- <input style="visibility: hidden;" name="student" property="place"  type="text" name=""> -->
                                                          <html:text styleId="xxx" style="visibility: hidden;width:20px;"  name="student" property="studentCode"></html:text> 
                      
                                                          <html:text styleId="gettime" style="visibility: hidden;with=2px;" name="student"  property="timePurchase"></html:text>   
                                                           <html:text styleId="getcity" style="visibility: hidden;width: 2px;" name="student"  property="city"></html:text> 
                                                            <html:text styleId="getstatess" style="visibility: hidden;width: 2px;" name="student"  property="state"></html:text> 
                                                             <html:text styleId="getsystemName" style="visibility: hidden;width: 2px;" name="student"  property="systemName"></html:text>
                                                         <input style="visibility: hidden;width: 1px;" type="text" value="" id="bin"  name="titleeee"/>
                                                         <input style="visibility: hidden;width: 1px;" type="text" value="" id="binn"  name="inss"/>
                                                                                      
                                                </div>
                                                 <div class="" style="padding-top: 18px;padding-left: 11.5%;">  
                                                 	<html:textarea styleId="textarea" style="float: left"  rows="11" cols="56" name="student" property="comment">                                              	
                                                 	</html:textarea>                                                                                                                                                       
                                           </div>                                                                       
                                                </div>                                                                  
                                                </div>                                   
                                   </td>
                                
                                 
                                </tr>
                                </logic:iterate>
                                   </logic:notEmpty>
                                   
                                    <logic:empty name="studentForm" property="listStudent">
                                         <!-- <div>
                                         <span id="faxError"></span>
                                         	<span>該当するデータが存在しません</span>
                                         </div>
                                    -->
                                   </logic:empty>
                                                         
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="formbutton col-sm-12 updateButton">
                        <div class="row">
                            <div class="col-lg-6">
                               
                            </div>
                            <div class="col-lg-6 padding-0">
                                <div class="col-lg-3 padding-0">
                                <html:submit styleId="b" property="submit" style=" margin-left: -72px; width: 149px;" onclick="getTitle();" value="更新(U)" >更新(U)</html:submit> 
                                   
                                </div>
                                <div class="col-lg-3 padding-0">
                                <html:submit styleId="btndelete"  onclick=" return getDate();" style=" margin-left: -52px; width: 149px;" property="submit"   value="削除(D)" >削除(D)</html:submit>                                  
                                </div>
                                <div class="col-lg-3 padding-0">
                                    <input  type="reset" style=" margin-left: -35px; width: 149px;" id="resettt" onclick="clickreset();" tabindex="26" id="reset1"  value="クリアー(R)" />
                                </div>
                                <div class="col-lg-3 padding-0">                     
                                      <html:submit  property="submit" style=" margin-left: -16px; width: 149px;" onclick="getTitle();"  value="エクスポート(E)" >エクスポート(E)</html:submit> 
                                </div>
                            </div>
                        </div>
                    </div>
                </html:form>
            </div>
        </div>
        </logic:notEmpty>
        <!-- <dialog id="deleteDialog" class="dialog">
	         <div class="title-error">
	             <div style="display: inline; text-align: left;">確認してください</div>
	             <div style="display: inline; text-align: right; float: right;">
	                 <img src="images/close.png" onclick="btnNo()"/>
	             </div>
	         </div>
	         <div class="content-error">
	             <span>[CTC000110C] : を削除します。よろしいですか？</span>
	         </div>
	         <div class="accept">
	             <button class="bt" onclick="btnYes()">はい</button>
	             <button class="bt" onclick="btnNo()">いいえ</button>
	         </div>
	     </dialog>  -->
    </div>
</body>
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- DataTables JavaScript -->
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/dataTables.bootstrap.min.js"></script>
<script src="js/dataTables.responsive.js"></script>
<script type="text/javascript" src="js/paginate.js"></script>
<script>

/* $('.tableUpdate').css('display','none'); */
  $(document).ready(function(){
	 $('.error').css('display','none');
	
	
 }) 

$(document).ready(function(){
	var getcity =$('#getcity').val();
	var gettimee = $('#gettime').val();	
	var getstate = $('#getstatess').val();
	var getsystemName = $('#getsystemName').val();
		$('#city').html(getcity);
        $('#x').html(gettimee);
        $('#statesss').html(getstate);
        $('#systeemm').html(getsystemName);
       

});
$("#backlock").click(function(){
	var getcity =$('#getcity').val();
	var gettimee = $('#gettime').val();	
	var getstate = $('#getstatess').val();	
	var getsystemName = $('#getsystemName').val();
		$('#city').html(getcity);
        $('#x').html(gettimee);
        $('#statesss').html(getstate);
        $('#systeemm').html(getsystemName);

});
$("#next").click(function(){
	var getcity =$('#getcity').val();
	var gettimee = $('#gettime').val();	
	var getstate = $('#getstatess').val();
	var getsystemName = $('#getsystemName').val();
		$('#city').html(getcity);
        $('#x').html(gettimee);
        $('#statesss').html(getstate);
        $('#systeemm').html(getsystemName);

});

$("#resetSearch").click(function(){
	$('#zzz').val('');
	$('#yyy').val('');
	

		

});

$('.dataTables_empty').dataTable({
    "oLanguage": {
        "sEmptyTable": "My Custom Message On Empty Table"
    }
});



 /*  $("#departshort").blur(function(e) {
    if($("#departshort").val().trim().length === 0) {
      $("#departshortspan").html('Please input the short description');
      $("#departshortspan").css('color' , 'red');
    } else {
      $("#departshortspan").html('');
    }
  }); 
 
 */
 /* $('#search').click(function(){
	 var x =$('#ten').val();
	 alert(x);
	/*  $('.error').css('display','none'); */

 
 $('#resetSearch').click(function(){
	 $('.error').css('display','none');
 });
 
 $('#search').click(function() {
	 //halfsize search
	 var regexFullsize = new RegExp(/^[^ -~?-?\x00-\x1f\t]+$/u);
	 var titleSearch = $('#zzz').val();
	 var results = true;
     if(regexFullsize.test(titleSearch) && $.trim(titleSearch) != "") {
     	$("#error13").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000340E: {タイトル}には全角数字のみを入力してください。</span><br>');	           
         $('#error13').css('color','black');
         $('.error').css('display','block');
         $('#error13').css('display','block');
        
         $('#zzz').focus();
         results = false;
     }else if(regex.test(ten)){
     	$('#error13').css('display','none');
     }
     return results;
	 
 })
 
	  $(function(){	  
	      $('#b').click(function() {
	    	var regex = /[\u3000-\u303F]|[\u3040-\u309F]|[\u30A0-\u30FF]|s[\uFF00-\uFFEF]|[\u4E00-\u9FAF]|[\u2605-\u2606]|[\u2190-\u2195]|\u203B/g; 
	    	var regexFullsize = new RegExp(/^[^ -~?-?\x00-\x1f\t]+$/u);
	    	var ten = $('#ten').val();
	        var ho = $('#ho').val();
	        var title = $('#title').val();
	        var tochuc = $('#tochuc').val();
	        var soluong = $('#soluong').val();
	        var sodienthoai = $('#sodienthoai').val();
	        var email = $('#email').val();
	        var diachi = $('#diachi').val();
	        var zip = $('#zip').val();
	        var comment = $('#textarea').val();
	        var where = $('#where').val();
	       
	
	        var results = true;
	        if($.trim(ten)== ""){  
	        	$("#error0").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000570E:を入力してください。</span><br>');	           
	            $('#error0').css('color','black');
	            $('.error').css('display','block');
	            $('#error0').css('display','block');
	            $('#ten').css('border', '2px solid red');    
	            if (/^\s+$/.test(  $('#ten').val())) {
	            	$('#ten').val('');
				}			                
	            $('#ten').focus();
	            results = false;
	        }else  if($.trim(ten) != ""){
	        	 $('#ten').css('border', '1px solid #5488bd'); 
	        	$('#error0').css('display','none');
	        
	        }
	        //halfsize title1
	        if($.trim(title) == "" ){
	        	$("#error0").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000570E:を入力してください。</span><br>');	
	            $('#error0').css('color','black');
	            $('.error').css('display','block');
	            $('#error0').css('display','block');
	            $('#title').css('border', '2px solid red'); 
	            if (/^\s+$/.test(  $('#title').val())) {
	            	$('#title').val('');
				}
	            $('#title').focus();
	            results = false;
			 }else  if($.trim(title) != ""){
				/*  $('.titlee').css('border', '1px solid #5488bd'); */
				 $('#error2').css('display','none');
		 
     }				                
	       if(regexFullsize.test(title) && $.trim(title) != "") {
	        	$("#error9").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000340E:には全角数字のみを入力してください。</span><br>');	           
	            $('#error9').css('color','black');
	            $('.error').css('display','block');
	            $('#error9').css('display','block');
	            $('#title').css('border', '2px solid red'); 
	            $('#title').focus();
	            results = false;
	        }else if(!regexFullsize.test(title)){
	        	$('#title').css('border', '1px solid #5488bd'); 
	        	$('#error9').css('display','none');
	        } 
	        //halfsize mazip1
	        if(regexFullsize.test(zip) && $.trim(zip) != "") {
	        	$("#error9").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000340E:には全角数字のみを入力してください。</span><br>');		           
	            $('#error9').css('color','black');
	            $('.error').css('display','block');
	            $('#error9').css('display','block');	 
	            $('#zip').css('border', '2px solid red'); 
	            $('#zip').focus();
	            results = false;
	        }else if(!regexFullsize.test(zip)){
	        	$('#zip').css('border', '1px solid #5488bd'); 
	        	$('#error10').css('display','none');
	        }
	      
	        
	        if($.trim(ho) == ""){
	        	$("#error0").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000570E:を入力してください。</span><br>');		       
	            $('#error0').css('color','black');
	            $('.error').css('display','block');
	            $('#error0').css('display','block');
	            $('#ho').css('border', '2px solid red'); 
	            if (/^\s+$/.test(  $('#ho').val())) {
	            	$('#ho').val('');
				}
	            $('#ho').focus();
	            results = false;
	 }else  if($.trim(ho) != ""){
		 $('#ho').css('border', '1px solid #5488bd'); 
		 $('#error1').css('display','none');		
     }  
	        
	       /*   if(!regex.test(ho) && $.trim(ho) != "") {
	        	$("#error10").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000340E: {姓}には全角数字のみを入力してください。</span><br>');	           
	            $('#error10').css('color','black');
	            $('.error').css('display','block');
	            $('#error10').css('display','block');
	            $('#ho').focus();
	            results = false;
	        }else if(regex.test(ten)){
	        	$('#error10').css('display','none');
	        }   */
	        
	        
	       
	/*         if(tochuc == ""){
	            $('#error').text('CTC000570E: {機関}を入力してください。');
	            $('#tochuc').focus();
	            return false;
	 } */
	        /* if($.trim(soluong) == ""){
	        	$("#error3").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000570E: {姓}を入力してください。</span><br>');	
	            $('#error3').css('color','black');
	            $('.error').css('display','block');
	            $('#soluong').focus();
	            results = false;
	 }else {
		 $("#error3").remove();
		
		 
} */
	  /*       if(email == ""){
	            $('#error').text('CTC000570E: {電話番号}を入力してください。');
	            $('#sodienthoai').focus();
	            return false;
	 } */
	 		
	         if(regexFullsize.test(where) && $.trim(where) != "") {
	        	$("#error9").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000340E:には全角数字のみを入力してください。</span><br>');		           
	            $('#error9').css('color','black');
	            $('.error').css('display','block');
	            $('#error9').css('display','block');
	            $('#where').css('border', '2px solid red'); 
	            $('#where').focus();
	            results = false;
	        }else if(!regexFullsize.test(where)){
	        	$('#where').css('border', '1px solid #5488bd'); 
	        	$('#error11').css('display','none');
	        }    
	        
	 
	        if($.trim(sodienthoai) == ""){
	        	$("#error0").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000570E:を入力してください。</span><br>');	 
	            $('#error0').css('color','black');
	            $('.error').css('display','block');
	            $('#error0').css('display','block');
	            $('#sodienthoai').css('border', '2px solid red'); 
	            if (/^\s+$/.test(  $('#sodienthoai').val())) {
	            	$('#sodienthoai').val('');
				}
	            $('#sodienthoai').focus();
	            results = false;
	 }else  if($.trim(sodienthoai) != ""){
		 $('#sodienthoai').css('border', '1px solid #5488bd'); 	 
		 $('#error4').css('display','none');
     }
	      
	      /*   if($.trim(diachi) == ""){
	        	$("#error5").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000570E: {住所}を入力してください。</span><br>');	
	            $('#error5').css('color','black');
	            $('.error').css('display','block');
	            $('#error5').css('display','block');
	            $('#diachi').focus();
	            results = false;
	 }   else  if($.trim(diachi) != ""){
			$('#error5').css('display','none');
     } */
	     
	        if(regexFullsize.test(diachi) && $.trim(diachi) != "") {
	        	$("#error9").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000340E:には全角数字のみを入力してください。</span><br>');	           
	            $('#error9').css('color','black');
	            $('.error').css('display','block');
	            $('#error9').css('display','block');
	            $('#diachi').css('border', '2px solid red'); 
	            $('#diachi').focus();
	            results = false;
	        }else if(!regexFullsize.test(diachi)){
	        	$('#diachi').css('border', '1px solid #5488bd'); 
	        	$('#error15').css('display','none');
	        }
	       
	        
	        var intRegex = /^\d+$/;	       	        
	        if(!intRegex.test(sodienthoai) && $.trim(sodienthoai) != "") {	        
	        	$("#error12").html('<img style="vertical-align: baseline" src="images/error.png"><span>CTC000470E: {0}には{9}より大きい整数値を入力してください。</span><br>');	           
	            $('#error12').css('color','black');
	            $('.error').css('display','block');
	            $('#error12').css('display','block');
	            $('#sodienthoai').css('border', '2px solid red'); 
	            $('#sodienthoai').focus();
	            results = false;
	        }else if(intRegex.test(sodienthoai)){
	        	$('#sodienthoai').css('border', '1px solid #5488bd'); 
	        	$('#error12').css('display','none');
	        }  
	        
	 return results;
	})
	});
	  
	  
   </script>
<script type="text/javascript">

    var dateObj = new Date();
    var month = ('0' + (dateObj.getMonth() + 1)).slice(-2);
    var date = ('0' + dateObj.getDate()).slice(-2);
    var year = dateObj.getFullYear();
    newdate = year + "年" + month + "月" + date + "日";
    document.getElementById("processDate").innerHTML = newdate
    
    
    function clear(){
   	/*  document.getElementById('xxx').value=""; */
   /* 	var d= document.getElementById('zzz').value; */
   	
   	
   	 }
   
    

 function getDate(){
    	 var elem = document.getElementById('xxx').value;
    	 var ins = document.getElementById('yyy').value;
    	 var state = document.getElementById('zzz').value;
			if (!confirm("CTC000110C: を削除します。よろしいですか？")) {
			    return false;			
			}   
			else {			
				window.location.href = "./screenStudent.do?studentCode="
					+ elem+"insitution="+ins+"state="+state;
			}
    }
    function myFunction2() {
    	var elem = document.getElementById('xxx').value;
    	window.location.href = "./danhSachDepartment.do?studentCode=" + elem;
    }
</script>
<script type="text/javascript">
function loadVendor(idCountry)
{
	$.ajax({
        type: "GET",
        url: "/Mock2_SonNPT/listCity.do",
        //Data to be sent to the server. It is converted to a query string, if not already a string. 
        //For GET-requests, it's appended to the url. For POST-requests, it is sent as Form properties. 
        //Object must be Key/Value pairs
        data: {"idCountry":idCountry}, 
        //use this default content type when sending data to the server, which is fine for most cases.
        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
        //dataType is type of data that you're expecting back from the server
        dataType: "text",        
        success: function(data){
			
        	$("#listCity").html(data);
        },
        error: function(e){
            //alert('Error: ' + e);
        }
    }); 
}
function loadSystem(idSystem)
{
	$.ajax({
        type: "GET",
        url: "/Mock2_SonNPT/listSystems.do",
        //Data to be sent to the server. It is converted to a query string, if not already a string. 
        //For GET-requests, it's appended to the url. For POST-requests, it is sent as Form properties. 
        //Object must be Key/Value pairs
        data: {"idSystem":idSystem}, 
        //use this default content type when sending data to the server, which is fine for most cases.
        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
        //dataType is type of data that you're expecting back from the server
        dataType: "text",        
        success: function(data){
			
        	$("#listTime").html(data);
        },
        error: function(e){
            //alert('Error: ' + e);
        }
    }); 
}
</script>
<script type="text/javascript">
	function getTitle() {
	var titleee = document.getElementById('zzz').value;
	var ins = document.getElementById('yyy').value;
	document.getElementById('bin').value = titleee;
	document.getElementById('binn').value = ins;
	
	
	}
</script>

<script>
	$('#').click(function(){
		document.getElementById("deleteDialog").open = true;
		document.getElementById("page-disable").setAttribute("style",
				"display: block;");
	});
		
</script>
<!-- <script>
	$('#btnDelete').click(function(){
		document.getElementById("deleteDialog").open = true;
		document.getElementById("page-disable").setAttribute("style",
				"display: block;");
		return false;	
	});
	
	function btnYes() {
		var elem = document.getElementById('xxx').value;
   	 var ins = document.getElementById('yyy').value;
   	 var state = document.getElementById('zzz').value;
   	location.href = "./screenStudent.do?studentCode="
		+ elem+"insitution="+ins+"state="+state;
	}

	/* Press No */
	function btnNo() {
		document.getElementById("deleteDialog").open = false;
		document.getElementsByTagName('BODY')[0].removeAttribute("style");
		document.getElementById("page-disable").setAttribute("style",
				"display: none;");
	} 
		
</script> -->
<!-- <script>
	$('#btndelete').click(function(){
		document.getElementById("deleteDialog").open = true;
		document.getElementById("page-disable").setAttribute("style",
				"display: block;");
		return false;	
	});
	
	 function btnYes() {
		var elem = document.getElementById('xxx').value;
   	 	var ins = document.getElementById('yyy').value;
   	 	var state = document.getElementById('zzz').value;   	 	
   		 window.location.href = "./screenStudent.do?studentCode="
			+ elem +"insitution="+ins+"state="+state;
	} 

	/* Press No */
	function btnNo() {
		document.getElementById("deleteDialog").open = false;
		document.getElementsByTagName('BODY')[0].removeAttribute("style");
		document.getElementById("page-disable").setAttribute("style",
				"display: none;");
	} 
		
</script> -->
</html>