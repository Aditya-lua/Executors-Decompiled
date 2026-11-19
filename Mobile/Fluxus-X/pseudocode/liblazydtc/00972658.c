/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00972658
 */

/* ix::HttpClient::setTLSOptions(ix::SocketTLSOptions const&) */

void __thiscall ix::HttpClient::setTLSOptions(HttpClient *this,SocketTLSOptions *param_1)

{
  SocketTLSOptions::operator=((SocketTLSOptions *)(this + 0xd0),param_1);
  return;
}

