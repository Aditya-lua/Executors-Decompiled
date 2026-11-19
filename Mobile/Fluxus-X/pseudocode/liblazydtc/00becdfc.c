/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00becdfc
 */

/* std::__ndk1::moneypunct_byname<char, false>::do_thousands_sep() const */

moneypunct_byname<char,false> __thiscall
std::__ndk1::moneypunct_byname<char,false>::do_thousands_sep(moneypunct_byname<char,false> *this)

{
  return this[0x11];
}

