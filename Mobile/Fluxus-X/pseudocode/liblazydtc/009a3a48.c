/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3a48
 */

/* ix::SocketOpenSSL::~SocketOpenSSL() */

void __thiscall ix::SocketOpenSSL::~SocketOpenSSL(SocketOpenSSL *this)

{
  ~SocketOpenSSL(this);
  operator_delete(this);
  return;
}

