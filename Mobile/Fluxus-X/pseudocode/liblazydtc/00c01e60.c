/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01e60
 */

/* std::__ndk1::numpunct<char>::do_thousands_sep() const */

numpunct<char> __thiscall std::__ndk1::numpunct<char>::do_thousands_sep(numpunct<char> *this)

{
  return this[0x11];
}

