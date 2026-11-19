/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd1d8
 */

/* std::__ndk1::ctype_byname<char>::~ctype_byname() */

void __thiscall std::__ndk1::ctype_byname<char>::~ctype_byname(ctype_byname<char> *this)

{
  ~ctype_byname(this);
  operator_delete(this,0x28);
  return;
}

