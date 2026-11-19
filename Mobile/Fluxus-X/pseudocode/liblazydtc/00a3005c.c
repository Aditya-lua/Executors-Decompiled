/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3005c
 */

void EC_KEY_METHOD_free(void *param_1)

{
  if ((*(byte *)((long)param_1 + 8) & 1) == 0) {
    return;
  }
  CRYPTO_free(param_1);
  return;
}

