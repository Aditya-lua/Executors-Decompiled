/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef788
 */

/* cpr::Session::ResponseStringReserve(unsigned long) */

void __thiscall cpr::Session::ResponseStringReserve(Session *this,ulong param_1)

{
  *(ulong *)(this + 0x240) = param_1;
  return;
}

