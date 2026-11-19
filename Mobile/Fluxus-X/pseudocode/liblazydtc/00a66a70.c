/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66a70
 */

void evp_keymgmt_gen_cleanup(long param_1,undefined8 param_2)

{
  if (*(code **)(param_1 + 0x88) == (code *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00a66a7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 0x88))(param_2);
  return;
}

