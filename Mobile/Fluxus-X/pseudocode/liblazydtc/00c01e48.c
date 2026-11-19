/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01e48
 */

/* std::__ndk1::numpunct<char>::do_decimal_point() const */

numpunct<char> __thiscall std::__ndk1::numpunct<char>::do_decimal_point(numpunct<char> *this)

{
  return this[0x10];
}

