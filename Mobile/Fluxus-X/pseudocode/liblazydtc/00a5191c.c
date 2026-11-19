/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5191c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ENGINE * ENGINE_get_first(void)

{
  ENGINE *pEVar1;
  char cVar2;
  bool bVar3;
  ENGINE *pEVar4;
  int iVar5;
  
  iVar5 = CRYPTO_THREAD_run_once(&engine_lock_init,do_engine_lock_init_ossl_);
  if ((iVar5 == 0) || (do_engine_lock_init_ossl_ret_ == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0xe1,"ENGINE_get_first");
    ERR_set_error(0x26,0xc0100,0);
  }
  else {
    iVar5 = CRYPTO_THREAD_write_lock(global_engine_lock);
    pEVar4 = DAT_00d219b8;
    if (iVar5 != 0) {
      if (DAT_00d219b8 != (ENGINE *)0x0) {
        pEVar1 = DAT_00d219b8 + 0x9c;
        do {
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(pEVar1,0x10);
          if (bVar3) {
            *(int *)pEVar1 = *(int *)pEVar1 + 1;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
      CRYPTO_THREAD_unlock(global_engine_lock);
      return pEVar4;
    }
  }
  return (ENGINE *)0x0;
}

