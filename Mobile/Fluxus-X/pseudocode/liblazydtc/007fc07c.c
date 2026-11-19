/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc07c
 */

void _INIT_7(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined1 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (((DAT_00cca8b0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00cca8b0), iVar2 != 0)) {
    local_30 = 0x45;
    uStack_38 = 0x2b072001a3b5ec22;
    local_40 = 0x31002f5eabb2e523;
    if (((DAT_00cca9d8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00cca9d8), iVar2 != 0)) {
                    /* try { // try from 007fc134 to 007fc143 has its CatchHandler @ 007fc170 */
      FUN_007fdd5c(&DAT_00cca9c0,&local_40);
      __cxa_atexit(&LAB_007fddf0,&DAT_00cca9c0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00cca9d8);
    }
    FUN_007fe8c0(&DAT_00cca9c0);
    DAT_00cca8a8 = &DAT_00cca9c0;
    __cxa_guard_release(&DAT_00cca8b0);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

