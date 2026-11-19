/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfde28
 */

/* std::__ndk1::ctype_byname<wchar_t>::do_narrow(wchar_t const*, wchar_t const*, char, char*) const
    */

wchar_t * __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_narrow
          (ctype_byname<wchar_t> *this,wchar_t *param_1,wchar_t *param_2,char param_3,char *param_4)

{
  uint uVar1;
  wchar_t __c;
  uint uVar2;
  __locale_t __dataset;
  
  if (param_1 != param_2) {
    do {
      __c = *param_1;
      __dataset = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfde90 to 00bfde97 has its CatchHandler @ 00bfded0 */
      uVar2 = wctob(__c);
      if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00bfdea0 to 00bfdea7 has its CatchHandler @ 00bfdecc */
        uselocale(__dataset);
      }
      param_1 = param_1 + 1;
      uVar1 = (uint)(byte)param_3;
      if (uVar2 != 0xffffffff) {
        uVar1 = uVar2;
      }
      *param_4 = (char)uVar1;
      param_4 = param_4 + 1;
    } while (param_1 != param_2);
  }
  return param_1;
}

