/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01c7c
 */

/* std::__ndk1::__widen_from_utf8<16ul>::~__widen_from_utf8() */

void __thiscall
std::__ndk1::__widen_from_utf8<16ul>::~__widen_from_utf8(__widen_from_utf8<16ul> *this)

{
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
  operator_delete(this,0x10);
  return;
}

