/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01ed8
 */

/* std::__ndk1::numpunct<char>::do_truename() const */

void __thiscall std::__ndk1::numpunct<char>::do_truename(numpunct<char> *this)

{
  undefined1 *in_x8;
  
  in_x8[5] = 0;
  *in_x8 = 8;
  *(undefined4 *)(in_x8 + 1) = 0x65757274;
  return;
}

