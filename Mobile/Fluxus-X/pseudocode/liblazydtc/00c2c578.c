/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2c578
 */

void FUN_00c2c578(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00c2c588. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x40))(param_1,1);
  return;
}

