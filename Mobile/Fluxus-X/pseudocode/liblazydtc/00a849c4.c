/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a849c4
 */

void FUN_00a849c4(void)

{
  int iVar1;
  
  DAT_00d22008 = CRYPTO_THREAD_lock_new();
  if ((DAT_00d22008 != 0) && (DAT_00d22010 = CRYPTO_THREAD_lock_new(), DAT_00d22010 != 0)) {
    OPENSSL_cpuid_setup();
    iVar1 = ossl_init_thread();
    if ((iVar1 != 0) && (iVar1 = CRYPTO_THREAD_init_local(&DAT_00d22018,0), iVar1 != 0)) {
      DAT_00d21ff8 = 1;
      DAT_00d2202c = 1;
      return;
    }
  }
  CRYPTO_THREAD_lock_free(DAT_00d22008);
  DAT_00d22008 = 0;
  CRYPTO_THREAD_lock_free(DAT_00d22010);
  DAT_00d22010 = 0;
  DAT_00d2202c = 0;
  return;
}

