/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a992c4
 */

void ossl_cleanup_thread(void)

{
  FUN_00a99300(0,1);
  CRYPTO_THREAD_cleanup_local(&DAT_00cc9130);
  DAT_00cc9130 = 0xffffffffffffffff;
  return;
}

