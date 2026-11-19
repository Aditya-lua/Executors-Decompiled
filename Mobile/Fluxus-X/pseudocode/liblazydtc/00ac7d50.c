/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7d50
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

RAND_METHOD * RAND_get_rand_method(void)

{
  int iVar1;
  ENGINE *e;
  undefined **ppuVar2;
  RAND_METHOD *pRVar3;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22210,FUN_00ac7bc0);
  pRVar3 = (RAND_METHOD *)0x0;
  if ((iVar1 != 0) && (DAT_00d22214 != 0)) {
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22208);
    if (iVar1 == 0) {
      pRVar3 = (RAND_METHOD *)0x0;
    }
    else {
      if (DAT_00d221f0 == (RAND_METHOD *)0x0) {
        e = ENGINE_get_default_RAND();
        if ((e == (ENGINE *)0x0) ||
           (ppuVar2 = &ENGINE_get_RAND(e)->seed, (RAND_METHOD *)ppuVar2 == (RAND_METHOD *)0x0)) {
          ENGINE_finish(e);
          ppuVar2 = &ossl_rand_meth;
        }
        else {
          DAT_00d22218 = e;
        }
        DAT_00d221f0 = (RAND_METHOD *)ppuVar2;
      }
      pRVar3 = DAT_00d221f0;
      CRYPTO_THREAD_unlock(DAT_00d22208);
    }
  }
  return pRVar3;
}

