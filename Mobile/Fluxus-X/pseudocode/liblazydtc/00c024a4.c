/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c024a4
 */

/* std::__ndk1::numpunct_byname<wchar_t>::__init(char const*) */

void __thiscall
std::__ndk1::numpunct_byname<wchar_t>::__init(numpunct_byname<wchar_t> *this,char *param_1)

{
  __locale_t __dataset;
  __locale_t p_Var1;
  lconv *plVar2;
  size_t sVar3;
  undefined8 uVar4;
  char *pcVar5;
  mbstate_t local_80 [2];
  void *local_70;
  undefined8 local_68;
  char *local_58;
  __locale_t local_50;
  wchar_t local_44;
  
  if ((*param_1 != 'C') || (param_1[1] != '\0')) {
    __dataset = newlocale(0x1fbf,param_1,(__locale_t)0x0);
    local_50 = __dataset;
    if (__dataset == (__locale_t)0x0) {
                    /* try { // try from 00c02608 to 00c02613 has its CatchHandler @ 00c02688 */
      FUN_00852d7c(local_80,param_1);
                    /* try { // try from 00c02614 to 00c0262b has its CatchHandler @ 00c02660 */
      FUN_00bfb964(&local_68,"numpunct_byname<wchar_t>::numpunct_byname failed to construct for ",
                   local_80);
      pcVar5 = local_58;
      if (((ulong)local_68 & 1) == 0) {
        pcVar5 = (char *)((long)&local_68 + 1);
      }
                    /* try { // try from 00c0263c to 00c0263f has its CatchHandler @ 00c02640 */
      uVar4 = __throw_runtime_error(pcVar5);
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c0263c with catch @ 00c02640
                        */
      if (((ulong)local_68 & 1) != 0) {
        operator_delete(local_58,(ulong)local_68 & 0xfffffffffffffffe);
      }
      if (((ulong)(uint)local_80[0].__count & 1) != 0) {
        operator_delete(local_70,(ulong)local_80[0] & 0xfffffffffffffffe);
      }
      FUN_00c02418(&local_50);
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar4);
    }
                    /* try { // try from 00c024f4 to 00c024fb has its CatchHandler @ 00c026ac */
    p_Var1 = uselocale(__dataset);
    local_68 = p_Var1;
                    /* try { // try from 00c02504 to 00c02507 has its CatchHandler @ 00c0269c */
    plVar2 = localeconv();
    if (p_Var1 != (__locale_t)0x0) {
                    /* try { // try from 00c02510 to 00c02517 has its CatchHandler @ 00c02694 */
      uselocale(p_Var1);
    }
    pcVar5 = plVar2->decimal_point;
    if (*pcVar5 != '\0') {
      local_80[0].__count = 0;
      local_80[0].__value.__wch = 0;
      sVar3 = strlen(pcVar5);
                    /* try { // try from 00c02534 to 00c0253b has its CatchHandler @ 00c026ac */
      p_Var1 = uselocale(__dataset);
                    /* try { // try from 00c02544 to 00c02557 has its CatchHandler @ 00c02690 */
      local_68 = p_Var1;
      sVar3 = mbrtowc(&local_44,pcVar5,sVar3,local_80);
      if (p_Var1 != (__locale_t)0x0) {
                    /* try { // try from 00c02560 to 00c02567 has its CatchHandler @ 00c02684 */
        uselocale(p_Var1);
      }
      if (sVar3 < 0xfffffffffffffffe) {
        *(wchar_t *)(this + 0x10) = local_44;
      }
    }
    pcVar5 = plVar2->thousands_sep;
    if (*pcVar5 != '\0') {
      local_80[0].__count = 0;
      local_80[0].__value.__wch = 0;
      sVar3 = strlen(pcVar5);
                    /* try { // try from 00c02594 to 00c0259b has its CatchHandler @ 00c026ac */
      p_Var1 = uselocale(__dataset);
                    /* try { // try from 00c025a4 to 00c025b7 has its CatchHandler @ 00c0268c */
      local_68 = p_Var1;
      sVar3 = mbrtowc(&local_44,pcVar5,sVar3,local_80);
      if (p_Var1 != (__locale_t)0x0) {
                    /* try { // try from 00c025c0 to 00c025c7 has its CatchHandler @ 00c02680 */
        uselocale(p_Var1);
      }
      if (sVar3 < 0xfffffffffffffffe) {
        *(wchar_t *)(this + 0x14) = local_44;
      }
    }
                    /* try { // try from 00c025dc to 00c025e3 has its CatchHandler @ 00c026ac */
    FUN_0080269c(this + 0x18,plVar2->grouping);
                    /* try { // try from 00c025e4 to 00c025eb has its CatchHandler @ 00c02698 */
    freelocale(__dataset);
  }
  return;
}

