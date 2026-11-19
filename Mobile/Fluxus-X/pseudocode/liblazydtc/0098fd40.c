/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098fd40
 */

/* ix::WebSocket::sendBinary(ix::IXWebSocketSendData const&, std::__ndk1::function<bool (int, int)>
   const&) */

void __thiscall
ix::WebSocket::sendBinary(WebSocket *this,IXWebSocketSendData *param_1,function *param_2)

{
  sendMessage(this,param_1,1,param_2);
  return;
}

