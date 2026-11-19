/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009844f0
 */

/* ix::Socket::~Socket() */

void __thiscall ix::Socket::~Socket(Socket *this)

{
  ~Socket(this);
  operator_delete(this);
  return;
}

