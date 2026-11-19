/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c08e84
 */

/* std::__ndk1::moneypunct_byname<char, true>::init(char const*) */

void __thiscall
std::__ndk1::moneypunct_byname<char,true>::init(moneypunct_byname<char,true> *this,char *param_1)

{
  char cVar1;
  moneypunct_byname<char,true> mVar2;
  wchar_t __c;
  __locale_t __dataset;
  __locale_t p_Var3;
  lconv *plVar4;
  size_t sVar5;
  moneypunct_byname<char,true> *pmVar6;
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
                    /* try { // try from 00c091a4 to 00c091af has its CatchHandler @ 00c09238 */
    FUN_00852d7c(local_88,param_1);
                    /* try { // try from 00c091b0 to 00c091c7 has its CatchHandler @ 00c09214 */
    FUN_00bfb964(&local_70,"moneypunct_byname failed to construct for ",local_88);
    if (((byte)local_70 & 1) == 0) {
      local_60 = (char *)((long)&local_70 + 1);
    }
                    /* try { // try from 00c091d8 to 00c091db has its CatchHandler @ 00c091f4 */
    __throw_runtime_error(local_60);
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c09018 with catch @ 00c091dc
                        */
    FUN_007fe114();
  }
                    /* try { // try from 00c08ebc to 00c08ec3 has its CatchHandler @ 00c09274 */
  p_Var3 = uselocale(__dataset);
  local_70 = p_Var3;
                    /* try { // try from 00c08ecc to 00c08ecf has its CatchHandler @ 00c09244 */
  plVar4 = localeconv();
  if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c08ed8 to 00c08edf has its CatchHandler @ 00c0923c */
    uselocale(p_Var3);
  }
  pbVar8 = (byte *)plVar4->mon_decimal_point;
  uVar7 = (uint)*pbVar8;
  if (*pbVar8 == 0) {
LAB_00c08f8c:
    uVar7 = 0xff;
  }
  else if (pbVar8[1] != 0) {
    local_88[0].__count = 0;
    local_88[0].__value.__wch = 0;
    sVar5 = strlen((char *)pbVar8);
                    /* try { // try from 00c08f04 to 00c08f0b has its CatchHandler @ 00c09274 */
    p_Var3 = uselocale(__dataset);
                    /* try { // try from 00c08f14 to 00c08f27 has its CatchHandler @ 00c09230 */
    local_70 = p_Var3;
    sVar5 = mbrtowc(&local_44,(char *)pbVar8,sVar5,local_88);
    if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c08f30 to 00c08f37 has its CatchHandler @ 00c091f0 */
      uselocale(p_Var3);
    }
    __c = local_44;
    if (0xfffffffffffffffd < sVar5) goto LAB_00c08f8c;
                    /* try { // try from 00c08f44 to 00c08f4b has its CatchHandler @ 00c09274 */
    p_Var3 = uselocale(__dataset);
    local_70 = p_Var3;
                    /* try { // try from 00c08f54 to 00c08f5b has its CatchHandler @ 00c091e8 */
    uVar7 = wctob(__c);
    if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c08f64 to 00c08f6b has its CatchHandler @ 00c091e0 */
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
    if (pbVar8[1] == 0) goto LAB_00c09044;
    local_88[0].__count = 0;
    local_88[0].__value.__wch = 0;
    sVar5 = strlen((char *)pbVar8);
                    /* try { // try from 00c08fb8 to 00c08fbf has its CatchHandler @ 00c09274 */
    p_Var3 = uselocale(__dataset);
                    /* try { // try from 00c08fc8 to 00c08fdb has its CatchHandler @ 00c0922c */
    local_70 = p_Var3;
    sVar5 = mbrtowc(&local_44,(char *)pbVar8,sVar5,local_88);
    if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c08fe4 to 00c08feb has its CatchHandler @ 00c091ec */
      uselocale(p_Var3);
    }
    if (sVar5 < 0xfffffffffffffffe) {
                    /* try { // try from 00c08ff8 to 00c08fff has its CatchHandler @ 00c09274 */
      p_Var3 = uselocale(__dataset);
      local_70 = p_Var3;
                    /* try { // try from 00c09008 to 00c0900f has its CatchHandler @ 00c091e4 */
      uVar7 = wctob(local_44);
      if (p_Var3 != (__locale_t)0x0) {
                    /* try { // try from 00c09018 to 00c0901f has its CatchHandler @ 00c091dc */
        uselocale(p_Var3);
      }
      if ((uVar7 == 0xffffffff) && (uVar7 = 0x20, local_44 != L'\xa0' && local_44 != L'\x202f')) {
        uVar7 = 0xffffffff;
      }
      goto LAB_00c09044;
    }
  }
  uVar7 = 0xff;
LAB_00c09044:
  this[0x11] = SUB41(uVar7,0);
                    /* try { // try from 00c0904c to 00c09097 has its CatchHandler @ 00c09274 */
  FUN_0080269c(this + 0x18,plVar4->mon_grouping);
  FUN_0080269c(this + 0x30,plVar4->int_curr_symbol);
  uVar7 = 0;
  if ((byte)plVar4->int_frac_digits != 0xff) {
    uVar7 = (uint)(byte)plVar4->int_frac_digits;
  }
  *(uint *)(this + 0x78) = uVar7;
  if (plVar4->int_p_sign_posn == '\0') {
    if (((byte)this[0x48] & 1) == 0) {
      this[0x48] = (moneypunct_byname<char,true>)0x4;
      pmVar6 = this + 0x49;
    }
    else {
      pmVar6 = *(moneypunct_byname<char,true> **)(this + 0x58);
      *(undefined8 *)(this + 0x50) = 2;
    }
    pmVar6[2] = (moneypunct_byname<char,true>)0x0;
    *(undefined2 *)pmVar6 = 0x2928;
    cVar1 = plVar4->int_n_sign_posn;
  }
  else {
    FUN_0080269c(this + 0x48,plVar4->positive_sign);
    cVar1 = plVar4->int_n_sign_posn;
  }
  if (cVar1 == '\0') {
    if (((byte)this[0x60] & 1) == 0) {
      this[0x60] = (moneypunct_byname<char,true>)0x4;
      pmVar6 = this + 0x61;
    }
    else {
      pmVar6 = *(moneypunct_byname<char,true> **)(this + 0x70);
      *(undefined8 *)(this + 0x68) = 2;
    }
    pmVar6[2] = (moneypunct_byname<char,true>)0x0;
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
                    /* try { // try from 00c09128 to 00c0912f has its CatchHandler @ 00c09234 */
    FUN_007ff40c(&local_70,*(undefined8 *)(this + 0x40),*(undefined8 *)(this + 0x38));
  }
                    /* try { // try from 00c0913c to 00c09167 has its CatchHandler @ 00c09254 */
  FUN_00c08a4c(this + 0x7c,&local_70,1,plVar4->int_p_cs_precedes,plVar4->int_p_sep_by_space,
               plVar4->int_p_sign_posn);
  FUN_00c08a4c(this + 0x80,this + 0x30,1,plVar4->int_n_cs_precedes,plVar4->int_n_sep_by_space,
               plVar4->int_n_sign_posn);
  if (((ulong)local_70 & 1) != 0) {
    operator_delete(local_60,(ulong)local_70 & 0xfffffffffffffffe);
  }
                    /* try { // try from 00c09180 to 00c09187 has its CatchHandler @ 00c09240 */
  freelocale(__dataset);
  return;
}

