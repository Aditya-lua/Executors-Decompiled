/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00998370
 */

/* ix::WebSocketTransport::closeSocket() */

void __thiscall ix::WebSocketTransport::closeSocket(WebSocketTransport *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
                    /* try { // try from 00998398 to 0099839b has its CatchHandler @ 009983ac */
  (**(code **)(**(long **)(this + 0xb0) + 0x20))();
  std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
  return;
}

