/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b98fc
 */

void FUN_009b98fc(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 8));
  EVP_PKEY_free(*(EVP_PKEY **)((long)param_1 + 0x18));
  CRYPTO_free(param_1);
  return;
}

