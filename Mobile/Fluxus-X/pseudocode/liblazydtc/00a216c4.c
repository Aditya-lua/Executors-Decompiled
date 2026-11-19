/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a216c4
 */

undefined8 FUN_00a216c4(long param_1)

{
  BN_MONT_CTX_free(*(BN_MONT_CTX **)(param_1 + 0x80));
  return 1;
}

