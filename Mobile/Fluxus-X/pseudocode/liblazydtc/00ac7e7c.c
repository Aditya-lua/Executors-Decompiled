/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7e7c
 */

int RAND_set_rand_engine(ENGINE *engine)

{
  int iVar1;
  RAND_METHOD *pRVar2;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22210,FUN_00ac7bc0);
  if (iVar1 == 0) {
    return 0;
  }
  if (DAT_00d22214 == 0) {
    return 0;
  }
  if (engine == (ENGINE *)0x0) {
    pRVar2 = (RAND_METHOD *)0x0;
  }
  else {
    iVar1 = ENGINE_init(engine);
    if (iVar1 == 0) {
      return 0;
    }
    pRVar2 = ENGINE_get_RAND(engine);
    if (pRVar2 == (RAND_METHOD *)0x0) goto LAB_00ac7f58;
  }
  iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22200);
  if (iVar1 != 0) {
    iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22210,FUN_00ac7bc0);
    if (((iVar1 != 0) && (DAT_00d22214 != 0)) &&
       (iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22208), iVar1 != 0)) {
      ENGINE_finish(DAT_00d22218);
      DAT_00d221f0 = pRVar2;
      DAT_00d22218 = engine;
      CRYPTO_THREAD_unlock(DAT_00d22208);
    }
    CRYPTO_THREAD_unlock(DAT_00d22200);
    return 1;
  }
LAB_00ac7f58:
  ENGINE_finish(engine);
  return 0;
}

