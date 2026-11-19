/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098e340
 */

/* ix::WebSocket::getSubProtocols() */

WebSocket * __thiscall ix::WebSocket::getSubProtocols(WebSocket *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return this + 0x4d0;
}

