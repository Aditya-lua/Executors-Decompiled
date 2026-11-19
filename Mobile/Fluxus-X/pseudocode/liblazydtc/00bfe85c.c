/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe85c
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::do_length(mbstate_t&, char const*, char const*,
   unsigned long) const */

int __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_length
          (codecvt<wchar_t,char,mbstate_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          ulong param_4)

{
  __locale_t __dataset;
  size_t sVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  
  iVar3 = 0;
  if ((param_4 != 0) && (param_2 != param_3)) {
    iVar3 = 0;
    uVar4 = 1;
    do {
      __dataset = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfe8bc to 00bfe8cb has its CatchHandler @ 00bfe940 */
      sVar1 = mbrlen(param_2,(long)param_3 - (long)param_2,param_1);
      if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00bfe8d4 to 00bfe8db has its CatchHandler @ 00bfe93c */
        uselocale(__dataset);
      }
      if (sVar1 == 0) {
        sVar1 = 1;
        iVar2 = 1;
      }
      else {
        if (sVar1 + 2 < 2) {
          return iVar3;
        }
        iVar2 = (int)sVar1;
      }
      iVar3 = iVar2 + iVar3;
      if (param_4 <= uVar4) {
        return iVar3;
      }
      param_2 = param_2 + sVar1;
      uVar4 = uVar4 + 1;
    } while (param_2 != param_3);
  }
  return iVar3;
}

