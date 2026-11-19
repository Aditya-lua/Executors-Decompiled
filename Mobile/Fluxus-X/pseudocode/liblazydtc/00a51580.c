/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51580
 */

void engine_cleanup_int(void)

{
  if (DAT_00d21998 != 0) {
    OPENSSL_sk_pop_free(DAT_00d21998,&LAB_00a515c8);
    DAT_00d21998 = 0;
  }
  CRYPTO_THREAD_lock_free(global_engine_lock);
  global_engine_lock = 0;
  return;
}

