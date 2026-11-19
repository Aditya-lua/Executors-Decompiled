/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7bc0
 */

void FUN_00ac7bc0(void)

{
  int iVar1;
  
  DAT_00d22200 = CRYPTO_THREAD_lock_new();
  if (DAT_00d22200 != 0) {
    DAT_00d22208 = CRYPTO_THREAD_lock_new();
    if ((DAT_00d22208 != 0) && (iVar1 = ossl_rand_pool_init(), iVar1 != 0)) {
      DAT_00d221f8 = 1;
      DAT_00d22214 = 1;
      return;
    }
    CRYPTO_THREAD_lock_free(DAT_00d22208);
    DAT_00d22208 = 0;
    CRYPTO_THREAD_lock_free(DAT_00d22200);
  }
  DAT_00d22200 = 0;
  DAT_00d22214 = 0;
  return;
}

