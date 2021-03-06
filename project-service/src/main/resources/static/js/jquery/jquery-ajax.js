
/**
 * ajax的get请求
 * @param {Object} url			 请求的url
 * @param {Object} params		 参数
 * @param {Object} succCallBack	 执行成功的回调函数
 * @param {Object} errorCallBack 执行失败的回调函数
 */
var fAjaxGet = function(url, params, succCallBack, errorCallBack){
	$.ajax({
		type 	: "get",
		url  	: url+"?ajax=1",
		data 	: params || {},
		dataType: "json",
		async 	: false,
		success : function(obj) {
			if($.isFunction(succCallBack)){
				succCallBack(obj);
			}
		},
		error 	: function(obj) {
			if($.isFunction(errorCallBack)){
				errorCallBack(obj);
			}else{
				layerCommonUtil.error();
				//ArtMsgIFrame.Error(obj.error || ArtMsg.Msg.Operate_Error);
			}
		}
	});	
}
var fAjaxAsyncGet = function(url, params, succCallBack, errorCallBack){
	$.ajax({
		type 	: "get",
		url  	: url+"?ajax=1",
		data 	: params || {},
		dataType: "json",
		async 	: true,
		success : function(obj) {
			if($.isFunction(succCallBack)){
				succCallBack(obj);
			}
		},
		error 	: function(obj) {
			if($.isFunction(errorCallBack)){
				errorCallBack(obj);
			}else{
				layerCommonUtil.error();
				//ArtMsgIFrame.Error(obj.error || ArtMsg.Msg.Operate_Error);
			}
		}
	});	
}
/**
 * ajax的post请求
 * @param {Object} url			 请求的url
 * @param {Object} params		 参数
 * @param {Object} succCallBack	 执行成功的回调函数
 * @param {Object} errorCallBack 执行失败的回调函数
 */
var fAjaxPost = function(url, params, succCallBack, errorCallBack){
	$.ajax({
		type 	: "post",
		url  	: url+"?ajax=1",
		data 	: params || {},
		dataType: "json",
		async 	: false,
		success : function(obj) {
			if($.isFunction(succCallBack)){
				succCallBack(obj);
			}
		},
		error 	: function(obj) {
			if($.isFunction(errorCallBack)){
				errorCallBack(obj);
			}else{
				layerCommonUtil.error();
				//ArtMsgIFrame.Error(obj.error || ArtMsg.Msg.Operate_Error);
			}
		}
	});
}
var fAjaxAsyncPost = function(url, params, succCallBack, errorCallBack){
	$.ajax({
		type 	: "post",
		url  	: url+"?ajax=1",
		data 	: params || {},
		dataType: "json",
		async 	: true,
		cache	: false,
		success : function(obj) {
			if($.isFunction(succCallBack)){
				succCallBack(obj);
			}
		},
		error 	: function(obj) {
			if($.isFunction(errorCallBack)){
				errorCallBack(obj);
			}else{
				layerCommonUtil.error();
				//ArtMsgIFrame.Error(obj.error || ArtMsg.Msg.Operate_Error);
				
			}
		}
	});
}
/**
 * ajax的post请求 请求参数为JSON 配合Spring MVC 的@RequestBody
 * @param {Object} url			 请求的url
 * @param {Object} params		 参数
 * @param {Object} succCallBack	 执行成功的回调函数
 * @param {Object} errorCallBack 执行失败的回调函数
 */
var fAjaxPostJson = function(url, params, succCallBack, errorCallBack){
	$.ajax({
		type 	: "post",
		url  	: url+"?ajax=1",
		data : JSON.stringify(params || {}),
		contentType: "application/json",
		dataType: "json",
		async 	: false,
		success : function(obj) {
			if($.isFunction(succCallBack)){
				succCallBack(obj);
			}
		},
		error 	: function(obj) {
			if($.isFunction(errorCallBack)){
				errorCallBack(obj);
			}else{
				layerCommonUtil.error();
				//ArtMsgIFrame.Error(obj.error || ArtMsg.Msg.Operate_Error);
			}
		}
	});
}