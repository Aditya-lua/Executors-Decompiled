/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5cc78
 */

void * evp_cipher_new(void)

{
  void *ptr;
  long lVar1;
  
  ptr = (void *)CRYPTO_zalloc(0x100,"crypto/evp/evp_enc.c",0x5c5);
  if (ptr != (void *)0x0) {
    lVar1 = CRYPTO_THREAD_lock_new();
    *(long *)((long)ptr + 0x88) = lVar1;
    if (lVar1 == 0) {
      CRYPTO_free(ptr);
      ptr = (void *)0x0;
    }
    else {
      *(undefined4 *)((long)ptr + 0x80) = 1;
    }
  }
  return ptr;
}

