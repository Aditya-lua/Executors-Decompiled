/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51bd4
 */

int ENGINE_add(ENGINE *e)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  char *__s2;
  ENGINE *pEVar5;
  
  if (e == (ENGINE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x134,"ENGINE_add");
    ERR_set_error(0x26,0xc0102,0);
    return 0;
  }
  if ((*(long *)e == 0) || (*(long *)(e + 8) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x138,"ENGINE_add");
    ERR_set_error(0x26,0x6c,0);
    return 0;
  }
  iVar3 = CRYPTO_THREAD_write_lock(global_engine_lock);
  if (iVar3 == 0) {
    return 0;
  }
  if (DAT_00d219b8 == (ENGINE *)0x0) {
    if (DAT_00d219c0 == (ENGINE *)0x0) {
      iVar3 = engine_cleanup_add_last(&LAB_00a5229c);
      if (iVar3 != 0) {
        DAT_00d219b8 = e;
        *(undefined8 *)(e + 0xb8) = 0;
        goto LAB_00a51dac;
      }
      ERR_new();
      uVar4 = 0x55;
    }
    else {
      ERR_new();
      uVar4 = 0x4e;
    }
LAB_00a51d00:
    ERR_set_debug("crypto/engine/eng_list.c",uVar4,"engine_list_add");
    uVar4 = 0x6e;
  }
  else {
    __s2 = *(char **)e;
    pEVar5 = DAT_00d219b8;
    do {
      iVar3 = strcmp(*(char **)pEVar5,__s2);
      if (iVar3 == 0) break;
      pEVar5 = *(ENGINE **)(pEVar5 + 0xc0);
    } while (pEVar5 != (ENGINE *)0x0);
    if (iVar3 != 0) {
      if ((DAT_00d219c0 != (ENGINE *)0x0) && (*(long *)(DAT_00d219c0 + 0xc0) == 0)) {
        *(ENGINE **)(DAT_00d219c0 + 0xc0) = e;
        *(ENGINE **)(e + 0xb8) = DAT_00d219c0;
LAB_00a51dac:
        pEVar5 = e + 0x9c;
        do {
          cVar1 = '\x01';
          bVar2 = (bool)ExclusiveMonitorPass(pEVar5,0x10);
          if (bVar2) {
            *(int *)pEVar5 = *(int *)pEVar5 + 1;
            cVar1 = ExclusiveMonitorsStatus();
          }
        } while (cVar1 != '\0');
        DAT_00d219c0 = e;
        *(undefined8 *)(e + 0xc0) = 0;
        iVar3 = 1;
        goto LAB_00a51d6c;
      }
      ERR_new();
      uVar4 = 0x5d;
      goto LAB_00a51d00;
    }
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x48,"engine_list_add");
    uVar4 = 0x67;
  }
  ERR_set_error(0x26,uVar4,0);
  ERR_new();
  ERR_set_debug("crypto/engine/eng_list.c",0x13e,"ENGINE_add");
  ERR_set_error(0x26,0x6e,0);
  iVar3 = 0;
LAB_00a51d6c:
  CRYPTO_THREAD_unlock(global_engine_lock);
  return iVar3;
}

