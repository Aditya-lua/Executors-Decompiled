/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf12bc
 */

/* std::__ndk1::money_put<char, std::__ndk1::ostreambuf_iterator<char,
   std::__ndk1::char_traits<char> > >::do_put(std::__ndk1::ostreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, bool, std::__ndk1::ios_base&, char, long double) const */

undefined8 __thiscall
std::__ndk1::money_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(longdouble param_1,undefined8 param_2,undefined8 param_3,byte param_4,long param_5,
      undefined4 param_6)

{
  ulong uVar1;
  ulong uVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  char *__ptr;
  undefined8 uVar6;
  char *__ptr_00;
  long lVar7;
  char *pcVar8;
  undefined8 ***__ptr_01;
  ctype *pcVar9;
  undefined8 ***pppuVar10;
  char *local_218;
  char *pcStack_210;
  undefined8 **local_208 [12];
  int local_1a4;
  ulong local_1a0;
  ulong local_198;
  void *local_190;
  undefined8 *local_188;
  ulong local_180;
  void *local_178;
  undefined8 ***local_170;
  undefined8 uStack_168;
  void *local_160;
  char local_154 [4];
  char local_150 [4];
  pattern apStack_14c [4];
  long local_148;
  char acStack_13c [100];
  char *local_d8;
  char local_cc [108];
  
  local_d8 = local_cc;
  uVar4 = snprintf(local_cc,100,"%.0Lf",param_1);
  if (99 < uVar4) {
    if (((DAT_00d270f8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d270f8), iVar5 != 0)) {
                    /* try { // try from 00bf1660 to 00bf1673 has its CatchHandler @ 00bf1698 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
                    /* try { // try from 00bf1330 to 00bf1347 has its CatchHandler @ 00bf16fc */
    uVar4 = FUN_00c0cdd4(param_1,&local_d8,DAT_00d270f0,"%.0Lf");
    __ptr_00 = local_d8;
    if (uVar4 == 0xffffffff) {
                    /* try { // try from 00bf1688 to 00bf1693 has its CatchHandler @ 00bf16fc */
      __throw_bad_alloc();
    }
    else {
      __ptr = malloc((long)(int)uVar4);
      if (__ptr != (char *)0x0) {
        pcVar8 = __ptr;
        goto LAB_00bf1380;
      }
    }
    __throw_bad_alloc();
LAB_00bf1694:
                    /* try { // try from 00bf1694 to 00bf1697 has its CatchHandler @ 00bf16b0 */
    uVar6 = __throw_bad_alloc();
                    /* catch() { ... } // from try @ 00bf1660 with catch @ 00bf1698 */
    __cxa_guard_abort(&DAT_00d270f8);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar6);
  }
  __ptr = (char *)0x0;
  __ptr_00 = (char *)0x0;
  pcVar8 = acStack_13c;
LAB_00bf1380:
                    /* try { // try from 00bf1380 to 00bf138f has its CatchHandler @ 00bf16f4 */
  ios_base::getloc();
  local_188 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_208[0] = &local_188;
    local_170 = local_208;
                    /* try { // try from 00bf13bc to 00bf1413 has its CatchHandler @ 00bf1758 */
    __call_once((ulong *)&ctype<char>::id,&local_170,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_148 + 0x18) - *(long *)(local_148 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (pcVar9 = *(ctype **)(*(long *)(local_148 + 0x10) + ((long)DAT_00d27278 - 1U) * 8),
     pcVar9 == (ctype *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bf164c to 00bf164f has its CatchHandler @ 00bf1758 */
    FUN_00bd8968();
  }
  lVar7 = (long)(int)uVar4;
  (**(code **)(*(long *)pcVar9 + 0x40))(pcVar9,local_d8,local_d8 + lVar7,pcVar8);
  if ((int)uVar4 < 1) {
    bVar3 = false;
  }
  else {
    bVar3 = *local_d8 == '-';
  }
  local_170 = (undefined8 ***)0x0;
  uStack_168 = 0;
  local_160 = (void *)0x0;
  local_188 = (undefined8 *)0x0;
  local_180 = 0;
  local_178 = (void *)0x0;
  local_1a0 = 0;
  local_198 = 0;
  local_190 = (void *)0x0;
                    /* try { // try from 00bf1450 to 00bf147f has its CatchHandler @ 00bf16b4 */
  __money_put<char>::__gather_info
            ((bool)(param_4 & 1),bVar3,(locale *)&local_148,apStack_14c,local_150,local_154,
             (basic_string_conflict *)&local_170,(basic_string_conflict *)&local_188,
             (basic_string_conflict *)&local_1a0,&local_1a4);
  if (local_1a4 < (int)uVar4) {
    uVar1 = (ulong)((byte)local_1a0._0_1_ >> 1);
    if ((local_1a0 & 1) != 0) {
      uVar1 = local_198;
    }
    uVar2 = (ulong)((byte)local_188._0_1_ >> 1);
    if (((ulong)local_188 & 1) != 0) {
      uVar2 = local_180;
    }
    uVar1 = (lVar7 * 2 - (long)local_1a4) + uVar1 + uVar2 + 1;
  }
  else {
    uVar1 = (ulong)((byte)local_1a0._0_1_ >> 1);
    if ((local_1a0 & 1) != 0) {
      uVar1 = local_198;
    }
    uVar2 = (ulong)((byte)local_188._0_1_ >> 1);
    if (((ulong)local_188 & 1) != 0) {
      uVar2 = local_180;
    }
    uVar1 = (long)local_1a4 + uVar1 + uVar2 + 2;
  }
  if (uVar1 < 0x65) {
    __ptr_01 = (undefined8 ***)0x0;
    pppuVar10 = local_208;
  }
  else {
    __ptr_01 = malloc(uVar1);
    pppuVar10 = __ptr_01;
    if (__ptr_01 == (undefined8 ***)0x0) goto LAB_00bf1694;
  }
                    /* try { // try from 00bf1534 to 00bf1593 has its CatchHandler @ 00bf1710 */
  __money_put<char>::__format
            ((char *)pppuVar10,&pcStack_210,&local_218,*(uint *)(param_5 + 8),pcVar8,pcVar8 + lVar7,
             pcVar9,bVar3,apStack_14c,local_150[0],local_154[0],(basic_string_conflict *)&local_170,
             (basic_string_conflict *)&local_188,(basic_string_conflict *)&local_1a0,local_1a4);
  uVar6 = FUN_00be5420(param_3,pppuVar10,pcStack_210,local_218,param_5,param_6);
  if (__ptr_01 != (undefined8 ***)0x0) {
    free(__ptr_01);
  }
  if ((local_1a0 & 1) != 0) {
    operator_delete(local_190,local_1a0 & 0xfffffffffffffffe);
  }
  if (((ulong)local_188 & 1) != 0) {
    operator_delete(local_178,(ulong)local_188 & 0xfffffffffffffffe);
  }
  if (((ulong)local_170 & 1) != 0) {
    operator_delete(local_160,(ulong)local_170 & 0xfffffffffffffffe);
  }
  locale::~locale((locale *)&local_148);
  if (__ptr != (char *)0x0) {
    free(__ptr);
  }
  if (__ptr_00 != (char *)0x0) {
    free(__ptr_00);
  }
  return uVar6;
}

