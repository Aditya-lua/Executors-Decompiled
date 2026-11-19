/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4fd40
 */

void FUN_00a4fd40(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  OPENSSL_sk_pop_free(*(undefined8 *)((long)param_1 + 0x18),EVP_KEYMGMT_free);
  CRYPTO_free(*(void **)((long)param_1 + 8));
  CRYPTO_free(*(void **)((long)param_1 + 0x20));
  CRYPTO_free(param_1);
  return;
}

