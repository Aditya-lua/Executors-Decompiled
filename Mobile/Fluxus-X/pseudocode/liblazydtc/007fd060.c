/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fd060
 */

void FUN_007fd060(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  
  puVar1 = DAT_00cca938;
  if (0 < param_2) {
    *(undefined1 *)((long)DAT_00cca938 + 0x29) = 1;
    FUN_008046a0(DAT_00cca948);
    puVar1[1] = 0;
    puVar1[2] = 0;
    *(undefined1 *)(puVar1 + 5) = 0;
    *puVar1 = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x007fd0d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_00cca968)(param_1,param_2);
  return;
}

