/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7a28
 */

void ossl_rand_cleanup_int(void)

{
  int iVar1;
  
  if (DAT_00d221f8 == '\x01') {
    if ((DAT_00d221f0 != 0) && (*(code **)(DAT_00d221f0 + 0x10) != (code *)0x0)) {
      (**(code **)(DAT_00d221f0 + 0x10))();
    }
    iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22210,FUN_00ac7bc0);
    if (((iVar1 != 0) && (DAT_00d22214 != 0)) &&
       (iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22208), iVar1 != 0)) {
      ENGINE_finish(DAT_00d22218);
      DAT_00d22218 = (ENGINE *)0x0;
      DAT_00d221f0 = 0;
      CRYPTO_THREAD_unlock(DAT_00d22208);
    }
    ossl_rand_pool_cleanup();
    CRYPTO_THREAD_lock_free(DAT_00d22200);
    DAT_00d22200 = 0;
    CRYPTO_THREAD_lock_free(DAT_00d22208);
    DAT_00d22208 = 0;
    ossl_release_default_drbg_ctx();
    DAT_00d221f8 = '\0';
  }
  return;
}

