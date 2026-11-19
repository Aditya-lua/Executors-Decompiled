/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e47c8
 */

void FUN_008e47c8(long param_1)

{
                    /* WARNING: Could not recover jumptable at 0x008e47d4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(param_1 + 8) + 0x20))();
  return;
}

