/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fce48
 */

void FUN_007fce48(void)

{
  long lVar1;
  int iVar2;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_3c = 0;
  if (((DAT_00ccab88 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccab88), iVar2 != 0)) {
                    /* try { // try from 007fcf60 to 007fcf63 has its CatchHandler @ 007fd030 */
    DAT_00ccab80 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00ccab88);
  }
  CodePatch(DAT_00ccab80 + 0x66b1f90,&local_3c,4);
  if (((DAT_00ccab88 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccab88), iVar2 != 0)) {
                    /* try { // try from 007fcf98 to 007fcf9b has its CatchHandler @ 007fd02c */
    DAT_00ccab80 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00ccab88);
  }
  DobbyHook(DAT_00ccab80 + 0x274c814,FUN_007fd060,&DAT_00cca968);
  if (((DAT_00ccab88 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccab88), iVar2 != 0)) {
                    /* try { // try from 007fcfd0 to 007fcfd3 has its CatchHandler @ 007fd028 */
    DAT_00ccab80 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00ccab88);
  }
  DobbyHook(DAT_00ccab80 + 0x225856c,FUN_007fd0d4,&DAT_00cca970);
  if (((DAT_00ccab88 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccab88), iVar2 != 0)) {
    FUN_00c2fd1c(0xcca000);
    return;
  }
  DobbyHook(DAT_00ccab80 + 0x21c6e44,FUN_007fdaa0,&DAT_00cca978);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

