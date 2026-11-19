/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a68650
 */

void EVP_MAC_init(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00a68658. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x48))(param_1[1]);
  return;
}

