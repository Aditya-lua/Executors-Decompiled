/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa3118
 */

undefined8 ossl_provider_add_to_store(long param_1,long *param_2,int param_3)

{
  int *piVar1;
  undefined4 uVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  long lVar9;
  undefined8 uVar10;
  long lVar11;
  uint uVar12;
  undefined1 auStack_140 [40];
  undefined8 local_118;
  
  memset(auStack_140,0,0xe0);
  if (param_2 != (long *)0x0) {
    *param_2 = 0;
  }
  lVar9 = ossl_lib_ctx_get_data(*(undefined8 *)(param_1 + 0x50),1,&DAT_00c6d4c8);
  if (lVar9 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    uVar2 = 0xc0103;
  }
  else {
    uVar10 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar9 + 0x20));
    if ((int)uVar10 == 0) {
      return uVar10;
    }
    local_118 = *(undefined8 *)(param_1 + 0x28);
    iVar5 = OPENSSL_sk_find(*(undefined8 *)(lVar9 + 8),auStack_140);
    if (iVar5 == -1) {
      iVar7 = OPENSSL_sk_push(*(undefined8 *)(lVar9 + 8),param_1);
      if (iVar7 == 0) {
LAB_00aa3344:
        CRYPTO_THREAD_unlock(*(undefined8 *)(lVar9 + 0x20));
        return 0;
      }
      *(long *)(param_1 + 0x58) = lVar9;
      iVar7 = OPENSSL_sk_num(*(undefined8 *)(lVar9 + 0x10));
      if (0 < iVar7) {
        iVar6 = 0;
        uVar12 = 1;
        do {
          lVar11 = OPENSSL_sk_value(*(undefined8 *)(lVar9 + 0x10),iVar6);
          uVar8 = (**(code **)(lVar11 + 8))(param_1,*(undefined8 *)(lVar11 + 0x20));
          iVar6 = iVar6 + 1;
          uVar12 = uVar8 & uVar12;
        } while (iVar7 != iVar6);
        if (uVar12 == 0) {
          OPENSSL_sk_delete_ptr(*(undefined8 *)(lVar9 + 8),param_1);
          goto LAB_00aa3344;
        }
      }
      lVar11 = param_1;
      if (param_3 == 0) {
        *(byte *)(lVar9 + 0x48) = *(byte *)(lVar9 + 0x48) & 0xfe;
      }
    }
    else {
      lVar11 = OPENSSL_sk_value(*(undefined8 *)(lVar9 + 8),iVar5);
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)(lVar9 + 0x20));
    if (param_2 == (long *)0x0) {
LAB_00aa31fc:
      if (-1 < iVar5) {
        if ((param_1 != 0) && (iVar5 = FUN_00aa3c88(param_1,1,0), iVar5 == 0)) {
          FUN_00aa3e00(param_1);
        }
        ossl_provider_free(param_1);
      }
      return 1;
    }
    piVar1 = (int *)(lVar11 + 0x10);
    do {
      iVar7 = *piVar1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar4) {
        *piVar1 = iVar7 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (((*(byte *)(lVar11 + 200) & 1) == 0) ||
       (iVar6 = ossl_provider_up_ref_parent(lVar11,0), iVar6 != 0)) {
      if (iVar7 != -1) {
        *param_2 = lVar11;
        goto LAB_00aa31fc;
      }
    }
    else {
      ossl_provider_free(lVar11);
    }
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x291,"ossl_provider_add_to_store");
    uVar2 = 0xc0100;
  }
  ERR_set_error(0xf,uVar2,0);
  return 0;
}

