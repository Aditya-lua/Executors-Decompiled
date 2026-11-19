/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac865c
 */

void ossl_rand_ctx_free(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  CRYPTO_THREAD_lock_free(*param_1);
  CRYPTO_THREAD_cleanup_local((long)param_1 + 0x1c);
  CRYPTO_THREAD_cleanup_local(param_1 + 3);
  EVP_RAND_CTX_free(param_1[2]);
  EVP_RAND_CTX_free(param_1[1]);
  CRYPTO_free((void *)param_1[4]);
  CRYPTO_free((void *)param_1[5]);
  CRYPTO_free((void *)param_1[6]);
  CRYPTO_free((void *)param_1[7]);
  CRYPTO_free((void *)param_1[8]);
  CRYPTO_free((void *)param_1[9]);
  CRYPTO_free(param_1);
  return;
}

