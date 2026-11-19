/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997680
 */

/* ix::WebSocketTransport::pingIntervalExceeded() */

bool __thiscall ix::WebSocketTransport::pingIntervalExceeded(WebSocketTransport *this)

{
  long lVar1;
  bool bVar2;
  
  if (*(int *)(this + 0x27c) < 1) {
    bVar2 = false;
  }
  else {
    std::__ndk1::mutex::lock((mutex *)(this + 0x2b0));
    lVar1 = std::__ndk1::chrono::steady_clock::now();
    bVar2 = (long)*(int *)(this + 0x27c) * 1000000000 < lVar1 - *(long *)(this + 0x2d8);
    std::__ndk1::mutex::unlock((mutex *)(this + 0x2b0));
  }
  return bVar2;
}

