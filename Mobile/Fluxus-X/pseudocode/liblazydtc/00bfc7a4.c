/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc7a4
 */

/* std::__ndk1::ctype<wchar_t>::do_tolower(wchar_t) const */

wchar_t __thiscall std::__ndk1::ctype<wchar_t>::do_tolower(ctype<wchar_t> *this,wchar_t param_1)

{
  int iVar1;
  
  if ((uint)param_1 < 0x80) {
    if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00bfc804 to 00bfc817 has its CatchHandler @ 00bfc830 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    if (0xffffffe5 < (uint)(param_1 + L'\xffffffa5')) {
      param_1 = param_1 + L' ';
    }
  }
  return param_1;
}

