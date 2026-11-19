/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c08648
 */

/* std::__ndk1::moneypunct_byname<char, false>::init(char const*) */

void __thiscall
std::__ndk1::moneypunct_byname<char,false>::init(moneypunct_byname<char,false> *this,char *param_1)

{
  char cVar1;
  moneypunct_byname<char,false> mVar2;
  wchar_t __c;
  __locale_t __dataset;
  __locale_t p_Var3;
  lconv *plVar4;
  size_t sVar5;
  moneypunct_byname<char,false> *pmVar6;
  uint uVar7;
  byte *pbVar8;
  mbstate_t local_88 [3];
  undefined8 local_70;
  undefined8 uStack_68;
  char *local_60;
  __locale_t local_50;
  wchar_t local_44;
  
  __dataset = newlocale(0x1fbf,param_1,(__locale_t)0x0);
  local_50 = __dataset;
  if (__dataset == (__locale_t)0x0) {
                    /* try { // try from 00c08968 to 00c08973 has its CatchHandler @ 00c089fc */
    FUN_00852d7c(local_88,param_1);
                    /* try { // try from 00c08974 to 00c0898b has its CatchHandler @ 00c089d8 */
    FUN_00bfb964(&local_70,"moneypunct_byname failed to construct for ",local_88);
    if (((byte)local_70 & 1) == 0) {
      local_60 = (char *)((long)&local_70 + 1);
    }
                    /* try { // try from 00c0899c to 00c0899f has its CatchHandler @ 00c089b8 */
    __throw_runtime_error(local_60);
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c087dc with catch @ 00c089a0
                        */
    FUN_007fe114();
  }
                    /* try { // try from 00c08680 to 00c08687 has its CatchHandler @ 00c08a38 */
  p_Var3 = uselocale(__dataset);
  local_70 = p_Var3;
                    /* try { // try from 00c08690 to 00c08693 has its CatchHandler @ 00c08a08 */
  plVar4 = localeconv();
  if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c0869c to 00c086a3 has its CatchHandler @ 00c08a00 */
    uselocale(p_Var3);
  }
  pbVar8 = (byte *)plVar4->mon_decimal_point;
  uVar7 = (uint)*pbVar8;
  if (*pbVar8 == 0) {
LAB_00c08750:
    uVar7 = 0xff;
  }
  else if (pbVar8[1] != 0) {
    local_88[0].__count = 0;
    local_88[0].__value.__wch = 0;
    sVar5 = strlen((char *)pbVar8);
                    /* try { // try from 00c086c8 to 00c086cf has its CatchHandler @ 00c08a38 */
    p_Var3 = uselocale(__dataset);
                    /* try { // try from 00c086d8 to 00c086eb has its CatchHandler @ 00c089f4 */
    local_70 = p_Var3;
    sVar5 = mbrtowc(&local_44,(char *)pbVar8,sVar5,local_88);
    if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c086f4 to 00c086fb has its CatchHandler @ 00c089b4 */
      uselocale(p_Var3);
    }
    __c = local_44;
    if (0xfffffffffffffffd < sVar5) goto LAB_00c08750;
                    /* try { // try from 00c08708 to 00c0870f has its CatchHandler @ 00c08a38 */
    p_Var3 = uselocale(__dataset);
    local_70 = p_Var3;
                    /* try { // try from 00c08718 to 00c0871f has its CatchHandler @ 00c089ac */
    uVar7 = wctob(__c);
    if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c08728 to 00c0872f has its CatchHandler @ 00c089a4 */
      uselocale(p_Var3);
    }
    if ((uVar7 == 0xffffffff) && (uVar7 = 0x20, __c != L'\xa0' && __c != L'\x202f')) {
      uVar7 = 0xffffffff;
    }
  }
  this[0x10] = SUB41(uVar7,0);
  pbVar8 = (byte *)plVar4->mon_thousands_sep;
  uVar7 = (uint)*pbVar8;
  if (*pbVar8 != 0) {
    if (pbVar8[1] == 0) goto LAB_00c08808;
    local_88[0].__count = 0;
    local_88[0].__value.__wch = 0;
    sVar5 = strlen((char *)pbVar8);
                    /* try { // try from 00c0877c to 00c08783 has its CatchHandler @ 00c08a38 */
    p_Var3 = uselocale(__dataset);
                    /* try { // try from 00c0878c to 00c0879f has its CatchHandler @ 00c089f0 */
    local_70 = p_Var3;
    sVar5 = mbrtowc(&local_44,(char *)pbVar8,sVar5,local_88);
    if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c087a8 to 00c087af has its CatchHandler @ 00c089b0 */
      uselocale(p_Var3);
    }
    if (sVar5 < 0xfffffffffffffffe) {
                    /* try { // try from 00c087bc to 00c087c3 has its CatchHandler @ 00c08a38 */
      p_Var3 = uselocale(__dataset);
      local_70 = p_Var3;
                    /* try { // try from 00c087cc to 00c087d3 has its CatchHandler @ 00c089a8 */
      uVar7 = wctob(local_44);
      if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c087dc to 00c087e3 has its CatchHandler @ 00c089a0 */
        uselocale(p_Var3);
      }
      if ((uVar7 == 0xffffffff) && (uVar7 = 0x20, local_44 != L'\xa0' && local_44 != L'\x202f')) {
        uVar7 = 0xffffffff;
      }
      goto LAB_00c08808;
    }
  }
  uVar7 = 0xff;
