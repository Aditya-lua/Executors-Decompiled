/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d67c
 */

/* ix::WebSocket::disablePong() */

void __thiscall ix::WebSocket::disablePong(WebSocket *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  this[0x4a0] = (WebSocket)0x0;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

