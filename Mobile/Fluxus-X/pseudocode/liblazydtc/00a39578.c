/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a39578
 */

void ossl_ec_GFp_simple_group_clear_finish(long param_1)

{
  BN_clear_free(*(BIGNUM **)(param_1 + 0x40));
  BN_clear_free(*(BIGNUM **)(param_1 + 0x60));
  BN_clear_free(*(BIGNUM **)(param_1 + 0x68));
  return;
}

