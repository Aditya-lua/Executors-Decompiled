/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66b68
 */

void evp_keymgmt_has(long param_1,undefined8 param_2,undefined4 param_3)

{
                    /* WARNING: Could not recover jumptable at 0x00a66b74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 0xa0))(param_2,param_3);
  return;
}

