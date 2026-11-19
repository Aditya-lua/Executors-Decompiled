/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083d810
 */

void FUN_0083d810(void)

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
  uStack_38 = 0x518887668141;
  local_40 = 0xef4d4a81967f9d58;
  uStack_32 = 0xb65d;
  uStack_30 = 0x23ca842cd411;
  if (((DAT_00d1e2c0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e2c0), iVar2 != 0)) {
                    /* try { // try from 0083d884 to 0083d893 has its CatchHandler @ 0083d8c0 */
    FUN_0083d950(&DAT_00d1e2a8,&local_40);
    __cxa_atexit(&LAB_0083da0c,&DAT_00d1e2a8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e2c0);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

