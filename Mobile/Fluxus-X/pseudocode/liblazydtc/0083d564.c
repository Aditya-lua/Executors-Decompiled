/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083d564
 */

void FUN_0083d564(void)

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
  uStack_38 = 0xb33ee7a20913;
  local_40 = 0x715a837f6bb150a;
  uStack_32 = 0x5e05;
  uStack_30 = 0xc17ce4e85c43;
  if (((DAT_00d1e280 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e280), iVar2 != 0)) {
                    /* try { // try from 0083d5d8 to 0083d5e7 has its CatchHandler @ 0083d614 */
    FUN_0083d6a0(&DAT_00d1e268,&local_40);
    __cxa_atexit(&LAB_0083d75c,&DAT_00d1e268,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e280);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

