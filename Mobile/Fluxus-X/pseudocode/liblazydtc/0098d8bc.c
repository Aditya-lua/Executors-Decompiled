/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d8bc
 */

/* ix::WebSocket::getMinWaitBetweenReconnectionRetries() const */

undefined4 __thiscall ix::WebSocket::getMinWaitBetweenReconnectionRetries(WebSocket *this)

{
  undefined4 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  uVar1 = *(undefined4 *)(this + 0x440);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return uVar1;
}

