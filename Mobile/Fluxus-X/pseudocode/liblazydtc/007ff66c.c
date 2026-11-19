/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff66c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_007ff66c(ulong *param_1)

{
  ulong uVar1;
  long lVar2;
  uint3 uVar3;
  long *plVar4;
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  long lVar12;
  size_t __n;
  void *__dest;
  long *local_90;
  undefined7 uStack_88;
  undefined4 uStack_81;
  undefined5 uStack_7d;
  undefined8 uStack_78;
  undefined4 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_90 = (long *)0x0;
  iVar5 = (**(code **)(*DAT_00ccabb8 + 0x30))(DAT_00ccabb8,&local_90,0x10006);
  if ((((iVar5 == 0) ||
       (iVar6 = (**(code **)(*DAT_00ccabb8 + 0x20))(DAT_00ccabb8,&local_90,0), iVar6 == 0)) &&
      (plVar4 = local_90, local_90 != (long *)0x0)) && (DAT_00ccabc0 != 0)) {
    uVar7 = (**(code **)(*local_90 + 0xf8))(local_90);
    uStack_88 = 0xe394fa5229e9df;
    local_90 = (long *)0xaafb95e6740ff8d6;
    uStack_81 = 0x7befd4b9;
    if (((DAT_00ccabf0 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccabf0), iVar6 != 0)) {
                    /* try { // try from 007ffc14 to 007ffc23 has its CatchHandler @ 007ffe18 */
      FUN_00802228(&DAT_00ccabd8,&local_90);
      __cxa_atexit(&LAB_008022cc,&DAT_00ccabd8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccabf0);
    }
    FUN_008035ac(&DAT_00ccabd8);
    local_70 = 0x3740efd4;
    uStack_88 = 0xfb95e65454f9d8;
    local_90 = (long *)0xa0fd9fe75637b499;
    uStack_78 = 0xb9e394fa5229e9df;
    uStack_81 = 0x54e9dfaa;
    uStack_7d = 0xaafb95e674;
    if (((DAT_00ccac28 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccac28), iVar6 != 0)) {
                    /* try { // try from 007ffc60 to 007ffc6f has its CatchHandler @ 007ffe08 */
      FUN_008022d8(&DAT_00ccac00,&local_90);
      __cxa_atexit(&LAB_00802404,&DAT_00ccac00,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccac28);
    }
    if (DAT_00ccac24 == '\x01') {
      DAT_00ccac24 = '\0';
      DAT_00ccac20 = DAT_00ccac20 ^ 0x377b9db1;
      _DAT_00ccac00 = _DAT_00ccac00 ^ 0xcf8ffb89377b9db1;
      uRam0000000000ccac08 = uRam0000000000ccac08 ^ 0xcf8ffb89377b9db1;
      _DAT_00ccac10 = _DAT_00ccac10 ^ 0xcf8ffb89377b9db1;
      uRam0000000000ccac18 = uRam0000000000ccac18 ^ 0xcf8ffb89377b9db1;
    }
    uVar8 = (**(code **)(*plVar4 + 0x108))(plVar4,uVar7,&DAT_00ccabd8,&DAT_00ccac00);
    uVar8 = FUN_007ffe68(plVar4,DAT_00ccabc0,uVar8);
    local_70 = CONCAT31(local_70._1_3_,0xf1);
    uStack_88 = 0xa8a776139ca781;
    local_90 = (long *)0x2ea9aa701797bb90;
    uStack_78 = 0x64bfb67c00a0f182;
    uStack_81 = 0x9686de73;
    uStack_7d = 0x66a3aa6b11;
    if (((DAT_00ccac58 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccac58), iVar6 != 0)) {
                    /* try { // try from 007ffcac to 007ffcbb has its CatchHandler @ 007ffdf8 */
      FUN_00802414(&DAT_00ccac30,&local_90);
      __cxa_atexit(&LAB_00802528,&DAT_00ccac30,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccac58);
    }
    if (DAT_00ccac51 == '\x01') {
      DAT_00ccac51 = '\0';
      _DAT_00ccac30 = _DAT_00ccac30 ^ 0x1cdc31f65f3d5f1;
      uRam0000000000ccac38 = uRam0000000000ccac38 ^ 0x1cdc31f65f3d5f1;
      _DAT_00ccac40 = _DAT_00ccac40 ^ 0x1cdc31f65f3d5f1;
      uRam0000000000ccac48 = uRam0000000000ccac48 ^ 0x1cdc31f65f3d5f1;
      DAT_00ccac50 = DAT_00ccac50 ^ 0xf1;
    }
    uVar9 = (**(code **)(*plVar4 + 0x30))(plVar4,&DAT_00ccac30);
    if (((DAT_00ccac70 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccac70), iVar6 != 0)) {
      DAT_00ccac6a = '\x01';
      DAT_00ccac60 = 0xa9baa989047ba2e8;
      _DAT_00ccac68 = 0xc7e8;
      __cxa_atexit(&LAB_00802538,&DAT_00ccac60,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccac70);
    }
    if (DAT_00ccac6a == '\x01') {
      DAT_00ccac6a = '\0';
      DAT_00ccac60 = DAT_00ccac60 ^ 0xc7d3dbfd570fc78f;
      _DAT_00ccac68 = _DAT_00ccac68 ^ 0xc78f;
    }
    if (((DAT_00ccacc8 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccacc8), iVar6 != 0)) {
      DAT_00ccacc0 = '\x01';
      DAT_00ccaca0 = 0x83113618e24d4a9f;
      DAT_00ccac98 = 0xde041356ef6f1081;
      DAT_00ccacb0 = 0xde020b56e90c4a85;
      DAT_00ccaca8 = 0x900f291ebe44459a;
      DAT_00ccacb8 = 0xf15e0259ec515fa0;
      DAT_00ccac80 = 0x9f001159ea400497;
      DAT_00ccac78 = 0x980a1753eb4267db;
      DAT_00ccac90 = 0x94130958f6467987;
      DAT_00ccac88 = 0x9f001159ea600487;
      __cxa_atexit(&LAB_00802544,&DAT_00ccac78,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccacc8);
    }
    if (DAT_00ccacc0 == '\x01') {
      DAT_00ccacc0 = '\0';
      DAT_00ccac78 = DAT_00ccac78 ^ 0xf165653785232bf3;
      DAT_00ccac80 = DAT_00ccac80 ^ 0xf165653785232bf3;
      DAT_00ccac88 = DAT_00ccac88 ^ 0xf165653785232bf3;
      DAT_00ccac90 = DAT_00ccac90 ^ 0xf165653785232bf3;
      DAT_00ccaca0 = DAT_00ccaca0 ^ 0xf165653785232bf3;
      DAT_00ccac98 = DAT_00ccac98 ^ 0xf165653785232bf3;
      DAT_00ccaca8 = DAT_00ccaca8 ^ 0xf165653785232bf3;
      DAT_00ccacb0 = DAT_00ccacb0 ^ 0xf165653785232bf3;
      DAT_00ccacb8 = DAT_00ccacb8 ^ 0xf165653785232bf3;
    }
    uVar10 = (**(code **)(*plVar4 + 0x388))(plVar4,uVar9,&DAT_00ccac60,&DAT_00ccac78);
    if (((DAT_00ccace0 & 1) == 0) && (iVar6 = __cxa_guard_acquire(&DAT_00ccace0), iVar6 != 0)) {
      DAT_00ccacd0 = 0x904140c05135f778;
      _DAT_00ccacd8 = 0x151fd70;
      __cxa_atexit(&LAB_00802558,&DAT_00ccacd0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccace0);
    }
    if (DAT_00ccacdb == '\x01') {
      DAT_00ccacd0 = DAT_00ccacd0 ^ 0xcf2529af23519919;
      uVar3 = (uint3)_DAT_00ccacd8;
      _DAT_00ccacd8 = (uint)(uVar3 ^ 0x519919);
    }
    uVar11 = (**(code **)(*plVar4 + 0x538))(plVar4,&DAT_00ccacd0);
    lVar12 = FUN_007fff04(plVar4,uVar9,uVar10,uVar8,uVar11);
    param_1[1] = 0;
    param_1[2] = 0;
    *param_1 = 0;
    if (lVar12 != 0) {
                    /* try { // try from 007ffa34 to 007ffa7f has its CatchHandler @ 007ffe2c */
      uVar9 = (**(code **)(*plVar4 + 0x548))(plVar4,lVar12,0);
      FUN_0080269c(param_1,uVar9);
      (**(code **)(*plVar4 + 0x550))(plVar4,lVar12,uVar9);
      (**(code **)(*plVar4 + 0xb8))(plVar4,lVar12);
    }
                    /* try { // try from 007ffa88 to 007ffacf has its CatchHandler @ 007ffe30 */
    (**(code **)(*plVar4 + 0xb8))(plVar4,uVar11);
    (**(code **)(*plVar4 + 0xb8))(plVar4,uVar8);
    (**(code **)(*plVar4 + 0xb8))(plVar4,uVar7);
    if (iVar5 != 0) {
      (**(code **)(*DAT_00ccabb8 + 0x28))();
    }
  }
  else {
    if (((DAT_00ccabd0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00ccabd0), iVar5 != 0)) {
      _DAT_00ccabc8 = 0x127;
      __cxa_atexit(&LAB_00802220,&DAT_00ccabc8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccabd0);
    }
    if (DAT_00ccabc9 == '\x01') {
      _DAT_00ccabc8 = (ushort)(DAT_00ccabc8 ^ 0x27);
    }
    __n = strlen((char *)&DAT_00ccabc8);
    if (0xfffffffffffffff7 < __n) {
      if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_007ffe64;
    }
    if (__n < 0x17) {
      __dest = (void *)((long)param_1 + 1);
      *(char *)param_1 = (char)((int)__n << 1);
      if (__n != 0) goto LAB_007ffb68;
    }
    else {
      uVar1 = 0x1a;
      if ((__n | 7) != 0x17) {
        uVar1 = (__n | 7) + 1;
      }
      __dest = operator_new(uVar1);
      param_1[1] = __n;
      param_1[2] = (ulong)__dest;
      *param_1 = uVar1 | 1;
LAB_007ffb68:
      memcpy(__dest,&DAT_00ccabc8,__n);
    }
    *(undefined1 *)((long)__dest + __n) = 0;
  }
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return;
  }
LAB_007ffe64:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

