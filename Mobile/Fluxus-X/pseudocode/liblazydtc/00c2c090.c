/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2c090
 */

void FUN_00c2c090(long param_1)

{
  undefined1 auStack_4a0 [624];
  undefined1 auStack_230 [528];
  
  FUN_00c2fc80(auStack_230);
  if (*(long *)(param_1 + 0x10) == 0) {
    FUN_00c2be38(auStack_230,auStack_4a0,param_1);
  }
  else {
    FUN_00c2c114(auStack_230,auStack_4a0,param_1,*(long *)(param_1 + 0x10),
                 *(undefined8 *)(param_1 + 0x18));
  }
  fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","_Unwind_Resume",
          "_Unwind_Resume() can\'t return");
  fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
  abort();
}

