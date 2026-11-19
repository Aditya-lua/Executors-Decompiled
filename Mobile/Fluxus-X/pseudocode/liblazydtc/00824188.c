/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824188
 */

void FUN_00824188(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_38 = 0xbd64f9e2fe2f892c;
  local_40 = 0xbd63fee4ee2e943b;
  local_30 = 0x9d72e1e3fa2bd128;
  if (((DAT_00d1cb48 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1cb48), iVar2 != 0)) {
                    /* try { // try from 008241fc to 0082420b has its CatchHandler @ 00824238 */
    FUN_00824fb8(&DAT_00d1cb28,&local_40);
    __cxa_atexit(&LAB_00825084,&DAT_00d1cb28,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cb48);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

