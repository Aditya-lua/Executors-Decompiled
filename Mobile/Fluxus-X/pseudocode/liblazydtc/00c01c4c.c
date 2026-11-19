/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01c4c
 */

/* std::__ndk1::__narrow_to_utf8<32ul>::~__narrow_to_utf8() */

void __thiscall std::__ndk1::__narrow_to_utf8<32ul>::~__narrow_to_utf8(__narrow_to_utf8<32ul> *this)

{
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
  operator_delete(this,0x10);
  return;
}

