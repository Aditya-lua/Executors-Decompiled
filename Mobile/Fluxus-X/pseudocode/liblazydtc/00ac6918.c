/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac6918
 */

void ossl_property_free(void *param_1)

{
  CRYPTO_free(param_1);
  return;
}

