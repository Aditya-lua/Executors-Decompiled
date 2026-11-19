/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009983c0
 */

/* ix::WebSocketTransport::isSendBufferEmpty() const */

bool __thiscall ix::WebSocketTransport::isSendBufferEmpty(WebSocketTransport *this)

{
  long lVar1;
  long lVar2;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x68));
  lVar1 = *(long *)(this + 0x50);
  lVar2 = *(long *)(this + 0x58);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x68));
  return lVar1 == lVar2;
}

