/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13c18
 */

void SCT_free(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 0x18));
  CRYPTO_free(*(void **)((long)param_1 + 0x30));
  CRYPTO_free(*(void **)((long)param_1 + 0x48));
  CRYPTO_free(*(void **)((long)param_1 + 8));
  CRYPTO_free(param_1);
  return;
}

