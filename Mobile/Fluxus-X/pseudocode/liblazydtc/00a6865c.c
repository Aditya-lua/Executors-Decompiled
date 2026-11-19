/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6865c
 */

void EVP_MAC_update(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00a68664. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x50))(param_1[1]);
  return;
}

