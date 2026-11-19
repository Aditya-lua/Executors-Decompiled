/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfdc24
 */

/* std::__ndk1::ctype_byname<wchar_t>::do_tolower(wchar_t) const */

wint_t __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_tolower(ctype_byname<wchar_t> *this,wchar_t param_1)

{
  wint_t wVar1;
  
  wVar1 = towlower_l(param_1,*(__locale_t *)(this + 0x10));
  return wVar1;
}

