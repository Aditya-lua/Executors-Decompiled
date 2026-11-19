/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff328
 */

/* std::__ndk1::codecvt<char32_t, char, mbstate_t>::~codecvt() */

void __thiscall
std::__ndk1::codecvt<char32_t,char,mbstate_t>::~codecvt(codecvt<char32_t,char,mbstate_t> *this)

{
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
  operator_delete(this,0x10);
  return;
}

