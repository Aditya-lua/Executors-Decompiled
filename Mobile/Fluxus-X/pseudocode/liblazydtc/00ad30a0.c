/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad30a0
 */

void ossl_rsa_multip_info_free(undefined8 *param_1)

{
  BN_clear_free((BIGNUM *)*param_1);
  BN_clear_free((BIGNUM *)param_1[1]);
  BN_clear_free((BIGNUM *)param_1[2]);
  BN_clear_free((BIGNUM *)param_1[3]);
  CRYPTO_free(param_1);
  return;
}

