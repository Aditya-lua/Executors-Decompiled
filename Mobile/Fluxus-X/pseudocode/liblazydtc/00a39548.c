/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a39548
 */

void ossl_ec_GFp_simple_group_finish(long param_1)

{
  BN_free(*(BIGNUM **)(param_1 + 0x40));
  BN_free(*(BIGNUM **)(param_1 + 0x60));
  BN_free(*(BIGNUM **)(param_1 + 0x68));
  return;
}

