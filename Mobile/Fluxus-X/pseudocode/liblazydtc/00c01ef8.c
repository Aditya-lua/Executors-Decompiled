/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01ef8
 */

/* std::__ndk1::numpunct<wchar_t>::do_truename() const */

void __thiscall std::__ndk1::numpunct<wchar_t>::do_truename(numpunct<wchar_t> *this)

{
  undefined1 *in_x8;
  
  *in_x8 = 8;
  *(undefined4 *)(in_x8 + 0x14) = 0;
  *(undefined8 *)(in_x8 + 0xc) = 0x6500000075;
  *(undefined8 *)(in_x8 + 4) = 0x7200000074;
  return;
}

