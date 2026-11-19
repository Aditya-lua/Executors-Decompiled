/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccc04
 */

void FUN_00bccc04(undefined8 *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00bccc10. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)*param_1)();
  return;
}

