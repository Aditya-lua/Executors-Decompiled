/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82d1c
 */

byte * ossl_namemap_new(void)

{
  byte *ptr;
  long lVar1;
  
  ptr = (byte *)CRYPTO_zalloc(0x20,"crypto/core_namemap.c",0x202);
  if (ptr != (byte *)0x0) {
    lVar1 = CRYPTO_THREAD_lock_new();
    *(long *)(ptr + 8) = lVar1;
    if (lVar1 != 0) {
      lVar1 = OPENSSL_LH_new(&LAB_00a82dc4,&LAB_00a82dcc);
      *(long *)(ptr + 0x10) = lVar1;
      if (lVar1 != 0) {
        return ptr;
      }
    }
    if ((*ptr & 1) == 0) {
      OPENSSL_LH_doall(*(undefined8 *)(ptr + 0x10),&LAB_00a82e3c);
      OPENSSL_LH_free(*(undefined8 *)(ptr + 0x10));
      CRYPTO_THREAD_lock_free(*(undefined8 *)(ptr + 8));
      CRYPTO_free(ptr);
    }
  }
  return (byte *)0x0;
}

