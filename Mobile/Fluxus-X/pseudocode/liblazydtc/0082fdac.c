/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082fdac
 */

undefined8 FUN_0082fdac(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  FUN_008af0d0(param_1,1);
  iVar2 = FUN_008ab0e0(param_1,2);
  if ((iVar2 != 0) && (iVar2 != 6)) goto LAB_0082fee8;
  FUN_008aaf04(param_1,2);
  iVar2 = FUN_008adbdc(param_1,1);
  if (iVar2 == 0) {
    uStack_38 = 0xbe0ef3d1ba5c8532;
    local_40 = 0xaf43b7c0b346c43b;
    local_30 = 0xdb06bfc7be5bc429;
    if ((DAT_00d1d820 & 1) == 0) goto LAB_0082ff18;
    while( true ) {
      if (DAT_00d1d818 == '\x01') {
        DAT_00d1d818 = '\0';
        DAT_00d1d800 = DAT_00d1d800 ^ 0xdb63d3a5df2fa55d;
        DAT_00d1d808 = DAT_00d1d808 ^ 0xdb63d3a5df2fa55d;
        DAT_00d1d810 = DAT_00d1d810 ^ 0xdb63d3a5df2fa55d;
      }
      FUN_008aee78(param_1,1);
      FUN_008ac684(param_1,&DAT_002b6c62,&DAT_00d1d800);
      FUN_008ae364(param_1,2);
      if (*(long *)(lVar1 + 0x28) != local_28) break;
      FUN_008aa5f4(param_1);
LAB_0082fee8:
      FUN_008308e4();
      if (*(long *)(lVar1 + 0x28) != local_28) break;
      uVar3 = FUN_008309c0(&DAT_00d1d7e0);
      FUN_008aec14(param_1,2,uVar3);
LAB_0082ff18:
      iVar2 = __cxa_guard_acquire(&DAT_00d1d820);
      if (iVar2 != 0) {
                    /* try { // try from 0082ff28 to 0082ff37 has its CatchHandler @ 0082ff64 */
        FUN_00830ae8(&DAT_00d1d800,&local_40);
        __cxa_atexit(&LAB_00830bb4,&DAT_00d1d800,&PTR_LOOP_00c48880);
        __cxa_guard_release(&DAT_00d1d820);
      }
    }
  }
  else if (*(long *)(lVar1 + 0x28) == local_28) {
    FUN_008aaf04(param_1,1);
    return 1;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

