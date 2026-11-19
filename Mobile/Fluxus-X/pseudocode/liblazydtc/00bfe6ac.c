/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe6ac
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::do_unshift(mbstate_t&, char*, char*, char*&)
   const */

undefined8 __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_unshift
          (codecvt<wchar_t,char,mbstate_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4)

{
  char cVar1;
  __locale_t p_Var2;
  size_t sVar3;
  undefined8 uVar4;
  ulong uVar5;
  char *pcVar6;
  char *pcVar7;
  char acStack_3c [4];
  __locale_t local_38;
  
  p_Var2 = *(__locale_t *)(this + 0x10);
  *param_4 = param_2;
  p_Var2 = uselocale(p_Var2);
                    /* try { // try from 00bfe6e4 to 00bfe6f3 has its CatchHandler @ 00bfe778 */
  local_38 = p_Var2;
  sVar3 = wcrtomb(acStack_3c,L'\0',param_1);
  if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe6fc to 00bfe703 has its CatchHandler @ 00bfe774 */
    uselocale(p_Var2);
  }
  if (sVar3 + 1 < 2) {
    uVar4 = 2;
  }
  else {
    uVar5 = sVar3 - 1;
    if ((ulong)((long)param_3 - (long)*param_4) < uVar5) {
      uVar4 = 1;
    }
    else {
      if (uVar5 != 0) {
        pcVar6 = acStack_3c;
        do {
          pcVar7 = *param_4;
          cVar1 = *pcVar6;
          uVar5 = uVar5 - 1;
          *param_4 = pcVar7 + 1;
          *pcVar7 = cVar1;
          pcVar6 = pcVar6 + 1;
        } while (uVar5 != 0);
      }
      uVar4 = 0;
    }
  }
  return uVar4;
}

