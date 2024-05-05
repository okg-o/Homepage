'use strict'

const elmSubmit = document.getElementById("ID_SUBMIT");
elmSubmit.onclick = function(){
	const elmName   = document.getElementById("name");
  const elmEmail   = document.getElementById("email");
  const elmMessage = document.getElementById("message");
  if(elmName.value == ""||elmEmail.value == ""|| elmMessage.value == ""){
    alert("不正な入力項目があります。");
    return false;
  }
}

const inputText = document.getElementById('message');
message.addEventListener('keyup', keyUp, false);
function keyUp() {
  let str = message.value; 
  let num = 500 - str.length;
  const characterCount = document.getElementById('characterCount');
  characterCount.textContent = num;
}
