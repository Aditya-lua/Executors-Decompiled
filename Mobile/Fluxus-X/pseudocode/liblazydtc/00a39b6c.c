/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a39b6c
 */

void ossl_ec_GFp_simple_point_finish(long param_1)

{
  BN_free(*(BIGNUM **)(param_1 + 0x10));
  BN_free(*(BIGNUM **)(param_1 + 0x18));
  BN_free(*(BIGNUM **)(param_1 + 0x20));
  return;
}

