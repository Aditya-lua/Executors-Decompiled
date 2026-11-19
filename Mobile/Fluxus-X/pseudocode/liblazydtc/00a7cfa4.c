/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7cfa4
 */

void ossl_ffc_params_cleanup(undefined8 *param_1)

{
  BN_free((BIGNUM *)*param_1);
  BN_free((BIGNUM *)param_1[1]);
  BN_free((BIGNUM *)param_1[2]);
  BN_free((BIGNUM *)param_1[3]);
  CRYPTO_free((void *)param_1[4]);
  memset(param_1,0,0x60);
  *(undefined4 *)(param_1 + 6) = 0xffffffff;
  *(undefined4 *)(param_1 + 7) = 0xffffffff;
  *(undefined4 *)(param_1 + 8) = 3;
  return;
}

