/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcb1c
 */

/* std::__ndk1::ctype<char>::ctype(unsigned long const*, bool, unsigned long) */

void __thiscall
std::__ndk1::ctype<char>::ctype(ctype<char> *this,ulong *param_1,bool param_2,ulong param_3)

{
  *(ulong *)(this + 8) = param_3 - 1;
  *(ulong **)(this + 0x10) = param_1;
  this[0x18] = (ctype<char>)param_2;
  *(undefined ***)this = &PTR__ctype_00cad5d8;
  if (param_1 == (ulong *)0x0) {
    *(undefined **)(this + 0x10) = &DAT_0078a8e8;
    return;
  }
  return;
}

