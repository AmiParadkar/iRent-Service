var s = "kayak";
function plandrioum(s){
	var mid_index = Math.round(s.length/2);
	var first_str = s.substring(0,(mid_index-1));
	var last_str = s.substring(mid_index,s.lenght-1);
	
	console.log(mid_index);
	console.log(first_str);
	console.log(last_str);
}

function sum(x){
	return function(y){
			return x+y;}
	
}

function addButton(){
for (var i = 0; i < 5; i++) {
	  var btn = document.createElement('button');
	  btn.appendChild(document.createTextNode('Button ' + i));
	  btn.addEventListener('click', function(){ console.log(i); });
	  document.body.appendChild(btn);
	}
}

var arr1 = "john".split('');
var arr2 = arr1.reverse();
var arr3 = "jones".split('');
arr2.push(arr3);
console.log("array 1: length=" + arr1.length + " last=" + arr1.slice(-1));
console.log("array 2: length=" + arr2.length + " last=" + arr2.slice(-1));