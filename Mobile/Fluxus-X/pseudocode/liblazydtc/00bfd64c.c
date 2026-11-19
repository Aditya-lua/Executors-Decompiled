/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd64c
 */

/* std::__ndk1::ctype_byname<wchar_t>::~ctype_byname() */

void __thiscall std::__ndk1::ctype_byname<wchar_t>::~ctype_byname(ctype_byname<wchar_t> *this)

{
  ~ctype_byname(this);
  operator_delete(this,0x18);
  return;
}

