/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5141c
 */

long * FUN_00b5141c(void)

{
  int iVar1;
  long lVar2;
  long *ptr;
  long lVar3;
  
  lVar2 = ossl_prov_ctx_get0_libctx();
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    ptr = (long *)CRYPTO_zalloc(0x50,"providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x47);
    if (ptr == (long *)0x0) {
      return (long *)0x0;
    }
    lVar3 = CRYPTO_THREAD_lock_new();
    *ptr = lVar3;
    if (lVar3 != 0) {
      ptr[1] = lVar2;
      *(undefined4 *)(ptr + 2) = 1;
      *(undefined4 *)(ptr + 9) = 0;
      return ptr;
    }
    CRYPTO_free(ptr);
  }
  return (long *)0x0;
}

