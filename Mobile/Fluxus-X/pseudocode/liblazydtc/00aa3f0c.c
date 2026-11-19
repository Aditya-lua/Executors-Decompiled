/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa3f0c
 */

undefined8 ossl_provider_doall_activated(undefined8 param_1,code *param_2,undefined8 param_3)

{
  bool bVar1;
  byte *pbVar2;
  int *piVar3;
  char cVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  byte *pbVar10;
  undefined8 uVar11;
  int iVar12;
  
  lVar8 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar8 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
  }
  iVar5 = ossl_lib_ctx_is_default(param_1);
  if (iVar5 != 0) {
    OPENSSL_init_crypto(0x40,0);
  }
  if (lVar8 == 0) {
    return 1;
  }
  iVar5 = FUN_00aa4178(lVar8);
  if ((iVar5 == 0) || (iVar5 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar8 + 0x20)), iVar5 == 0))
  {
    return 0;
  }
  lVar9 = OPENSSL_sk_dup(*(undefined8 *)(lVar8 + 8));
  if (lVar9 == 0) {
    CRYPTO_THREAD_unlock(*(undefined8 *)(lVar8 + 0x20));
    return 0;
  }
  iVar5 = OPENSSL_sk_num();
  if (iVar5 < 1) {
    CRYPTO_THREAD_unlock(*(undefined8 *)(lVar8 + 0x20));
  }
  else {
    iVar12 = iVar5;
    do {
      iVar7 = iVar12 + -1;
      pbVar10 = (byte *)OPENSSL_sk_value(lVar9,iVar7);
      iVar6 = CRYPTO_THREAD_write_lock(*(undefined8 *)(pbVar10 + 8));
      if (iVar6 == 0) goto LAB_00aa40b8;
      if ((*pbVar10 >> 1 & 1) == 0) {
        OPENSSL_sk_delete(lVar9,iVar7);
        iVar5 = iVar5 + -1;
      }
      else {
        pbVar2 = pbVar10 + 0x10;
        do {
          cVar4 = '\x01';
          bVar1 = (bool)ExclusiveMonitorPass(pbVar2,0x10);
          if (bVar1) {
            *(int *)pbVar2 = *(int *)pbVar2 + 1;
            cVar4 = ExclusiveMonitorsStatus();
          }
        } while (cVar4 != '\0');
        iVar6 = FUN_00aa3714(pbVar10,0,0);
        if (iVar6 < 0) goto LAB_00aa4098;
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(pbVar10 + 8));
      bVar1 = 1 < iVar12;
      iVar12 = iVar7;
    } while (bVar1);
    CRYPTO_THREAD_unlock(*(undefined8 *)(lVar8 + 0x20));
    if (0 < iVar5) {
      iVar12 = 0;
      do {
        uVar11 = OPENSSL_sk_value(lVar9,iVar12);
        iVar7 = (*param_2)(uVar11,param_3);
        if (iVar7 == 0) {
          iVar12 = 0;
          goto LAB_00aa40c0;
        }
        iVar12 = iVar12 + 1;
      } while (iVar12 < iVar5);
    }
  }
  iVar12 = 0;
  uVar11 = 1;
  if (iVar5 < 1) goto LAB_00aa4110;
LAB_00aa40cc:
  do {
    lVar8 = OPENSSL_sk_value(lVar9,iVar12);
    FUN_00aa3c88(lVar8,0,1);
    piVar3 = (int *)(lVar8 + 0x10);
    do {
      iVar7 = *piVar3;
      cVar4 = '\x01';
      bVar1 = (bool)ExclusiveMonitorPass(piVar3,0x10);
      if (bVar1) {
        *piVar3 = iVar7 + -1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (iVar7 + -1 == 0) {
      DataMemoryBarrier(2,1);
    }
    iVar12 = iVar12 + 1;
  } while (iVar12 != iVar5);
LAB_00aa4110:
  OPENSSL_sk_free(lVar9);
  return uVar11;
LAB_00aa4098:
  do {
    iVar7 = *(int *)pbVar2;
    cVar4 = '\x01';
    bVar1 = (bool)ExclusiveMonitorPass(pbVar2,0x10);
    if (bVar1) {
      *(int *)pbVar2 = iVar7 + -1;
      cVar4 = ExclusiveMonitorsStatus();
    }
  } while (cVar4 != '\0');
  if (iVar7 + -1 == 0) {
    DataMemoryBarrier(2,1);
  }
  CRYPTO_THREAD_unlock(*(undefined8 *)(pbVar10 + 8));
LAB_00aa40b8:
  CRYPTO_THREAD_unlock(*(undefined8 *)(lVar8 + 0x20));
LAB_00aa40c0:
  uVar11 = 0;
  if (iVar5 <= iVar12) goto LAB_00aa4110;
  goto LAB_00aa40cc;
}

