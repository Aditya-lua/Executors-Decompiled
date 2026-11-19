/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d3c0
 */

/* ix::WebSocket::setTLSOptions(ix::SocketTLSOptions const&) */

void __thiscall ix::WebSocket::setTLSOptions(WebSocket *this,SocketTLSOptions *param_1)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
                    /* try { // try from 0098d3e8 to 0098d3ef has its CatchHandler @ 0098d404 */
  SocketTLSOptions::operator=((SocketTLSOptions *)(this + 0x318),param_1);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

