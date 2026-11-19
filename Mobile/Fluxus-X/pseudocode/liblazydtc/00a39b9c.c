/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a39b9c
 */

void ossl_ec_GFp_simple_point_clear_finish(long param_1)

{
  BN_clear_free(*(BIGNUM **)(param_1 + 0x10));
  BN_clear_free(*(BIGNUM **)(param_1 + 0x18));
  BN_clear_free(*(BIGNUM **)(param_1 + 0x20));
  *(undefined4 *)(param_1 + 0x28) = 0;
  return;
}

