/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008250b8
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_008250b8(ulong *param_1,undefined8 param_2)

{
  long lVar1;
  ulong uVar2;
  int iVar3;
  void *__src;
  void *__dest;
  ulong local_78;
  ulong uStack_70;
  void *local_68;
  ulong local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (((DAT_00d1cbe0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1cbe0), iVar3 != 0)) {
    _DAT_00d1cbdc = 0x13b;
    DAT_00d1cbd8 = 0xd00c228c;
    __cxa_atexit(&LAB_00826034,&DAT_00d1cbd8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cbe0);
  }
  if (DAT_00d1cbdd == '\x01') {
    _DAT_00d1cbdc = (ushort)(DAT_00d1cbdc ^ 0x3b);
    DAT_00d1cbd8 = DAT_00d1cbd8 ^ 0xb56143eb;
  }
                    /* try { // try from 00825148 to 0082515b has its CatchHandler @ 008253bc */
  FUN_008acba4(param_2,0xffffd8ee,&DAT_00d1cbd8);
                    /* try { // try from 0082515c to 00825167 has its CatchHandler @ 008253c0 */
  iVar3 = FUN_008ab0e0(param_2,0xffffffff);
  if (iVar3 != 0) {
    if (((DAT_00d1cbf0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1cbf0), iVar3 != 0)) {
      DAT_00d1cbee = '\x01';
      DAT_00d1cbe8 = 0x70e53ea9;
      _DAT_00d1cbec = 0xb985;
      __cxa_atexit(&LAB_00826040,&DAT_00d1cbe8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cbf0);
    }
    if (DAT_00d1cbee == '\x01') {
      DAT_00d1cbee = '\0';
      _DAT_00d1cbec = _DAT_00d1cbec ^ 0xb9e1;
      DAT_00d1cbe8 = DAT_00d1cbe8 ^ 0x398751e3;
    }
                    /* try { // try from 008251d0 to 008251e3 has its CatchHandler @ 008253b8 */
    FUN_008acba4(param_2,0xffffffff,&DAT_00d1cbe8);
                    /* try { // try from 008251e4 to 008251ef has its CatchHandler @ 008253c0 */
    iVar3 = FUN_008ab0e0(param_2,0xffffffff);
                    /* try { // try from 008251f8 to 00825207 has its CatchHandler @ 008253b4 */
    if ((iVar3 == 5) &&
       (__src = (void *)FUN_008ab8a4(param_2,0xffffffff,&local_60), __src != (void *)0x0)) {
      if (0xfffffffffffffff7 < local_60) {
        if (*(long *)(lVar1 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 008253ac to 008253af has its CatchHandler @ 008253b0 */
          FUN_007fe124();
        }
        goto LAB_008253f4;
      }
      if (local_60 < 0x17) {
        __dest = (void *)((ulong)&local_78 | 1);
        local_78 = CONCAT71(local_78._1_7_,(char)((int)local_60 << 1));
        if (local_60 != 0) goto LAB_00825264;
      }
      else {
        uVar2 = 0x1a;
        if ((local_60 | 7) != 0x17) {
          uVar2 = (local_60 | 7) + 1;
        }
                    /* try { // try from 0082524c to 00825253 has its CatchHandler @ 008253b0 */
        __dest = operator_new(uVar2);
        local_78 = uVar2 | 1;
        uStack_70 = local_60;
        local_68 = __dest;
LAB_00825264:
        memmove(__dest,__src,local_60);
      }
      uVar2 = *param_1;
      *(undefined1 *)((long)__dest + local_60) = 0;
      if ((uVar2 & 1) != 0) {
        operator_delete((void *)param_1[2],*param_1 & 0xfffffffffffffffe);
      }
      param_1[1] = uStack_70;
      *param_1 = local_78;
      param_1[2] = (ulong)local_68;
    }
                    /* try { // try from 008252a0 to 008252b7 has its CatchHandler @ 008253c0 */
    FUN_008aa994(param_2,0xfffffffe);
  }
  FUN_008aa994(param_2,0xfffffffe);
  if (*(long *)(lVar1 + 0x28) == local_58) {
    return;
  }
LAB_008253f4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

