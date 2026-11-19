/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b64e30
 */

void ossl_prov_ctx_free(void *param_1)

{
  CRYPTO_free(param_1);
  return;
}

