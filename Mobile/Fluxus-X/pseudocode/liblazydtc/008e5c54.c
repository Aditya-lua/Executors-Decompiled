/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e5c54
 */

/* cpr::AcceptEncoding::empty() const */

bool __thiscall cpr::AcceptEncoding::empty(AcceptEncoding *this)

{
  return *(long *)(this + 0x18) == 0;
}

