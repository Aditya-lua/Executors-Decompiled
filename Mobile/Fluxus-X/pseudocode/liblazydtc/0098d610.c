/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d610
 */

/* ix::WebSocket::getPingInterval() const */

undefined4 __thiscall ix::WebSocket::getPingInterval(WebSocket *this)

{
  undefined4 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  uVar1 = *(undefined4 *)(this + 0x4a4);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return uVar1;
}

