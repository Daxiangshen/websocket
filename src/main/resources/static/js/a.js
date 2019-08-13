var ws = new WebSocket("ws://139.199.29.250:8001/websocket");

  ws.onopen = function (e) {
    console.log('Connection to server opened');
  }

  function sendMessage() {
    ws.send($('#message').val());
  }

    ws.onmessage = function (evt) {
	  var received_msg = evt.data;
	  alert(received_msg);
   };

   ws.onclose = function(){
	  // 关闭 websocket
	  alert("连接已关闭...");
   };

	ws.onerror = function(err) {

		alert("Error: " + err);
	};