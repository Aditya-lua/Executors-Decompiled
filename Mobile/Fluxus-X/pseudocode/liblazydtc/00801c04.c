/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00801c04
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00801c04(ulong *param_1)

{
  ulong uVar1;
  long lVar2;
  long *plVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 uVar9;
  long lVar10;
  size_t __n;
  void *__dest;
  long *local_90;
  undefined7 uStack_88;
  undefined4 uStack_81;
  undefined5 uStack_7d;
  undefined7 uStack_78;
  undefined1 local_71;
  undefined7 uStack_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_90 = (long *)0x0;
  iVar4 = (**(code **)(*DAT_00ccabb8 + 0x30))(DAT_00ccabb8,&local_90,0x10006);
  if ((((iVar4 == 0) ||
       (iVar5 = (**(code **)(*DAT_00ccabb8 + 0x20))(DAT_00ccabb8,&local_90,0), iVar5 == 0)) &&
      (plVar3 = local_90, local_90 != (long *)0x0)) && (DAT_00ccabc0 != 0)) {
    uVar6 = (**(code **)(*local_90 + 0xf8))(local_90);
    uStack_88 = 0xf4ad486c0bac6e;
    local_90 = (long *)0x7ad1b357440ba86a;
    uStack_81 = 0x7fa26b7d;
    if (((DAT_00ccb098 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00ccb098), iVar5 != 0)) {
                    /* try { // try from 00802080 to 0080208f has its CatchHandler @ 008021c4 */
      FUN_008032f0(&DAT_00ccb080,&local_90);
      __cxa_atexit(&LAB_00803394,&DAT_00ccb080,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccb098);
    }
    FUN_00803804(&DAT_00ccb080);
    uStack_88 = 0xc9ad486650a964;
    local_90 = (long *)0x7ccfa7496433e425;
    uStack_78 = 0xd4b7466616a17d;
    uStack_81 = 0x50b96376;
    uStack_7d = 0x63fcec4a75;
    local_71 = 0x7c;
    uStack_70 = 0xbdf84863118463;
    if (((DAT_00ccb0c8 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00ccb0c8), iVar5 != 0)) {
                    /* try { // try from 008020cc to 008020db has its CatchHandler @ 008021b4 */
      FUN_008033a0(&DAT_00ccb0a0,&local_90);
      __cxa_atexit(&LAB_008034e4,&DAT_00ccb0a0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccb0c8);
    }
    if (DAT_00ccb0c7 == '\x01') {
      DAT_00ccb0c7 = '\0';
      DAT_00ccb0c4 = DAT_00ccb0c4 ^ 0x27;
      DAT_00ccb0c5 = DAT_00ccb0c5 ^ 0xc3;
      DAT_00ccb0c6 = DAT_00ccb0c6 ^ 0xbd;
      DAT_00ccb0c0 = DAT_00ccb0c0 ^ 0x57fcd0d;
      _DAT_00ccb0a0 = _DAT_00ccb0a0 ^ 0x13bdc327057fcd0d;
      uRam0000000000ccb0a8 = uRam0000000000ccb0a8 ^ 0x13bdc327057fcd0d;
      _DAT_00ccb0b0 = _DAT_00ccb0b0 ^ 0x13bdc327057fcd0d;
      uRam0000000000ccb0b8 = uRam0000000000ccb0b8 ^ 0x13bdc327057fcd0d;
    }
    uVar7 = (**(code **)(*plVar3 + 0x108))(plVar3,uVar6,&DAT_00ccb080,&DAT_00ccb0a0);
    lVar8 = FUN_007ffe68(plVar3,DAT_00ccabc0,uVar7);
    param_1[1] = 0;
    param_1[2] = 0;
    *param_1 = 0;
    if (lVar8 != 0) {
                    /* try { // try from 00801dcc to 00801dd7 has its CatchHandler @ 008021dc */
      uVar7 = (**(code **)(*plVar3 + 0xf8))(plVar3,lVar8);
      if (((DAT_00ccb0e0 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00ccb0e0), iVar5 != 0)) {
        DAT_00ccb0d8 = '\x01';
        DAT_00ccb0d0 = 0xdd4b3c9d8ecb94e9;
        __cxa_atexit(&LAB_008034f4,&DAT_00ccb0d0,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccb0e0);
      }
      if (DAT_00ccb0d8 == '\x01') {
        DAT_00ccb0d8 = '\0';
        DAT_00ccb0d0 = DAT_00ccb0d0 ^ 0xdd3955d9efbff58d;
      }
      uStack_88 = 0x5027adbc9092e3;
      uStack_81 = 0xbfceeab3;
      local_90 = (long *)0xbc557ab899de9fc1;
      if (((DAT_00ccb100 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00ccb100), iVar5 != 0)) {
                    /* try { // try from 00802164 to 00802173 has its CatchHandler @ 008021a0 */
        FUN_008034fc(&DAT_00ccb0e8,&local_90);
        __cxa_atexit(&LAB_008035a0,&DAT_00ccb0e8,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00ccb100);
      }
      FUN_00803858(&DAT_00ccb0e8);
                    /* try { // try from 00801e60 to 00801e77 has its CatchHandler @ 008021d8 */
      uVar9 = (**(code **)(*plVar3 + 0x2f0))(plVar3,uVar7,&DAT_00ccb0d0,&DAT_00ccb0e8);
                    /* try { // try from 00801e84 to 00801e8f has its CatchHandler @ 008021e8 */
      lVar10 = (**(code **)(*plVar3 + 0x2f8))(plVar3,lVar8,uVar9);
      if (lVar10 != 0) {
                    /* try { // try from 00801ea0 to 00801eeb has its CatchHandler @ 008021e0 */
        uVar9 = (**(code **)(*plVar3 + 0x548))(plVar3,lVar10,0);
        FUN_0080269c(param_1,uVar9);
        (**(code **)(*plVar3 + 0x550))(plVar3,lVar10,uVar9);
        (**(code **)(*plVar3 + 0xb8))(plVar3,lVar10);
      }
                    /* try { // try from 00801ef4 to 00801f13 has its CatchHandler @ 008021e8 */
      (**(code **)(*plVar3 + 0xb8))(plVar3,uVar7);
      (**(code **)(*plVar3 + 0xb8))(plVar3,lVar8);
    }
                    /* try { // try from 00801f1c to 00801f3b has its CatchHandler @ 008021e4 */
    (**(code **)(*plVar3 + 0xb8))(plVar3,uVar6);
    if (iVar4 != 0) {
      (**(code **)(*DAT_00ccabb8 + 0x28))();
    }
  }
  else {
    if (((DAT_00ccb078 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00ccb078), iVar4 != 0)) {
      _DAT_00ccb070 = 0x1ed;
      __cxa_atexit(&LAB_008032e8,&DAT_00ccb070,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccb078);
    }
    if (DAT_00ccb071 == '\x01') {
      _DAT_00ccb070 = (ushort)(DAT_00ccb070 ^ 0xed);
    }
    __n = strlen((char *)&DAT_00ccb070);
    if (0xfffffffffffffff7 < __n) {
      if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_0080221c;
    }
    if (__n < 0x17) {
      __dest = (void *)((long)param_1 + 1);
      *(char *)param_1 = (char)((int)__n << 1);
      if (__n != 0) goto LAB_00801fd4;
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
LAB_00801fd4:
      memcpy(__dest,&DAT_00ccb070,__n);
    }
    *(undefined1 *)((long)__dest + __n) = 0;
  }
  if (*(long *)(lVar2 + 0x28) == local_68) {
    return;
  }
LAB_0080221c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

