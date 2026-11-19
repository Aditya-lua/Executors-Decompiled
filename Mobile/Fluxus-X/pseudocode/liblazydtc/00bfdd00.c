/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfdd00
 */

/* std::__ndk1::ctype_byname<wchar_t>::do_widen(char const*, char const*, wchar_t*) const */

byte * __thiscall
std::__ndk1::ctype_byname<wchar_t>::do_widen
          (ctype_byname<wchar_t> *this,char *param_1,char *param_2,wchar_t *param_3)

{
  byte bVar1;
  wchar_t wVar2;
  __locale_t __dataset;
  
  if (param_1 != param_2) {
    do {
      bVar1 = *param_1;
      __dataset = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfdd5c to 00bfdd63 has its CatchHandler @ 00bfdd9c */
      wVar2 = btowc((uint)bVar1);
      if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00bfdd6c to 00bfdd73 has its CatchHandler @ 00bfdd98 */
        uselocale(__dataset);
      }
      param_1 = param_1 + 1;
      *param_3 = wVar2;
      param_3 = param_3 + 1;
    } while (param_1 != param_2);
  }
  return (byte *)param_1;
}

