/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083c5a4
 */

void FUN_0083c5a4(void)

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
  uStack_38 = 0x6de2591e512d;
  local_40 = 0x993176eb48074d34;
  uStack_32 = 0xc021;
  uStack_30 = 0x1fa05a54047d;
  if (((DAT_00d1e208 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e208), iVar2 != 0)) {
                    /* try { // try from 0083c618 to 0083c627 has its CatchHandler @ 0083c654 */
    FUN_0083c80c(&DAT_00d1e1f0,&local_40);
    __cxa_atexit(&LAB_0083c8c8,&DAT_00d1e1f0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e208);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

