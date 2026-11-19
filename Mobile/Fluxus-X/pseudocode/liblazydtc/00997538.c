/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997538
 */

/* ix::WebSocketTransport::getReadyState() const */

undefined4 __thiscall ix::WebSocketTransport::getReadyState(WebSocketTransport *this)

{
  return *(undefined4 *)(this + 0xe0);
}

