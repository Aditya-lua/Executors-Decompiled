/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082c31c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0082c31c(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined1 *local_50;
  undefined8 uStack_48;
  undefined4 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1d4a8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d4a8), iVar2 != 0)) {
    DAT_00d1d498 = 0xe697b08da695c8cc;
    DAT_00d1d4a0 = 0xbc84cec5;
    _DAT_00d1d4a4 = 0x1e3;
    __cxa_atexit(&LAB_0082e184,&DAT_00d1d498,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d4a8);
  }
  if (DAT_00d1d4a5 == '\x01') {
    _DAT_00d1d4a4 = (ushort)(DAT_00d1d4a4 ^ 0xe3);
    DAT_00d1d498 = DAT_00d1d498 ^ 0x87e3c3e3cfe1adab;
    DAT_00d1d4a0 = DAT_00d1d4a0 ^ 0xcfe1adab;
  }
  FUN_008ac76c(param_1,&LAB_0082c900,&DAT_00d1d498,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1d450,&local_50,&local_50);
  local_50 = &LAB_0082c900;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d498);
  uStack_48 = 0x799ac0b4879e9150;
  local_50 = (undefined1 *)0x1780c9be878b8044;
  if (((DAT_00d1d4d8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d4d8), iVar2 != 0)) {
                    /* try { // try from 0082c784 to 0082c793 has its CatchHandler @ 0082c8d4 */
    FUN_0082e19c(&DAT_00d1d4c0,&local_50);
    __cxa_atexit(&LAB_0082e228,&DAT_00d1d4c0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d4d8);
  }
  if (DAT_00d1d4d0 == '\x01') {
    DAT_00d1d4d0 = '\0';
    _DAT_00d1d4c0 = _DAT_00d1d4c0 ^ 0x79e9a5d7e9ffe523;
    uRam0000000000d1d4c8 = uRam0000000000d1d4c8 ^ 0x79e9a5d7e9ffe523;
  }
  FUN_008ac76c(param_1,&LAB_0082c99c,&DAT_00d1d4c0,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1d450,&local_50,&local_50);
  local_50 = &LAB_0082c99c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d4c0);
  local_40 = CONCAT22(local_40._2_2_,0x3d2b);
  uStack_48 = 0xb8f6cd32bf575437;
  local_50 = (undefined1 *)0xa8e6d023ae4b5439;
  if (((DAT_00d1d578 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d578), iVar2 != 0)) {
                    /* try { // try from 0082c7d0 to 0082c7df has its CatchHandler @ 0082c8c4 */
    FUN_0082e608(&DAT_00d1d560,&local_50);
    __cxa_atexit(&LAB_0082e6a4,&DAT_00d1d560,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d578);
  }
  FUN_0082f02c(&DAT_00d1d560);
  FUN_008ac76c(param_1,&LAB_0082cbd0,&DAT_00d1d560,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1d450,&local_50,&local_50);
  local_50 = &LAB_0082cbd0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d560);
  uStack_48 = 0xf0e58b9a1b4462d2;
  local_50 = (undefined1 *)0xe7f889930a5f66dd;
  local_40 = 0x6f597fd6;
  if (((DAT_00d1d630 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d630), iVar2 != 0)) {
                    /* try { // try from 0082c81c to 0082c82b has its CatchHandler @ 0082c8b4 */
    FUN_0082ea10(&DAT_00d1d618,&local_50);
    __cxa_atexit(&LAB_0082eabc,&DAT_00d1d618,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d630);
  }
  FUN_0082f074(&DAT_00d1d618);
  FUN_008ac76c(param_1,&LAB_0082cfc0,&DAT_00d1d618,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1d450,&local_50,&local_50);
  local_50 = &LAB_0082cfc0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d618);
  local_40 = CONCAT22(local_40._2_2_,0x914d);
  uStack_48 = 0x8af918442d86f554;
  local_50 = (undefined1 *)0x86e417423c91f859;
  if (((DAT_00d1d788 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d788), iVar2 != 0)) {
                    /* try { // try from 0082c868 to 0082c877 has its CatchHandler @ 0082c8a4 */
    FUN_0082ef84(&DAT_00d1d770,&local_50);
    __cxa_atexit(&LAB_0082f020,&DAT_00d1d770,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d788);
  }
  FUN_0082f0b8(&DAT_00d1d770);
  FUN_008ac76c(param_1,&LAB_0082d4a0,&DAT_00d1d770,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1d450,&local_50,&local_50);
  local_50 = &LAB_0082d4a0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d770);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

