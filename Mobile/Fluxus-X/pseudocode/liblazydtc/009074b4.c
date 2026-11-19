/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009074b4
 */

void FUN_009074b4(long *param_1)

{
  if (param_1 == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x009074c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x20))();
  return;
}

