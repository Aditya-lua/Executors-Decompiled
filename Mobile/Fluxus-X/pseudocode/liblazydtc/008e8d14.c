/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8d14
 */

/* cpr::Cookies::operator[](unsigned long) */

long __thiscall cpr::Cookies::operator[](Cookies *this,ulong param_1)

{
  return *(long *)(this + 8) + param_1 * 0x78;
}

