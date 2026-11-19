/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66970
 */

void evp_keymgmt_freedata(long param_1,undefined8 param_2)

{
                    /* WARNING: Could not recover jumptable at 0x00a66978. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 0x38))(param_2);
  return;
}

