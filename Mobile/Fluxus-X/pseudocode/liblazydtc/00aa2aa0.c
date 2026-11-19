/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2aa0
 */

long ossl_provider_find(undefined8 param_1,undefined8 param_2,int param_3)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  undefined1 auStack_120 [40];
  undefined8 local_f8;
  
  lVar6 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar6 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
    return 0;
  }
  memset(auStack_120,0,0xe0);
  if ((param_3 == 0) && (iVar4 = ossl_lib_ctx_is_default(param_1), iVar4 != 0)) {
    OPENSSL_init_crypto(0x40,0);
  }
  local_f8 = param_2;
  iVar4 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 0x20));
  if (iVar4 != 0) {
    iVar4 = OPENSSL_sk_find(*(undefined8 *)(lVar6 + 8),auStack_120);
    if (iVar4 == -1) {
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x20));
    }
    else {
      lVar7 = OPENSSL_sk_value(*(undefined8 *)(lVar6 + 8),iVar4);
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x20));
      if (lVar7 == 0) {
        return 0;
      }
      piVar1 = (int *)(lVar7 + 0x10);
      do {
        iVar4 = *piVar1;
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
        if (bVar3) {
          *piVar1 = iVar4 + 1;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
      if (((*(byte *)(lVar7 + 200) & 1) == 0) ||
         (iVar5 = ossl_provider_up_ref_parent(lVar7,0), iVar5 != 0)) {
        if (iVar4 != -1) {
          return lVar7;
        }
      }
      else {
        ossl_provider_free(lVar7);
      }
    }
  }
  return 0;
}

