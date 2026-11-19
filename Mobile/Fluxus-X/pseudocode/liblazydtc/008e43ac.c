/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e43ac
 */

void FUN_008e43ac(long param_1)

{
                    /* WARNING: Could not recover jumptable at 0x008e43b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 0x18))();
  return;
}

