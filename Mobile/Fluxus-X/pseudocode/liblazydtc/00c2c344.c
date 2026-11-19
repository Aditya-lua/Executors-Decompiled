/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2c344
 */

void FUN_00c2c344(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00c2c350. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x78))();
  return;
}

