/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f85c
 */

void EVP_MD_meth_free(void *param_1)

{
  if ((param_1 == (void *)0x0) || (*(int *)((long)param_1 + 0x18) != 2)) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 0x60));
  ossl_provider_free(*(undefined8 *)((long)param_1 + 0x70));
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x80));
  CRYPTO_free(param_1);
  return;
}

