/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aead94
 */

void OSSL_STORE_SEARCH_free(void *param_1)

{
  CRYPTO_free(param_1);
  return;
}

