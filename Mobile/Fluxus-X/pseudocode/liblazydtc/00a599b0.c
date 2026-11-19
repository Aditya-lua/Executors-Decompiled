/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a599b0
 */

void EVP_ENCODE_CTX_free(void *param_1)

{
  CRYPTO_free(param_1);
  return;
}

