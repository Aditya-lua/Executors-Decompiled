/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00becc08
 */

/* std::__ndk1::moneypunct<char, false>::do_negative_sign() const */

void __thiscall std::__ndk1::moneypunct<char,false>::do_negative_sign(moneypunct<char,false> *this)

{
  undefined2 *in_x8;
  
  *(undefined1 *)(in_x8 + 1) = 0;
  *in_x8 = 0x2d02;
  return;
}

