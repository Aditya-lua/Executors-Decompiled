/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d418
 */

/* ix::WebSocket::getPerMessageDeflateOptions() const */

ulong __thiscall ix::WebSocket::getPerMessageDeflateOptions(WebSocket *this)

{
  uint5 uVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  uVar1 = *(uint5 *)(this + 0x310);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return (ulong)uVar1;
}

