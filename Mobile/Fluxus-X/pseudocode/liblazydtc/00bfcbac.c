/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcbac
 */

/* std::__ndk1::ctype<char>::~ctype() */

void __thiscall std::__ndk1::ctype<char>::~ctype(ctype<char> *this)

{
  ~ctype(this);
  operator_delete(this,0x20);
  return;
}

