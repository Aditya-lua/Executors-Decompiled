/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfdbcc
 */

/* std::__ndk1::ctype_byname<wchar_t>::do_toupper(wchar_t*, wchar_t const*) const */

wchar_t * __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_toupper
          (ctype_byname<wchar_t> *this,wchar_t *param_1,wchar_t *param_2)

{
  wchar_t wVar1;
  
  for (; param_1 != param_2; param_1 = param_1 + 1) {
    wVar1 = towupper_l(*param_1,*(__locale_t *)(this + 0x10));
    *param_1 = wVar1;
  }
  return param_1;
}

