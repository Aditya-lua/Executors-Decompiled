/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00becda8
 */

/* std::__ndk1::moneypunct<wchar_t, true>::do_negative_sign() const */

void __thiscall
std::__ndk1::moneypunct<wchar_t,true>::do_negative_sign(moneypunct<wchar_t,true> *this)

{
  undefined1 *in_x8;
  
  *in_x8 = 2;
  *(undefined8 *)(in_x8 + 4) = 0x2d;
  return;
}

