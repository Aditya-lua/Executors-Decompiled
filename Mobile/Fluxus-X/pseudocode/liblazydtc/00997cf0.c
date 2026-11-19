/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997cf0
 */

/* ix::WebSocketTransport::sendBinary(ix::IXWebSocketSendData const&, std::__ndk1::function<bool
   (int, int)> const&) */

void __thiscall
ix::WebSocketTransport::sendBinary
          (WebSocketTransport *this,IXWebSocketSendData *param_1,function *param_2)

{
  sendData(this,2,param_1,(byte)this[0x185] & 1,param_2);
  return;
}

