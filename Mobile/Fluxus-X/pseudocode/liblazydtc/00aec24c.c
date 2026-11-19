/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aec24c
 */

void ossl_store_destroy_loaders_int(void)

{
  OPENSSL_LH_free(DAT_00d22318);
  DAT_00d22318 = 0;
  CRYPTO_THREAD_lock_free(DAT_00d22310);
  DAT_00d22310 = 0;
  return;
}

