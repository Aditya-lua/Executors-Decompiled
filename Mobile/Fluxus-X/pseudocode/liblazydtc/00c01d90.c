/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01d90
 */

/* std::__ndk1::numpunct<char>::~numpunct() */

void __thiscall std::__ndk1::numpunct<char>::~numpunct(numpunct<char> *this)

{
  numpunct_byname<char>::~numpunct_byname((numpunct_byname<char> *)this);
  operator_delete(this,0x30);
  return;
}

