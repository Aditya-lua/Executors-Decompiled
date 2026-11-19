/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f947c
 */

void async_deinit(void)

{
  CRYPTO_THREAD_cleanup_local(&DAT_00d218e8);
  CRYPTO_THREAD_cleanup_local(&DAT_00d218ec);
  return;
}

