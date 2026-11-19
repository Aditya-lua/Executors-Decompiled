/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d378
 */

/* ix::WebSocket::setPerMessageDeflateOptions(ix::WebSocketPerMessageDeflateOptions const&) */

void __thiscall
ix::WebSocket::setPerMessageDeflateOptions
          (WebSocket *this,WebSocketPerMessageDeflateOptions *param_1)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  this[0x314] = *(WebSocket *)(param_1 + 4);
  *(undefined4 *)(this + 0x310) = *(undefined4 *)param_1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

