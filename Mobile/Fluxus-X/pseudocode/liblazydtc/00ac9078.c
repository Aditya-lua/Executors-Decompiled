/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9078
 */

long * FUN_00ac9078(void)

{
  int iVar1;
  long *ptr;
  long lVar2;
  
  ptr = (long *)CRYPTO_zalloc(0x50,"crypto/rand/rand_lib.c",0x1be);
  if (ptr != (long *)0x0) {
    OPENSSL_init_crypto(0x40000,0);
    lVar2 = CRYPTO_THREAD_lock_new();
    *ptr = lVar2;
    if (lVar2 != 0) {
      iVar1 = CRYPTO_THREAD_init_local((long)ptr + 0x1c,0);
      if (iVar1 != 0) {
        iVar1 = CRYPTO_THREAD_init_local(ptr + 3,0);
        if (iVar1 != 0) {
          return ptr;
        }
        CRYPTO_THREAD_cleanup_local((long)ptr + 0x1c);
      }
    }
    CRYPTO_THREAD_lock_free(*ptr);
    CRYPTO_free(ptr);
  }
  return (long *)0x0;
}

