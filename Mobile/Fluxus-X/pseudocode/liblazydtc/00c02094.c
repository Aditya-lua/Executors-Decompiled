/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02094
 */

/* std::__ndk1::numpunct_byname<char>::__init(char const*) */

void __thiscall
std::__ndk1::numpunct_byname<char>::__init(numpunct_byname<char> *this,char *param_1)

{
  wchar_t __c;
  int iVar1;
  __locale_t __dataset;
  __locale_t p_Var2;
  lconv *plVar3;
  size_t sVar4;
  numpunct_byname<char> *pnVar5;
  mbstate_t local_80 [3];
  undefined8 local_68;
  char *local_58;
  __locale_t local_50;
  wchar_t local_44;
  
  if ((*param_1 != 'C') || (param_1[1] != '\0')) {
    __dataset = newlocale(0x1fbf,param_1,(__locale_t)0x0);
    local_50 = __dataset;
    if (__dataset == (__locale_t)0x0) {
                    /* try { // try from 00c022b0 to 00c022bb has its CatchHandler @ 00c02348 */
      FUN_00852d7c(local_80,param_1);
                    /* try { // try from 00c022bc to 00c022d3 has its CatchHandler @ 00c02320 */
      FUN_00bfb964(&local_68,"numpunct_byname<char>::numpunct_byname failed to construct for ",
                   local_80);
      if (((byte)local_68 & 1) == 0) {
        local_58 = (char *)((long)&local_68 + 1);
      }
                    /* try { // try from 00c022e4 to 00c022e7 has its CatchHandler @ 00c02300 */
      __throw_runtime_error(local_58);
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c0222c with catch @ 00c022e8
                        */
      FUN_007fe114();
    }
                    /* try { // try from 00c020e4 to 00c020eb has its CatchHandler @ 00c02364 */
    p_Var2 = uselocale(__dataset);
    local_68 = p_Var2;
                    /* try { // try from 00c020f4 to 00c020f7 has its CatchHandler @ 00c02354 */
    plVar3 = localeconv();
    if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00c02100 to 00c02107 has its CatchHandler @ 00c0234c */
      uselocale(p_Var2);
    }
    pnVar5 = (numpunct_byname<char> *)plVar3->decimal_point;
    if (*pnVar5 != (numpunct_byname<char>)0x0) {
      if (pnVar5[1] == (numpunct_byname<char>)0x0) {
        this[0x10] = *pnVar5;
      }
      else {
        local_80[0].__count = 0;
        local_80[0].__value.__wch = 0;
        sVar4 = strlen((char *)pnVar5);
                    /* try { // try from 00c0212c to 00c02133 has its CatchHandler @ 00c02364 */
        p_Var2 = uselocale(__dataset);
                    /* try { // try from 00c0213c to 00c0214f has its CatchHandler @ 00c02344 */
        local_68 = p_Var2;
        sVar4 = mbrtowc(&local_44,(char *)pnVar5,sVar4,local_80);
        if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00c02158 to 00c0215f has its CatchHandler @ 00c022fc */
          uselocale(p_Var2);
        }
        __c = local_44;
        if (sVar4 < 0xfffffffffffffffe) {
                    /* try { // try from 00c0216c to 00c02173 has its CatchHandler @ 00c02364 */
          p_Var2 = uselocale(__dataset);
          local_68 = p_Var2;
                    /* try { // try from 00c0217c to 00c02183 has its CatchHandler @ 00c022f4 */
          iVar1 = wctob(__c);
          if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00c0218c to 00c02193 has its CatchHandler @ 00c022ec */
            uselocale(p_Var2);
          }
          if (((iVar1 != -1) || (iVar1 = 0x20, __c == L'\x202f')) || (__c == L'\xa0')) {
            this[0x10] = SUB41(iVar1,0);
          }
        }
      }
    }
    pnVar5 = (numpunct_byname<char> *)plVar3->thousands_sep;
    if (*pnVar5 != (numpunct_byname<char>)0x0) {
      if (pnVar5[1] == (numpunct_byname<char>)0x0) {
        this[0x11] = *pnVar5;
      }
      else {
        local_80[0].__count = 0;
        local_80[0].__value.__wch = 0;
        sVar4 = strlen((char *)pnVar5);
                    /* try { // try from 00c021cc to 00c021d3 has its CatchHandler @ 00c02364 */
        p_Var2 = uselocale(__dataset);
                    /* try { // try from 00c021dc to 00c021ef has its CatchHandler @ 00c02340 */
        local_68 = p_Var2;
        sVar4 = mbrtowc(&local_44,(char *)pnVar5,sVar4,local_80);
        if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00c021f8 to 00c021ff has its CatchHandler @ 00c022f8 */
          uselocale(p_Var2);
        }
        if (sVar4 < 0xfffffffffffffffe) {
                    /* try { // try from 00c0220c to 00c02213 has its CatchHandler @ 00c02364 */
          p_Var2 = uselocale(__dataset);
          local_68 = p_Var2;
                    /* try { // try from 00c0221c to 00c02223 has its CatchHandler @ 00c022f0 */
          iVar1 = wctob(local_44);
          if (p_Var2 != (__locale_t)0x0) {
                    /* try { // try from 00c0222c to 00c02233 has its CatchHandler @ 00c022e8 */
            uselocale(p_Var2);
          }
          if (((iVar1 != -1) || (iVar1 = 0x20, local_44 == L'\x202f')) || (local_44 == L'\xa0')) {
            this[0x11] = SUB41(iVar1,0);
          }
        }
      }
    }
                    /* try { // try from 00c0224c to 00c02253 has its CatchHandler @ 00c02364 */
    FUN_0080269c(this + 0x18,plVar3->grouping);
                    /* try { // try from 00c02254 to 00c0225b has its CatchHandler @ 00c02350 */
    freelocale(__dataset);
  }
  return;
}

