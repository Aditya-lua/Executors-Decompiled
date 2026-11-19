/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51a8c
 */

ENGINE * ENGINE_get_next(ENGINE *e)

{
  ENGINE *pEVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  ENGINE *pEVar5;
  
  if (e == (ENGINE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x109,"ENGINE_get_next");
    ERR_set_error(0x26,0xc0102,0);
  }
  else {
    iVar4 = CRYPTO_THREAD_write_lock(global_engine_lock);
    if (iVar4 != 0) {
      pEVar5 = *(ENGINE **)(e + 0xc0);
      if (pEVar5 != (ENGINE *)0x0) {
        pEVar1 = pEVar5 + 0x9c;
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
      ENGINE_free(e);
      return pEVar5;
    }
  }
  return (ENGINE *)0x0;
}

