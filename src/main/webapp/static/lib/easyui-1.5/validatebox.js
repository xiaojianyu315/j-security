//扩展easyui表单的验证
$.extend($.fn.validatebox.defaults.rules, {
    //验证汉字
    chinese: {
        validator: function (value) {
            return /^[\u0391-\uFFE5]+$/.test(value);
        },
        message: '请输入汉字'
    },
    //移动手机号码验证
    mobile: {//value值为文本框中的值
        validator: function (value) {
            var reg = /^1[3|4|5|8|9|7]\d{9}$/;
            return reg.test(value);
        },
        message: '请输入正确手机号'
    },
    //国内邮编验证
    zipCode: {
        validator: function (value) {
            var reg = /^[0-9]\d{5}$/;
            return reg.test(value);
        },
        message: '请输入6位邮政编码'
    },
    //数字
    number: {
        validator: function (value) {
            var reg =/^[0-9]*$/;
            return reg.test(value);
        },
        message: '请输入数字'
    },
    //最大长度限制
    maxlength: {
        validator: function (value,param) {
            return param[0] >= value.length;
        },
        message: '最多输入{0}位字符'
    },
    //最小长度限制
    minlength: {
        validator: function (value,param) {
            return param[0] <= value.length;
        },
        message: '最少输入{0}位字符'
    },

    //最小长度限制
    length: {
        validator: function(value, param){
            return value.length >= param[0] && param[1] >= value.length;
        },
        message: '请输入{0}-{1}位字符.'
    },
})