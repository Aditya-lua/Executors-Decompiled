/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02734
 */

/* std::__ndk1::numpunct_byname<wchar_t>::~numpunct_byname() */

void __thiscall
std::__ndk1::numpunct_byname<wchar_t>::~numpunct_byname(numpunct_byname<wchar_t> *this)

{
  ~numpunct_byname(this);
  operator_delete(this,0x30);
  return;
}

