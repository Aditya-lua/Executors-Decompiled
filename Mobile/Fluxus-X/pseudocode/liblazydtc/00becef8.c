/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00becef8
 */

/* std::__ndk1::moneypunct_byname<char, true>::do_thousands_sep() const */

moneypunct_byname<char,true> __thiscall
std::__ndk1::moneypunct_byname<char,true>::do_thousands_sep(moneypunct_byname<char,true> *this)

{
  return this[0x11];
}

