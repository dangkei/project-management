/* 扩展layui 第二步，创建扩展文件 */
layui.define(['form','layer'],function(exports){ //提示：模块也可以依赖其它模块，如：layui.define('layer', callback);
  var obj = {
    
    getFormValJSON:function(form){
		JSON.stringify(form);
	},
    
    hello: function(form){
    //如果str为空的话，弹出“Hello index”
      alert('Hello '+ (str||'index'));
    }
  };
  
  //输出接口
  exports('formExt', obj); //引用模块的名称formExt
});    
