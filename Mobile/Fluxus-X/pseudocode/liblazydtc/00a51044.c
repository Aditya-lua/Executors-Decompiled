/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51044
 */

int ENGINE_init(ENGINE *e)

{
  ENGINE *pEVar1;
  undefined4 uVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  
  if (e == (ENGINE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_init.c",0x55,"ENGINE_init");
    uVar2 = 0xc0102;
LAB_00a51128:
    ERR_set_error(0x26,uVar2,0);
    return 0;
  }
  iVar5 = CRYPTO_THREAD_run_once(&engine_lock_init,do_engine_lock_init_ossl_);
  if ((iVar5 == 0) || (do_engine_lock_init_ossl_ret_ == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_init.c",0x59,"ENGINE_init");
    uVar2 = 0xc0100;
    goto LAB_00a51128;
  }
  iVar5 = CRYPTO_THREAD_write_lock(global_engine_lock);
  if (iVar5 == 0) {
    return 0;
  }
  if ((*(int *)(e + 0xa0) == 0) && (*(code **)(e + 0x60) != (code *)0x0)) {
    iVar5 = (**(code **)(e + 0x60))(e);
    if (iVar5 == 0) goto LAB_00a510c4;
  }
  else {
    iVar5 = 1;
  }
  pEVar1 = e + 0x9c;
  do {
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(pEVar1,0x10);
    if (bVar4) {
      *(int *)pEVar1 = *(int *)pEVar1 + 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  *(int *)(e + 0xa0) = *(int *)(e + 0xa0) + 1;
LAB_00a510c4:
  CRYPTO_THREAD_unlock(global_engine_lock);
  return iVar5;
}

