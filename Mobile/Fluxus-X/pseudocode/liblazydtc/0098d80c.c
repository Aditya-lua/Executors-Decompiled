/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d80c
 */

/* ix::WebSocket::setMaxWaitBetweenReconnectionRetries(unsigned int) */

void __thiscall ix::WebSocket::setMaxWaitBetweenReconnectionRetries(WebSocket *this,uint param_1)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  *(uint *)(this + 0x43c) = param_1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

