/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e448
 */

undefined4 * ossl_core_bio_new_file(char *param_1,char *param_2)

{
  BIO *a;
  undefined4 *ptr;
  long lVar1;
  
  a = BIO_new_file(param_1,param_2);
  if (a != (BIO *)0x0) {
    ptr = CRYPTO_malloc(0x18,"crypto/bio/ossl_core_bio.c",0x1a);
    if (ptr != (undefined4 *)0x0) {
      lVar1 = CRYPTO_THREAD_lock_new();
      *(long *)(ptr + 2) = lVar1;
      if (lVar1 != 0) {
        *ptr = 1;
        *(BIO **)(ptr + 4) = a;
        return ptr;
      }
    }
    CRYPTO_free(ptr);
    BIO_free(a);
  }
  return (undefined4 *)0x0;
}

