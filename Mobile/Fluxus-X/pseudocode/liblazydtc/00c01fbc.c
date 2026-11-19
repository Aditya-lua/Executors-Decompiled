/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01fbc
 */

/* std::__ndk1::numpunct<char>::do_falsename() const */

void __thiscall std::__ndk1::numpunct<char>::do_falsename(numpunct<char> *this)

{
  undefined1 *in_x8;
  
  *in_x8 = 10;
  *(undefined4 *)(in_x8 + 1) = 0x736c6166;
  *(undefined2 *)(in_x8 + 5) = 0x65;
  return;
}

