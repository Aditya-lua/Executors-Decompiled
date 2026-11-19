/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fd008
 */

void FUN_007fd008(void)

{
  undefined8 uVar1;
  long unaff_x19;
  long unaff_x29;
  long in_stack_00000008;
  
                    /* try { // try from 007fd008 to 007fd00b has its CatchHandler @ 007fd024 */
  uVar1 = FUN_007fe1ec();
  *(undefined8 *)(unaff_x19 + 0xb80) = uVar1;
  __cxa_guard_release(&DAT_00ccab88);
  DobbyHook(*(long *)(unaff_x19 + 0xb80) + 0x21c6e44,&LAB_007fdaa0,&DAT_00cca978);
  if (*(long *)(in_stack_00000008 + 0x28) != *(long *)(unaff_x29 + -8)) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

