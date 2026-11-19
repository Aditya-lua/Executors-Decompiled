/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d648
 */

/* ix::WebSocket::enablePong() */

void __thiscall ix::WebSocket::enablePong(WebSocket *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  this[0x4a0] = (WebSocket)0x1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

