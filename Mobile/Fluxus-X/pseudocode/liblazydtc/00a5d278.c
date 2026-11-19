/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5d278
 */

void evp_cipher_free_int(void *param_1)

{
  CRYPTO_free(*(void **)((long)param_1 + 0x68));
  ossl_provider_free(*(undefined8 *)((long)param_1 + 0x78));
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x88));
  CRYPTO_free(param_1);
  return;
}

