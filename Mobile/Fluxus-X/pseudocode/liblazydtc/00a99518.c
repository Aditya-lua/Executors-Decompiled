/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99518
 */

void OPENSSL_thread_stop(void)

{
  void *ptr;
  
  if (DAT_00cc9130 == -1) {
    return;
  }
  ptr = (void *)CRYPTO_THREAD_get_local(&DAT_00cc9130);
  CRYPTO_THREAD_set_local(&DAT_00cc9130,0);
  FUN_00a99588(0,ptr);
  FUN_00a9968c(ptr);
  CRYPTO_free(ptr);
  return;
}

