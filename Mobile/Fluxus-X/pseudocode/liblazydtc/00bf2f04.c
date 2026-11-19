/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf2f04
 */

/* std::__ndk1::money_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, bool, std::__ndk1::ios_base&, wchar_t,
   std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> > const&) const */

undefined8 __thiscall
std::__ndk1::
money_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_put(undefined8 param_1,undefined8 param_2,byte param_3,long param_4,undefined4 param_5,
      byte *param_6)

{
  byte *pbVar1;
  ulong uVar2;
  ulong uVar3;
  wchar_t *pwVar4;
  int iVar5;
  byte bVar6;
  bool bVar7;
  int iVar8;
  undefined8 ***__ptr;
  undefined8 uVar9;
  ulong uVar10;
  ctype *pcVar11;
  undefined8 ***pppuVar12;
  wchar_t *local_270;
  wchar_t *pwStack_268;
  undefined8 **local_260 [50];
  int local_cc;
  ulong local_c8;
  ulong local_c0;
  void *local_b8;
  undefined8 *local_b0;
  ulong local_a8;
  void *local_a0;
  undefined8 ***local_98;
  undefined8 uStack_90;
  void *local_88;
  wchar_t local_7c;
  wchar_t wStack_78;
  pattern apStack_74 [4];
  long local_70 [2];
  
  ios_base::getloc();
  local_b0 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_260[0] = &local_b0;
    local_98 = local_260;
                    /* try { // try from 00bf2f74 to 00bf2f8b has its CatchHandler @ 00bf32c4 */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_98,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_70[0] + 0x18) - *(long *)(local_70[0] + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (pcVar11 = *(ctype **)(*(long *)(local_70[0] + 0x10) + ((long)DAT_00d27268 - 1U) * 8),
     pcVar11 == (ctype *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bf3228 to 00bf322b has its CatchHandler @ 00bf32c4 */
    FUN_00bd8968();
  }
  bVar6 = *param_6;
  uVar2 = (ulong)(bVar6 >> 1);
  if ((bVar6 & 1) != 0) {
    uVar2 = *(ulong *)(param_6 + 8);
  }
  if (uVar2 == 0) {
    bVar7 = false;
  }
  else {
    pbVar1 = param_6 + 4;
    if ((bVar6 & 1) != 0) {
      pbVar1 = *(byte **)(param_6 + 0x10);
    }
    iVar5 = *(int *)pbVar1;
                    /* try { // try from 00bf2fe0 to 00bf2feb has its CatchHandler @ 00bf3230 */
    iVar8 = (**(code **)(*(long *)pcVar11 + 0x58))(pcVar11,0x2d);
    bVar7 = iVar5 == iVar8;
  }
  local_98 = (undefined8 ***)0x0;
  uStack_90 = 0;
  local_88 = (void *)0x0;
  local_b0 = (undefined8 *)0x0;
  local_a8 = 0;
  local_a0 = (void *)0x0;
  local_c8 = 0;
  local_c0 = 0;
  local_b8 = (void *)0x0;
                    /* try { // try from 00bf3018 to 00bf3047 has its CatchHandler @ 00bf3234 */
  __money_put<wchar_t>::__gather_info
            ((bool)(param_3 & 1),bVar7,(locale *)local_70,apStack_74,&wStack_78,&local_7c,
             (basic_string_conflict *)&local_98,(basic_string_conflict *)&local_b0,
             (basic_string_conflict *)&local_c8,&local_cc);
  bVar6 = *param_6;
  uVar2 = (ulong)(bVar6 >> 1);
  if ((bVar6 & 1) != 0) {
    uVar2 = *(ulong *)(param_6 + 8);
  }
  if (local_cc < (int)uVar2) {
    uVar10 = (ulong)((byte)local_c8._0_1_ >> 1);
    if ((local_c8 & 1) != 0) {
      uVar10 = local_c0;
    }
    uVar3 = (ulong)((byte)local_b0._0_1_ >> 1);
    if (((ulong)local_b0 & 1) != 0) {
      uVar3 = local_a8;
    }
    uVar10 = (uVar2 * 2 - (long)local_cc) + uVar10 + uVar3 + 1;
  }
  else {
    uVar10 = (ulong)((byte)local_c8._0_1_ >> 1);
    if ((local_c8 & 1) != 0) {
      uVar10 = local_c0;
    }
    uVar3 = (ulong)((byte)local_b0._0_1_ >> 1);
    if (((ulong)local_b0 & 1) != 0) {
      uVar3 = local_a8;
    }
    uVar10 = (long)local_cc + uVar10 + uVar3 + 2;
  }
  if (100 < uVar10) {
    __ptr = malloc(uVar10 << 2);
    pppuVar12 = __ptr;
    if (__ptr != (undefined8 ***)0x0) goto LAB_00bf310c;
                    /* try { // try from 00bf3100 to 00bf3103 has its CatchHandler @ 00bf322c */
    __throw_bad_alloc();
  }
  __ptr = (undefined8 ***)0x0;
  pppuVar12 = local_260;
LAB_00bf310c:
  pwVar4 = (wchar_t *)(param_6 + 4);
  if ((bVar6 & 1) != 0) {
    pwVar4 = *(wchar_t **)(param_6 + 0x10);
  }
                    /* try { // try from 00bf312c to 00bf3183 has its CatchHandler @ 00bf327c */
  __money_put<wchar_t>::__format
            ((wchar_t *)pppuVar12,&pwStack_268,&local_270,*(uint *)(param_4 + 8),pwVar4,
             pwVar4 + uVar2,pcVar11,bVar7,apStack_74,wStack_78,local_7c,
             (basic_string_conflict *)&local_98,(basic_string_conflict *)&local_b0,
             (basic_string_conflict *)&local_c8,local_cc);
  uVar9 = FUN_00be6bec(param_2,pppuVar12,pwStack_268,local_270,param_4,param_5);
  if (__ptr != (undefined8 ***)0x0) {
    free(__ptr);
  }
  if ((local_c8 & 1) != 0) {
    operator_delete(local_b8,(local_c8 & 0x3ffffffffffffffe) << 2);
  }
  if (((ulong)local_b0 & 1) != 0) {
    operator_delete(local_a0,((ulong)local_b0 & 0x3ffffffffffffffe) << 2);
  }
  if (((ulong)local_98 & 1) != 0) {
    operator_delete(local_88,(ulong)local_98 & 0xfffffffffffffffe);
  }
  locale::~locale((locale *)local_70);
  return uVar9;
}

