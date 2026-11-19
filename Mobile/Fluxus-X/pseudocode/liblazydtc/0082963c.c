/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082963c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0082963c(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  undefined8 local_50;
  undefined7 uStack_48;
  undefined4 uStack_41;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uStack_48 = 0x49e0a073f49a70;
  local_50 = 0x524aca8861f5b246;
  uStack_41 = 0x9ba37b44;
  if (((DAT_00d1d1a0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d1a0), iVar2 != 0)) {
                    /* try { // try from 008297b4 to 008297c3 has its CatchHandler @ 00829850 */
    FUN_0082b9e4(&DAT_00d1d188,&local_50);
    __cxa_atexit(&LAB_0082ba88,&DAT_00d1d188,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d1a0);
  }
  FUN_0082c254(&DAT_00d1d188);
  if (DAT_00d1d150 == 0) {
    FUN_008ac024(param_3);
    FUN_008ac024(param_3);
  }
  else {
    FUN_008acec0(param_3,0xffffd8f0);
    FUN_008acba4(param_3,0xffffffff,&DAT_00d1d188);
    FUN_008aac40(param_3,0xfffffffe);
  }
  FUN_008ac11c(param_1,param_3);
  FUN_008ac11c(param_2,param_3);
  if (((DAT_00d1d1b0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d1b0), iVar2 != 0)) {
    DAT_00d1d1a8 = 0xba546840;
    _DAT_00d1d1ac = 0x16f;
    __cxa_atexit(&LAB_0082ba94,&DAT_00d1d1a8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d1b0);
  }
  if (DAT_00d1d1ad == '\x01') {
    _DAT_00d1d1ac = (ushort)(DAT_00d1d1ac ^ 0x6f);
    DAT_00d1d1a8 = DAT_00d1d1a8 ^ 0xdf390927;
  }
  FUN_008acba4(param_3,0xffffd8ee,&DAT_00d1d1a8);
  FUN_008add48(param_3,4,0);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

