/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824ea0
 */

void FUN_00824ea0(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  undefined7 uStack_38;
  undefined4 uStack_31;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_38 = 0x2fbcda45ad9079;
  local_40 = 0x3134a9c710ba9b78;
  uStack_31 = 0xc991622b;
  if (((DAT_00d1cec8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1cec8), iVar2 != 0)) {
                    /* try { // try from 00824f18 to 00824f27 has its CatchHandler @ 00824f54 */
    FUN_008274d8(&DAT_00d1ceb0,&local_40);
    __cxa_atexit(&LAB_0082757c,&DAT_00d1ceb0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cec8);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

