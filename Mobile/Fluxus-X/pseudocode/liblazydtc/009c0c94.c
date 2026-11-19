/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0c94
 */

void tls1_free(long param_1)

{
  CRYPTO_free(*(void **)(param_1 + 0xae0));
  ssl3_free(param_1);
  return;
}

