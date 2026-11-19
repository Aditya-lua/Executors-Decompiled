/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0caf0
 */

void ossl_config_modules_free(void)

{
  CONF_modules_unload(1);
  CRYPTO_THREAD_lock_free(DAT_00d21928);
  DAT_00d21928 = 0;
  OPENSSL_sk_free(DAT_00d21930);
  DAT_00d21930 = 0;
  OPENSSL_sk_free(DAT_00d21948);
  DAT_00d21948 = 0;
  return;
}

