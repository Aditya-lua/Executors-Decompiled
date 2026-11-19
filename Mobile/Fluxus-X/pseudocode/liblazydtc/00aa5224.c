/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5224
 */

void OSSL_SELF_TEST_free(void *param_1)

{
  CRYPTO_free(param_1);
  return;
}