LAB_00c08808:
  this[0x11] = SUB41(uVar7,0);
                    /* try { // try from 00c08810 to 00c0885b has its CatchHandler @ 00c08a38 */
  FUN_0080269c(this + 0x18,plVar4->mon_grouping);
  FUN_0080269c(this + 0x30,plVar4->currency_symbol);
  uVar7 = 0;
  if ((byte)plVar4->frac_digits != 0xff) {
    uVar7 = (uint)(byte)plVar4->frac_digits;
  }
  *(uint *)(this + 0x78) = uVar7;
  if (plVar4->p_sign_posn == '\0') {
    if (((byte)this[0x48] & 1) == 0) {
      this[0x48] = (moneypunct_byname<char,false>)0x4;
      pmVar6 = this + 0x49;
    }
    else {
      pmVar6 = *(moneypunct_byname<char,false> **)(this + 0x58);
      *(undefined8 *)(this + 0x50) = 2;
    }
    pmVar6[2] = (moneypunct_byname<char,false>)0x0;
    *(undefined2 *)pmVar6 = 0x2928;
    cVar1 = plVar4->n_sign_posn;
  }
  else {
    FUN_0080269c(this + 0x48,plVar4->positive_sign);
    cVar1 = plVar4->n_sign_posn;
  }
  if (cVar1 == '\0') {
    if (((byte)this[0x60] & 1) == 0) {
      this[0x60] = (moneypunct_byname<char,false>)0x4;
      pmVar6 = this + 0x61;
    }
    else {
      pmVar6 = *(moneypunct_byname<char,false> **)(this + 0x70);
      *(undefined8 *)(this + 0x68) = 2;
    }
    pmVar6[2] = (moneypunct_byname<char,false>)0x0;
    *(undefined2 *)pmVar6 = 0x2928;
    mVar2 = this[0x30];
  }
  else {
    FUN_0080269c(this + 0x60,plVar4->negative_sign);
    mVar2 = this[0x30];
  }
  if (((byte)mVar2 & 1) == 0) {
    uStack_68 = *(undefined8 *)(this + 0x38);
    local_70 = *(__locale_t *)(this + 0x30);
    local_60 = *(char **)(this + 0x40);
  }
  else {
                    /* try { // try from 00c088ec to 00c088f3 has its CatchHandler @ 00c089f8 */
    FUN_007ff40c(&local_70,*(undefined8 *)(this + 0x40),*(undefined8 *)(this + 0x38));
  }
                    /* try { // try from 00c08900 to 00c0892b has its CatchHandler @ 00c08a18 */
  FUN_00c08a4c(this + 0x7c,&local_70,0,plVar4->p_cs_precedes,plVar4->p_sep_by_space,
               plVar4->p_sign_posn);
  FUN_00c08a4c(this + 0x80,this + 0x30,0,plVar4->n_cs_precedes,plVar4->n_sep_by_space,
               plVar4->n_sign_posn);
  if (((ulong)local_70 & 1) != 0) {
    operator_delete(local_60,(ulong)local_70 & 0xfffffffffffffffe);
  }
                    /* try { // try from 00c08944 to 00c0894b has its CatchHandler @ 00c08a04 */
  freelocale(__dataset);
  return;
}

