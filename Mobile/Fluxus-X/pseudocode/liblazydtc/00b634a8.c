/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b634a8
 */

void FUN_00b634a8(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 8));
  if (*(int *)((long)param_1 + 0x10) != 1) {
    OSSL_DECODER_CTX_free(*(undefined8 *)((long)param_1 + 0x20));
    CRYPTO_free(*(void **)((long)param_1 + 0x30));
    CRYPTO_free(*(void **)((long)param_1 + 0x28));
  }
  CRYPTO_free(param_1);
  return;
}

