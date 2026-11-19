/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53e64
 */

void err_cleanup(void)

{
  if (DAT_00d21a18 == '\x01') {
    CRYPTO_THREAD_cleanup_local(&DAT_00d21a1c);
  }
  CRYPTO_THREAD_lock_free(DAT_00d21a20);
  DAT_00d21a20 = 0;
  OPENSSL_LH_free(DAT_00d21a28);
  DAT_00d21a28 = 0;
  return;
}

