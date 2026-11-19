/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01e18
 */

/* std::__ndk1::numpunct<wchar_t>::~numpunct() */

void __thiscall std::__ndk1::numpunct<wchar_t>::~numpunct(numpunct<wchar_t> *this)

{
  numpunct_byname<wchar_t>::~numpunct_byname((numpunct_byname<wchar_t> *)this);
  operator_delete(this,0x30);
  return;
}

