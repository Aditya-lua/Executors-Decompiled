/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac401c
 */

undefined8 * ossl_method_store_new(undefined8 param_1)

{
  undefined8 *ptr;
  long lVar1;
  undefined8 uVar2;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x30,"crypto/property/property.c",0xfc);
  if (ptr != (undefined8 *)0x0) {
    *ptr = param_1;
    lVar1 = ossl_sa_new();
    ptr[1] = lVar1;
    if (lVar1 != 0) {
      lVar1 = CRYPTO_THREAD_lock_new();
      ptr[2] = lVar1;
      if (lVar1 != 0) {
        lVar1 = CRYPTO_THREAD_lock_new();
        ptr[3] = lVar1;
        if (lVar1 != 0) {
          return ptr;
        }
      }
    }
    uVar2 = 0;
    if (ptr[1] != 0) {
      ossl_sa_doall_arg(ptr[1],&LAB_00ac412c,ptr);
      uVar2 = ptr[1];
    }
    ossl_sa_free(uVar2);
    CRYPTO_THREAD_lock_free(ptr[2]);
    CRYPTO_THREAD_lock_free(ptr[3]);
    CRYPTO_free(ptr);
  }
  return (undefined8 *)0x0;
}

