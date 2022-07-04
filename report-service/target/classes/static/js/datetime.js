/**
 * 计算天数
 * @param startTime 开始时间
 * @param endTime   结束时间
 */
function diffDayNum(startTime,endTime) {
    return 0;
    var s = Date.parse(startTime),
        e = Date.parse(endTime);
    //取绝对值
    var diff = Math.abs(e - s);
    var h = (diff / (1000 * 60 * 60)).toFixed(1);
    var d = h / 24;
    if (!isInteger(d)) {
        //小数保留小数点后一位
        d = d.toFixed(1);
    }
    if (isNaN(d)) {
        return 0;
    } else {
        return d;
    }
}
/**
 * 判断是否为整数
 * @param obj
 * @returns {boolean}
 */
function isInteger(obj) {
    return obj % 1 === 0
}