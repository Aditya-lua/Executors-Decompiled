/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59018
 */

void * evp_md_new(void)

{
  void *ptr;
  long lVar1;
  
  ptr = (void *)CRYPTO_zalloc(0xf0,"crypto/evp/digest.c",0x35f);
  if (ptr != (void *)0x0) {
    lVar1 = CRYPTO_THREAD_lock_new();
    *(long *)((long)ptr + 0x80) = lVar1;
    if (lVar1 == 0) {
      CRYPTO_free(ptr);
      ptr = (void *)0x0;
    }
    else {
      *(undefined4 *)((long)ptr + 0x78) = 1;
    }
  }
  return ptr;
}

