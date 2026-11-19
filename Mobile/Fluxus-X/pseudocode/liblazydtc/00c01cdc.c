/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01cdc
 */

/* std::__ndk1::numpunct<char>::numpunct(unsigned long) */

void __thiscall std::__ndk1::numpunct<char>::numpunct(numpunct<char> *this,ulong param_1)

{
  *(undefined2 *)(this + 0x10) = 0x2c2e;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined ***)this = &PTR__numpunct_byname_00cad790;
  *(ulong *)(this + 8) = param_1 - 1;
  return;
}

