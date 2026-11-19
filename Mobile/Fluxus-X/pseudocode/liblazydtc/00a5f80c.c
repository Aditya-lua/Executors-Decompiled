/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f80c
 */

void evp_md_free_int(void *param_1)

{
  CRYPTO_free(*(void **)((long)param_1 + 0x60));
  ossl_provider_free(*(undefined8 *)((long)param_1 + 0x70));
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x80));
  CRYPTO_free(param_1);
  return;
}

