/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb83c
 */

/* std::__ndk1::locale::facet::~facet() */

void __thiscall std::__ndk1::locale::facet::~facet(facet *this)

{
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
  operator_delete(this,0x10);
  return;
}

