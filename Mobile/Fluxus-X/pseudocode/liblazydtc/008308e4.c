/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008308e4
 */

void FUN_008308e4(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  undefined6 uStack_38;
  undefined2 uStack_32;
  undefined6 uStack_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_38 = 0xec2f7386f15d;
  local_40 = 0xbf7aa96a738dfe09;
  uStack_32 = 0xbd6d;
  uStack_30 = 0x896b7a9bfc18;
  if (((DAT_00d1d7f8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d7f8), iVar2 != 0)) {
                    /* try { // try from 00830958 to 00830967 has its CatchHandler @ 00830994 */
    FUN_00830a20(&DAT_00d1d7e0,&local_40);
    __cxa_atexit(&LAB_00830adc,&DAT_00d1d7e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d7f8);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

