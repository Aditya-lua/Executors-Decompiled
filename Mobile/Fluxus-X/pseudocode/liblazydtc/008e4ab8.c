/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4ab8
 */

void FUN_008e4ab8(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x008e4ac0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x40))();
  return;
}

