/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080ea2c
 */

void FUN_0080ea2c(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined1 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_38 = 0x5bbae10aa9e06267;
  local_40 = 0xae9b05df8b36a6f;
  local_30 = 0x5f;
  if (((DAT_00d1b980 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1b980), iVar2 != 0)) {
                    /* try { // try from 0080eaa0 to 0080eaaf has its CatchHandler @ 0080eadc */
    FUN_0080eb08(&DAT_00d1b968,&local_40);
    __cxa_atexit(&LAB_0080eb9c,&DAT_00d1b968,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b980);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

