/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff658
 */

void Java_com_lazyexec_exe_MainActivity_getExec(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x007ff668. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x538))(param_1,DAT_00cca878);
  return;
}

