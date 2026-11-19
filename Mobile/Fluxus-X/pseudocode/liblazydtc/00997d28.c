/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997d28
 */

/* ix::WebSocketTransport::closingDelayExceeded() */

bool __thiscall ix::WebSocketTransport::closingDelayExceeded(WebSocketTransport *this)

{
  long lVar1;
  long lVar2;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x244));
  lVar1 = std::__ndk1::chrono::steady_clock::now();
  lVar2 = *(long *)(this + 0x270);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x244));
  return 300000000 < lVar1 - lVar2;
}

