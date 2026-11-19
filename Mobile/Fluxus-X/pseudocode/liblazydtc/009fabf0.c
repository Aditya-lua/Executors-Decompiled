/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fabf0
 */

void BIO_ADDR_free(void *param_1)

{
  CRYPTO_free(param_1);
  return;
}

