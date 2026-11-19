/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997d0c
 */

/* ix::WebSocketTransport::sendText(ix::IXWebSocketSendData const&, std::__ndk1::function<bool (int,
   int)> const&) */

void __thiscall
ix::WebSocketTransport::sendText
          (WebSocketTransport *this,IXWebSocketSendData *param_1,function *param_2)

{
  sendData(this,1,param_1,(byte)this[0x185] & 1,param_2);
  return;
}

