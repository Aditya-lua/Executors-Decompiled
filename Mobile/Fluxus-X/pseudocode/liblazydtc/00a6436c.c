/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6436c
 */

long * FUN_00a6436c(undefined4 param_1,long param_2,long param_3)

{
  long *plVar1;
  char cVar2;
  bool bVar3;
  long *ptr;
  long lVar4;
  void *pvVar5;
  undefined8 uVar6;
  int iVar7;
  int iVar8;
  long *plVar9;
  long lVar10;
  
  lVar10 = *(long *)(param_2 + 0x10);
  ptr = (long *)CRYPTO_zalloc(0x88,"crypto/evp/kdf_meth.c",0x32);
  if (ptr != (long *)0x0) {
    lVar4 = CRYPTO_THREAD_lock_new();
    ptr[5] = lVar4;
    if (lVar4 != 0) {
      plVar1 = ptr + 4;
      *(int *)plVar1 = 1;
      *(undefined4 *)(ptr + 1) = param_1;
      pvVar5 = (void *)ossl_algorithm_get1_first_name(param_2);
      ptr[2] = (long)pvVar5;
      if (pvVar5 == (void *)0x0) {
        do {
          lVar10 = *plVar1;
          iVar7 = (int)lVar10 + -1;
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(plVar1,0x10);
          if (bVar3) {
            *(int *)plVar1 = iVar7;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        if (iVar7 == 0) {
          DataMemoryBarrier(2,1);
          pvVar5 = (void *)ptr[2];
        }
        else {
          pvVar5 = (void *)0x0;
          if (1 < (int)lVar10) {
            return (long *)0x0;
          }
        }
        CRYPTO_free(pvVar5);
        ossl_provider_free(*ptr);
        CRYPTO_THREAD_lock_free(ptr[5]);
        CRYPTO_free(ptr);
        return (long *)0x0;
      }
      iVar8 = 0;
      iVar7 = 0;
      ptr[3] = *(long *)(param_2 + 0x18);
      plVar9 = (long *)(lVar10 + 8);
LAB_00a643fc:
      switch((int)plVar9[-1]) {
      case 0:
        goto switchD_00a64410_caseD_0;
      case 1:
        if (ptr[6] == 0) {
          iVar7 = iVar7 + 1;
          ptr[6] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 2:
        if (ptr[7] == 0) {
          ptr[7] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 3:
        if (ptr[8] == 0) {
          iVar7 = iVar7 + 1;
          ptr[8] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 4:
        if (ptr[9] == 0) {
          ptr[9] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 5:
        if (ptr[10] == 0) {
          iVar8 = iVar8 + 1;
          ptr[10] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 6:
        if (ptr[0xb] == 0) {
          ptr[0xb] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 7:
        if (ptr[0xc] == 0) {
          ptr[0xc] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 8:
        if (ptr[0xd] == 0) {
          ptr[0xd] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 9:
        if (ptr[0xe] == 0) {
          ptr[0xe] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a643fc;
        }
        break;
      case 10:
        if (ptr[0xf] != 0) break;
        ptr[0xf] = *plVar9;
        plVar9 = plVar9 + 2;
        goto LAB_00a643fc;
      case 0xb:
        if (ptr[0x10] == 0) {
          ptr[0x10] = *plVar9;
        }
      }
      plVar9 = plVar9 + 2;
      goto LAB_00a643fc;
    }
  }
  CRYPTO_free(ptr);
  ERR_new();
  ERR_set_debug("crypto/evp/kdf_meth.c",0x44,"evp_kdf_from_algorithm");
  uVar6 = 0xc0100;
  goto LAB_00a64558;
switchD_00a64410_caseD_0:
  if ((iVar8 == 1) && (iVar7 == 2)) {
    *ptr = param_3;
    if (param_3 != 0) {
      ossl_provider_up_ref(param_3);
    }
    return ptr;
  }
  do {
    lVar10 = *plVar1;
    iVar7 = (int)lVar10 + -1;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(plVar1,0x10);
    if (bVar3) {
      *(int *)plVar1 = iVar7;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (iVar7 == 0) {
    DataMemoryBarrier(2,1);
    pvVar5 = (void *)ptr[2];
LAB_00a64614:
    CRYPTO_free(pvVar5);
    ossl_provider_free(*ptr);
    CRYPTO_THREAD_lock_free(ptr[5]);
    CRYPTO_free(ptr);
  }
  else if ((int)lVar10 < 2) goto LAB_00a64614;
  ERR_new();
  ERR_set_debug("crypto/evp/kdf_meth.c",0x96,"evp_kdf_from_algorithm");
  uVar6 = 0xc1;
LAB_00a64558:
  ERR_set_error(6,uVar6,0);
  return (long *)0x0;
}

