/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d5d4
 */

/* ix::WebSocket::setPingInterval(int) */

void __thiscall ix::WebSocket::setPingInterval(WebSocket *this,int param_1)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  *(int *)(this + 0x4a4) = param_1;
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

