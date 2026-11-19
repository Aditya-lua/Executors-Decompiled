/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfe40c
 */

/* std::__ndk1::codecvt<wchar_t, char, mbstate_t>::do_in(mbstate_t&, char const*, char const*, char
   const*&, wchar_t*, wchar_t*, wchar_t*&) const */

bool __thiscall
std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_in
          (codecvt<wchar_t,char,mbstate_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4,wchar_t *param_5,wchar_t *param_6,wchar_t **param_7)

{
  bool bVar1;
  __locale_t p_Var2;
  size_t sVar3;
  char *pcVar4;
  char *pcVar5;
  mbstate_t local_70;
  __locale_t local_68;
  
  pcVar5 = param_3;
  if (param_2 != param_3) {
    pcVar5 = param_2;
    do {
      if (*pcVar5 == '\0') goto LAB_00bfe474;
      pcVar5 = pcVar5 + 1;
    } while (pcVar5 != param_3);
    pcVar5 = param_3;
  }
LAB_00bfe474:
  *param_7 = param_5;
  *param_4 = param_2;
  do {
    if ((param_2 == param_3) || (param_5 == param_6)) goto LAB_00bfe634;
    local_70 = *param_1;
    p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
    local_68 = p_Var2;
                    /* try { // try from 00bfe4b8 to 00bfe4cf has its CatchHandler @ 00bfe698 */
    sVar3 = mbsnrtowcs(param_5,param_4,(long)pcVar5 - (long)param_2,
                       (long)param_6 - (long)param_5 >> 2,param_1);
    if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe4d8 to 00bfe4df has its CatchHandler @ 00bfe694 */
      uselocale(p_Var2);
    }
    if (sVar3 == 0xffffffffffffffff) {
      *param_7 = param_5;
      pcVar4 = *param_4;
      for (; param_2 != pcVar4; param_2 = param_2 + sVar3) {
        p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
                    /* try { // try from 00bfe5e0 to 00bfe5f3 has its CatchHandler @ 00bfe688 */
        local_68 = p_Var2;
        sVar3 = mbrtowc(param_5,param_2,(long)pcVar5 - (long)param_2,&local_70);
        if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe5fc to 00bfe603 has its CatchHandler @ 00bfe684 */
          uselocale(p_Var2);
        }
        if (sVar3 == 0) {
          sVar3 = 1;
        }
        else {
          if (sVar3 == 0xfffffffffffffffe) {
            *param_4 = param_2;
            return true;
          }
          if (sVar3 == 0xffffffffffffffff) {
            *param_4 = param_2;
            return (bool)2;
          }
        }
        param_5 = *param_7 + 1;
        *param_7 = param_5;
        pcVar4 = *param_4;
      }
      *param_4 = param_2;
LAB_00bfe634:
      return param_2 != param_3;
    }
    param_5 = *param_7 + sVar3;
    *param_7 = param_5;
    if (param_5 == param_6) {
      param_2 = *param_4;
      goto LAB_00bfe634;
    }
    bVar1 = pcVar5 != param_3;
    param_2 = *param_4;
    pcVar5 = param_3;
    if (bVar1) {
      p_Var2 = uselocale(*(__locale_t *)(this + 0x10));
      local_68 = p_Var2;
                    /* try { // try from 00bfe520 to 00bfe533 has its CatchHandler @ 00bfe690 */
      sVar3 = mbrtowc(param_5,param_2,1,param_1);
      if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00bfe53c to 00bfe543 has its CatchHandler @ 00bfe68c */
        uselocale(p_Var2);
      }
      if (sVar3 != 0) {
        return (bool)2;
      }
      param_5 = *param_7 + 1;
      *param_7 = param_5;
      param_2 = *param_4 + 1;
      *param_4 = param_2;
      if (param_2 != param_3) {
        pcVar4 = param_2;
        do {
          pcVar5 = pcVar4;
          if (*pcVar4 == '\0') break;
          pcVar4 = pcVar4 + 1;
          pcVar5 = param_3;
        } while (pcVar4 != param_3);
      }
    }
  } while( true );
}

