/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beceec
 */

/* std::__ndk1::moneypunct_byname<char, true>::do_decimal_point() const */

moneypunct_byname<char,true> __thiscall
std::__ndk1::moneypunct_byname<char,true>::do_decimal_point(moneypunct_byname<char,true> *this)

{
  return this[0x10];
}

