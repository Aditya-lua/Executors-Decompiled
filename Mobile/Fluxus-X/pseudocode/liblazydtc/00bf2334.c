/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf2334
 */

/* std::__ndk1::money_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, bool, std::__ndk1::ios_base&, wchar_t, long double) const */

undefined8 __thiscall
std::__ndk1::
money_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_put(longdouble param_1,undefined8 param_2,undefined8 param_3,byte param_4,long param_5,
      undefined4 param_6)

{
  ulong uVar1;
  ulong uVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  wchar_t *__ptr;
  undefined8 uVar6;
  char *__ptr_00;
  long lVar7;
  wchar_t *pwVar8;
  undefined8 ***__ptr_01;
  ctype *pcVar9;
  undefined8 ***pppuVar10;
  wchar_t *local_470;
  wchar_t *pwStack_468;
  undefined8 **local_460 [50];
  int local_2cc;
  ulong local_2c8;
  ulong local_2c0;
  void *local_2b8;
  undefined8 *local_2b0;
  ulong local_2a8;
  void *local_2a0;
  undefined8 ***local_298;
  undefined8 local_290;
  void *local_288;
  wchar_t local_27c;
  wchar_t local_278;
  pattern apStack_274 [4];
  long local_270;
  wchar_t awStack_268 [100];
  char *local_d8;
  char local_cc [108];
  
  local_d8 = local_cc;
  uVar4 = snprintf(local_cc,100,"%.0Lf",param_1);
  if (99 < uVar4) {
    if (((DAT_00d270f8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00d270f8), iVar5 != 0)) {
                    /* try { // try from 00bf26ec to 00bf26ff has its CatchHandler @ 00bf2724 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
                    /* try { // try from 00bf23a8 to 00bf23bf has its CatchHandler @ 00bf2790 */
    uVar4 = FUN_00c0cdd4(param_1,&local_d8,DAT_00d270f0,"%.0Lf");
    __ptr_00 = local_d8;
    if (uVar4 == 0xffffffff) {
                    /* try { // try from 00bf2714 to 00bf271f has its CatchHandler @ 00bf2790 */
      __throw_bad_alloc();
    }
    else {
      __ptr = malloc(-(ulong)(uVar4 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar4 << 2);
      if (__ptr != (wchar_t *)0x0) {
        pwVar8 = __ptr;
        goto LAB_00bf23f8;
      }
    }
    __throw_bad_alloc();
LAB_00bf2720:
                    /* try { // try from 00bf2720 to 00bf2723 has its CatchHandler @ 00bf273c */
    uVar6 = __throw_bad_alloc();
                    /* catch() { ... } // from try @ 00bf26ec with catch @ 00bf2724 */
    __cxa_guard_abort(&DAT_00d270f8);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar6);
  }
  __ptr = (wchar_t *)0x0;
  __ptr_00 = (char *)0x0;
  pwVar8 = awStack_268;
LAB_00bf23f8:
                    /* try { // try from 00bf23f8 to 00bf2407 has its CatchHandler @ 00bf2788 */
  ios_base::getloc();
  local_2b0 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_460[0] = &local_2b0;
    local_298 = local_460;
                    /* try { // try from 00bf2434 to 00bf248b has its CatchHandler @ 00bf27ec */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_298,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_270 + 0x18) - *(long *)(local_270 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (pcVar9 = *(ctype **)(*(long *)(local_270 + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     pcVar9 == (ctype *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bf26d8 to 00bf26db has its CatchHandler @ 00bf27ec */
    FUN_00bd8968();
  }
  lVar7 = (long)(int)uVar4;
  (**(code **)(*(long *)pcVar9 + 0x60))(pcVar9,local_d8,local_d8 + lVar7,pwVar8);
  if ((int)uVar4 < 1) {
    bVar3 = false;
  }
  else {
    bVar3 = *local_d8 == '-';
  }
  local_290 = 0;
  local_298 = (undefined8 ***)0x0;
  local_288 = (void *)0x0;
  local_2a8 = 0;
  local_2b0 = (undefined8 *)0x0;
  local_2a0 = (void *)0x0;
  local_2c8 = 0;
  local_2c0 = 0;
  local_2b8 = (void *)0x0;
                    /* try { // try from 00bf24d0 to 00bf24ff has its CatchHandler @ 00bf2740 */
  __money_put<wchar_t>::__gather_info
            ((bool)(param_4 & 1),bVar3,(locale *)&local_270,apStack_274,&local_278,&local_27c,
             (basic_string_conflict *)&local_298,(basic_string_conflict *)&local_2b0,
             (basic_string_conflict *)&local_2c8,&local_2cc);
  if (local_2cc < (int)uVar4) {
    uVar1 = (ulong)((byte)local_2c8._0_1_ >> 1);
    if ((local_2c8 & 1) != 0) {
      uVar1 = local_2c0;
    }
    uVar2 = (ulong)((byte)local_2b0._0_1_ >> 1);
    if (((ulong)local_2b0 & 1) != 0) {
      uVar2 = local_2a8;
    }
    uVar1 = (lVar7 * 2 - (long)local_2cc) + uVar1 + uVar2 + 1;
  }
  else {
    uVar1 = (ulong)((byte)local_2c8._0_1_ >> 1);
    if ((local_2c8 & 1) != 0) {
      uVar1 = local_2c0;
    }
    uVar2 = (ulong)((byte)local_2b0._0_1_ >> 1);
    if (((ulong)local_2b0 & 1) != 0) {
      uVar2 = local_2a8;
    }
    uVar1 = (long)local_2cc + uVar1 + uVar2 + 2;
  }
  if (uVar1 < 0x65) {
    __ptr_01 = (undefined8 ***)0x0;
    pppuVar10 = local_460;
  }
  else {
    __ptr_01 = malloc(uVar1 << 2);
    pppuVar10 = __ptr_01;
    if (__ptr_01 == (undefined8 ***)0x0) goto LAB_00bf2720;
  }
                    /* try { // try from 00bf25bc to 00bf2617 has its CatchHandler @ 00bf27a4 */
  __money_put<wchar_t>::__format
            ((wchar_t *)pppuVar10,&pwStack_468,&local_470,*(uint *)(param_5 + 8),pwVar8,
             pwVar8 + lVar7,pcVar9,bVar3,apStack_274,local_278,local_27c,
             (basic_string_conflict *)&local_298,(basic_string_conflict *)&local_2b0,
             (basic_string_conflict *)&local_2c8,local_2cc);
  uVar6 = FUN_00be6bec(param_3,pppuVar10,pwStack_468,local_470,param_5,param_6);
  if (__ptr_01 != (undefined8 ***)0x0) {
    free(__ptr_01);
  }
  if ((local_2c8 & 1) != 0) {
    operator_delete(local_2b8,(local_2c8 & 0x3ffffffffffffffe) << 2);
  }
  if (((ulong)local_2b0 & 1) != 0) {
    operator_delete(local_2a0,((ulong)local_2b0 & 0x3ffffffffffffffe) << 2);
  }
  if (((ulong)local_298 & 1) != 0) {
    operator_delete(local_288,(ulong)local_298 & 0xfffffffffffffffe);
  }
  locale::~locale((locale *)&local_270);
  if (__ptr != (wchar_t *)0x0) {
    free(__ptr);
  }
  if (__ptr_00 != (char *)0x0) {
    free(__ptr_00);
  }
  return uVar6;
}

