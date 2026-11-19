/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba2f4
 */

void SSL_CONF_CTX_free(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 0x30));
  CRYPTO_free(*(void **)((long)param_1 + 0x38));
  CRYPTO_free(*(void **)((long)param_1 + 0x40));
  CRYPTO_free(*(void **)((long)param_1 + 0x48));
  CRYPTO_free(*(void **)((long)param_1 + 0x50));
  CRYPTO_free(*(void **)((long)param_1 + 0x58));
  CRYPTO_free(*(void **)((long)param_1 + 0x60));
  CRYPTO_free(*(void **)((long)param_1 + 0x68));
  CRYPTO_free(*(void **)((long)param_1 + 0x70));
  CRYPTO_free(*(void **)((long)param_1 + 8));
  OPENSSL_sk_pop_free(*(undefined8 *)((long)param_1 + 0xa8),X509_NAME_free);
  CRYPTO_free(param_1);
  return;
}

