/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc6d4
 */

/* std::__ndk1::ctype<wchar_t>::do_toupper(wchar_t*, wchar_t const*) const */

wchar_t * __thiscall
std::__ndk1::ctype<wchar_t>::do_toupper(ctype<wchar_t> *this,wchar_t *param_1,wchar_t *param_2)

{
  uint uVar1;
  int iVar2;
  wchar_t wVar3;
  
  for (; param_1 != param_2; param_1 = param_1 + 1) {
    wVar3 = *param_1;
    if ((uint)wVar3 < 0x80) {
      if (((DAT_00d270f8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d270f8), iVar2 != 0)) {
                    /* try { // try from 00bfc754 to 00bfc75f has its CatchHandler @ 00bfc78c */
        DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
        __cxa_guard_release(&DAT_00d270f8);
      }
      uVar1 = wVar3 + L'\xffffff85';
      wVar3 = *param_1;
      if (0xffffffe5 < uVar1) {
        wVar3 = *param_1 + L'\xffffffe0';
      }
    }
    *param_1 = wVar3;
  }
  return param_1;
}

