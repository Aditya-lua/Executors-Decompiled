/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0df8
 */

void SSL_CIPHER_find(long param_1,undefined8 param_2)

{
                    /* WARNING: Could not recover jumptable at 0x009b0e04. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(param_1 + 8) + 0x90))(param_2);
  return;
}

