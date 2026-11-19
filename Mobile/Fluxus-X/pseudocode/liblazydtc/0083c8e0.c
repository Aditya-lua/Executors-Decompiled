/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083c8e0
 */

void FUN_0083c8e0(void)

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
  uStack_38 = 0x6766e9168371;
  local_40 = 0xb717c6ff80f9f68;
  uStack_32 = 0x5261;
  uStack_30 = 0x1524ea5cd621;
  if (((DAT_00d1e248 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e248), iVar2 != 0)) {
                    /* try { // try from 0083c954 to 0083c963 has its CatchHandler @ 0083c990 */
    FUN_0083c9bc(&DAT_00d1e230,&local_40);
    __cxa_atexit(&LAB_0083ca78,&DAT_00d1e230,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e248);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

