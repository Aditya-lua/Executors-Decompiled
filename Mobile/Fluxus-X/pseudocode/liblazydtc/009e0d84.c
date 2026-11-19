/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0d84
 */

void dtls1_hm_fragment_free(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 0x58));
  CRYPTO_free(*(void **)((long)param_1 + 0x60));
  CRYPTO_free(param_1);
  return;
}

