/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01e54
 */

/* std::__ndk1::numpunct<wchar_t>::do_decimal_point() const */

undefined4 __thiscall std::__ndk1::numpunct<wchar_t>::do_decimal_point(numpunct<wchar_t> *this)

{
  return *(undefined4 *)(this + 0x10);
}

