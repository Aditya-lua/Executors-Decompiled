/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098fdc0
 */

/* ix::WebSocket::sendUtf8Text(ix::IXWebSocketSendData const&, std::__ndk1::function<bool (int,
   int)> const&) */

void __thiscall
ix::WebSocket::sendUtf8Text(WebSocket *this,IXWebSocketSendData *param_1,function *param_2)

{
  sendMessage(this,param_1,0,param_2);
  return;
}

