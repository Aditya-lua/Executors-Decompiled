/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d884
 */

/* ix::WebSocket::getMaxWaitBetweenReconnectionRetries() const */

undefined4 __thiscall ix::WebSocket::getMaxWaitBetweenReconnectionRetries(WebSocket *this)

{
  undefined4 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  uVar1 = *(undefined4 *)(this + 0x43c);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return uVar1;
}

