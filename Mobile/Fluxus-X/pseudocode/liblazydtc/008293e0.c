/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008293e0
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_008293e0(undefined8 param_1,undefined8 param_2,undefined8 param_3,int param_4,uint param_5)

{
  long lVar1;
  int iVar2;
  undefined8 local_60;
  undefined5 uStack_58;
  undefined3 uStack_53;
  undefined5 uStack_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uStack_58 = 0xd57d4e0154;
  local_60 = 0xb21cbcec6d552662;
  uStack_53 = 0x8407bc;
  uStack_50 = 0xa17d552647;
  if (((DAT_00d1d170 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d170), iVar2 != 0)) {
                    /* try { // try from 00829588 to 00829597 has its CatchHandler @ 00829610 */
    FUN_0082b918(&DAT_00d1d154,&local_60);
    __cxa_atexit(&LAB_0082b9cc,&DAT_00d1d154,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d170);
  }
  FUN_0082c200(&DAT_00d1d154);
  if (DAT_00d1d150 == 0) {
    FUN_008ac024(param_3);
    FUN_008ac024(param_3);
  }
  else {
    FUN_008acec0(param_3,0xffffd8f0);
    FUN_008acba4(param_3,0xffffffff,&DAT_00d1d154);
    FUN_008aac40(param_3,0xfffffffe);
  }
  FUN_008ac11c(param_1,param_3);
  FUN_008ac11c(param_2,param_3);
  FUN_008ac11c((double)param_4,param_3);
  FUN_008ac964(param_3,param_5 & 1);
  if (((DAT_00d1d180 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d180), iVar2 != 0)) {
    _DAT_00d1d17c = 0x1ed;
    DAT_00d1d178 = 0x1e0860ce;
    __cxa_atexit(&LAB_0082b9d8,&DAT_00d1d178,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d180);
  }
  if (DAT_00d1d17d == '\x01') {
    _DAT_00d1d17c = (ushort)(DAT_00d1d17c ^ 0xed);
    DAT_00d1d178 = DAT_00d1d178 ^ 0x7b6501a9;
  }
  FUN_008acba4(param_3,0xffffd8ee,&DAT_00d1d178);
  FUN_008ac964(param_3,0);
  FUN_008add48(param_3,7,0);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

