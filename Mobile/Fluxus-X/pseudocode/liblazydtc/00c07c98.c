/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c07c98
 */

/* std::__ndk1::ctype_byname<wchar_t>::~ctype_byname() */

void __thiscall std::__ndk1::ctype_byname<wchar_t>::~ctype_byname(ctype_byname<wchar_t> *this)

{
  *(undefined ***)this = &PTR__ctype_byname_00cad6a8;
                    /* try { // try from 00c07cc0 to 00c07cc3 has its CatchHandler @ 00c07cd8 */
  freelocale(*(__locale_t *)(this + 0x10));
  codecvt<char,char,mbstate_t>::~codecvt((codecvt<char,char,mbstate_t> *)this);
  return;
}

