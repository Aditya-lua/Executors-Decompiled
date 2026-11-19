/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe148
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::do_out(mbstate_t&, wchar_t const*, wchar_t
   const*, wchar_t const*&, char*, char*, char*&) const */

undefined1 __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_out
          (codecvt<wchar_t,char,mbstate_t> *this,mbstate_t *param_1,wchar_t *param_2,
          wchar_t *param_3,wchar_t **param_4,char *param_5,char *param_6,char **param_7)

{
  wchar_t __wc;
  char cVar1;
  __locale_t p_Var2;
  size_t sVar3;
  char *pcVar4;
  wchar_t *pwVar5;
  char *pcVar6;
  wchar_t *pwVar7;
  char acStack_74 [4];
  mbstate_t local_70;
  __locale_t local_68;
  
  pwVar7 = param_2;
  if (param_2 != param_3) {
    do {
      if (*pwVar7 == L'\0') goto LAB_00bfe1b0;
      pwVar7 = pwVar7 + 1;
    } while (pwVar7 != param_3);
    pwVar7 = param_3;
  }
LAB_00bfe1b0:
  *param_7 = param_5;
  *param_4 = param_2;
  while( true ) {
    if ((param_2 == param_3) || (param_5 == param_6)) goto LAB_00bfe3b0;
    local_70 = *param_1;
    p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
    local_68 = p_Var2;
                    /* try { // try from 00bfe208 to 00bfe21f has its CatchHandler @ 00bfe3f8 */
    sVar3 = wcsnrtombs(param_5,param_4,(long)pwVar7 - (long)param_2 >> 2,
                       (long)param_6 - (long)param_5,param_1);
    if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe228 to 00bfe22f has its CatchHandler @ 00bfe3f4 */
      uselocale(p_Var2);
    }
    if (sVar3 == 0) {
      return true;
    }
    if (sVar3 == 0xffffffffffffffff) {
      *param_7 = param_5;
      if (param_2 == *param_4) goto LAB_00bfe398;
      goto LAB_00bfe338;
    }
    param_5 = *param_7 + sVar3;
    *param_7 = param_5;
    if (param_5 == param_6) break;
    if (pwVar7 == param_3) {
      param_2 = *param_4;
      pwVar7 = param_3;
    }
    else {
      p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfe26c to 00bfe27b has its CatchHandler @ 00bfe3f0 */
      local_68 = p_Var2;
      sVar3 = wcrtomb(acStack_74,L'\0',param_1);
      if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe284 to 00bfe28b has its CatchHandler @ 00bfe3ec */
        uselocale(p_Var2);
      }
      if (sVar3 == 0xffffffffffffffff) {
        return 2;
      }
      if ((ulong)((long)param_6 - (long)*param_7) < sVar3) {
        return true;
      }
      if (sVar3 != 0) {
        pcVar4 = acStack_74;
        do {
          pcVar6 = *param_7;
          cVar1 = *pcVar4;
          sVar3 = sVar3 - 1;
          *param_7 = pcVar6 + 1;
          *pcVar6 = cVar1;
          pcVar4 = pcVar4 + 1;
        } while (sVar3 != 0);
      }
      param_2 = *param_4 + 1;
      *param_4 = param_2;
      pwVar5 = param_2;
      pwVar7 = param_3;
      if (param_2 != param_3) {
        do {
          if (*pwVar5 == L'\0') {
            pwVar7 = pwVar5;
            goto LAB_00bfe1cc;
          }
          pwVar5 = pwVar5 + 1;
        } while (pwVar5 != param_3);
      }
LAB_00bfe1cc:
      param_5 = *param_7;
    }
  }
  param_2 = *param_4;
LAB_00bfe3b0:
  return param_2 != param_3;
  while( true ) {
    param_2 = param_2 + 1;
    param_5 = *param_7 + sVar3;
    *param_7 = param_5;
    if (param_2 == *param_4) break;
LAB_00bfe338:
    __wc = *param_2;
    p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfe350 to 00bfe35f has its CatchHandler @ 00bfe3e8 */
    local_68 = p_Var2;
    sVar3 = wcrtomb(param_5,__wc,&local_70);
    if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe368 to 00bfe36f has its CatchHandler @ 00bfe3e4 */
      uselocale(p_Var2);
    }
    if (sVar3 == 0xffffffffffffffff) break;
  }
LAB_00bfe398:
  *param_4 = param_2;
  return 2;
}

