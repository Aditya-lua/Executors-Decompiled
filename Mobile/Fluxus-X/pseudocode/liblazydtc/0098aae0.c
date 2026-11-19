/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098aae0
 */

/* ix::SocketServer::setTLSOptions(ix::SocketTLSOptions const&) */

void __thiscall ix::SocketServer::setTLSOptions(SocketServer *this,SocketTLSOptions *param_1)

{
  SocketTLSOptions::operator=((SocketTLSOptions *)(this + 0x150),param_1);
  return;
}

