/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b131e0
 */

void ossl_policy_cache_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  ossl_policy_data_free(*param_1);
  OPENSSL_sk_pop_free(param_1[1],ossl_policy_data_free);
  CRYPTO_free(param_1);
  return;
}

