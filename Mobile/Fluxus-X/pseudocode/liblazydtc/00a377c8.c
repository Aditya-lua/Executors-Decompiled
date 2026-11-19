/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a377c8
 */

void ossl_ec_GFp_mont_group_finish(long param_1)

{
  BN_MONT_CTX_free(*(BN_MONT_CTX **)(param_1 + 0x78));
  *(undefined8 *)(param_1 + 0x78) = 0;
  BN_free(*(BIGNUM **)(param_1 + 0x80));
  *(undefined8 *)(param_1 + 0x80) = 0;
  ossl_ec_GFp_simple_group_finish(param_1);
  return;
}

