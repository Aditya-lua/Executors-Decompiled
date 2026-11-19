/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2780
 */

void ossl_provider_info_clear(undefined8 *param_1)

{
  CRYPTO_free((void *)*param_1);
  CRYPTO_free((void *)param_1[1]);
  OPENSSL_sk_pop_free(param_1[3],FUN_00aa27d0);
  return;
}

