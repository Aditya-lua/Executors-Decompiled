/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b512bc
 */

long * ossl_mac_key_new(long param_1,undefined4 param_2)

{
  int iVar1;
  long *ptr;
  long lVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    ptr = (long *)CRYPTO_zalloc(0x50,"providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x47);
    if (ptr == (long *)0x0) {
      return (long *)0x0;
    }
    lVar2 = CRYPTO_THREAD_lock_new();
    *ptr = lVar2;
    if (lVar2 != 0) {
      ptr[1] = param_1;
      *(undefined4 *)(ptr + 2) = 1;
      *(undefined4 *)(ptr + 9) = param_2;
      return ptr;
    }
    CRYPTO_free(ptr);
  }
  return (long *)0x0;
}

