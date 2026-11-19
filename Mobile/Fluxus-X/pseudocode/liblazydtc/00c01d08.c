/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01d08
 */

/* std::__ndk1::numpunct<wchar_t>::numpunct(unsigned long) */

void __thiscall std::__ndk1::numpunct<wchar_t>::numpunct(numpunct<wchar_t> *this,ulong param_1)

{
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0x2c0000002e;
  *(undefined ***)this = &PTR__numpunct_byname_00cad7e0;
  *(ulong *)(this + 8) = param_1 - 1;
  return;
}

