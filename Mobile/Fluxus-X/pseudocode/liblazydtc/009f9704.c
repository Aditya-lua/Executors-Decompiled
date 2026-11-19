/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9704
 */

void FUN_009f9704(void)

{
  int iVar1;
  long *ptr;
  void *pvVar2;
  
  ptr = (long *)CRYPTO_THREAD_get_local(&DAT_00d218ec);
  if (ptr != (long *)0x0) {
    if ((*ptr != 0) && (pvVar2 = (void *)OPENSSL_sk_pop(), pvVar2 != (void *)0x0)) {
      do {
        CRYPTO_free(*(void **)((long)pvVar2 + 0x10));
        CRYPTO_free(pvVar2);
        pvVar2 = (void *)OPENSSL_sk_pop(*ptr);
      } while (pvVar2 != (void *)0x0);
    }
    OPENSSL_sk_free(*ptr);
    CRYPTO_free(ptr);
    CRYPTO_THREAD_set_local(&DAT_00d218ec,0);
  }
  async_local_cleanup();
  pvVar2 = (void *)CRYPTO_THREAD_get_local(&DAT_00d218e8);
  iVar1 = CRYPTO_THREAD_set_local(&DAT_00d218e8,0);
  if (iVar1 == 0) {
    return;
  }
  CRYPTO_free(pvVar2);
  return;
}

