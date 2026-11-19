/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc4f0
 */

/* std::__ndk1::ctype<wchar_t>::~ctype() */

void __thiscall std::__ndk1::ctype<wchar_t>::~ctype(ctype<wchar_t> *this)

{
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
  operator_delete(this,0x10);
  return;
}

