/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51df0
 */

int ENGINE_remove(ENGINE *e)

{
  int iVar1;
  ENGINE *pEVar2;
  ENGINE *pEVar3;
  long lVar4;
  
  if (e == (ENGINE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/engine/eng_list.c",0x14a,"ENGINE_remove");
    ERR_set_error(0x26,0xc0102,0);
    iVar1 = 0;
  }
  else {
    iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
    if (iVar1 == 0) {
      iVar1 = 0;
    }
    else {
      pEVar3 = (ENGINE *)&DAT_00d219b8;
      do {
        pEVar2 = *(ENGINE **)pEVar3;
        if (pEVar2 == e) break;
        pEVar3 = pEVar2 + 0xc0;
      } while (pEVar2 != (ENGINE *)0x0);
      if (pEVar2 == (ENGINE *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/engine/eng_list.c",0x7b,"engine_list_remove");
        ERR_set_error(0x26,0x69,0);
        ERR_new();
        ERR_set_debug("crypto/engine/eng_list.c",0x150,"ENGINE_remove");
        ERR_set_error(0x26,0x6e,0);
        iVar1 = 0;
      }
      else {
        lVar4 = *(long *)(e + 0xc0);
        if (lVar4 != 0) {
          *(undefined8 *)(lVar4 + 0xb8) = *(undefined8 *)(e + 0xb8);
        }
        pEVar3 = *(ENGINE **)(e + 0xb8);
        if (pEVar3 != (ENGINE *)0x0) {
          *(long *)(pEVar3 + 0xc0) = lVar4;
        }
        if (DAT_00d219b8 == e) {
          DAT_00d219b8 = *(ENGINE **)(e + 0xc0);
        }
        if (DAT_00d219c0 == e) {
          DAT_00d219c0 = pEVar3;
        }
        engine_free_util(e,0);
        iVar1 = 1;
      }
      CRYPTO_THREAD_unlock(global_engine_lock);
    }
  }
  return iVar1;
}

