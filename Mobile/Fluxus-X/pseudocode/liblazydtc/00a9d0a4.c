/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d0a4
 */

void * OSSL_PARAM_BLD_new(void)

{
  void *ptr;
  long lVar1;
  
  ptr = (void *)CRYPTO_zalloc(0x18,"crypto/param_build.c",0x5d);
  if (ptr != (void *)0x0) {
    lVar1 = OPENSSL_sk_new_null();
    *(long *)((long)ptr + 0x10) = lVar1;
    if (lVar1 == 0) {
      CRYPTO_free(ptr);
      ptr = (void *)0x0;
    }
  }
  return ptr;
}

