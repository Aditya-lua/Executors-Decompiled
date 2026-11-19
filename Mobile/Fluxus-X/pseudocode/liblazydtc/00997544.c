/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997544
 */

/* ix::WebSocketTransport::getCloseReason() const */

WebSocketTransport * __thiscall ix::WebSocketTransport::getCloseReason(WebSocketTransport *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x138));
  std::__ndk1::mutex::unlock((mutex *)(this + 0x138));
  return this + 0x120;
}

