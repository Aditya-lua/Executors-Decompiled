/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083e81c
 */

void FUN_0083e81c(void)

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
  uStack_48 = 0x5b0b591a;
  local_50 = 0xf764e4d51a1c463f;
  uStack_3c = 0x7b0b591af764e4dc;
  uStack_44 = 0xc827c5d6;
  uStack_40 = 0x170a4d1c;
  if (((DAT_00d1e3b8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e3b8), iVar2 != 0)) {
                    /* try { // try from 0083e890 to 0083e89f has its CatchHandler @ 0083e8cc */
    FUN_0083eac0(&DAT_00d1e398,&local_50);
    __cxa_atexit(&LAB_0083ebac,&DAT_00d1e398,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e3b8);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

