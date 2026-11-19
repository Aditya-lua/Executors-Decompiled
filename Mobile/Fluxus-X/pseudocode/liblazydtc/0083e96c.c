/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083e96c
 */

void FUN_0083e96c(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_50;
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined4 uStack_40;
  undefined8 uStack_3c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_48 = 0x2dc505ce;
  local_50 = 0x37f266196cd21aeb;
  uStack_3c = 0xdc505ce37f26610;
  uStack_44 = 0x8b1471a;
  uStack_40 = 0x61c411c8;
  if (((DAT_00d1e428 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e428), iVar2 != 0)) {
                    /* try { // try from 0083e9e0 to 0083e9ef has its CatchHandler @ 0083ea1c */
    FUN_0083ebe0(&DAT_00d1e408,&local_50);
    __cxa_atexit(&LAB_0083eccc,&DAT_00d1e408,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e428);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

