/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9190
 */

long * FUN_00ac9190(undefined4 param_1,long param_2,long param_3)

{
  long *plVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  long *ptr;
  long lVar5;
  void *pvVar6;
  undefined8 uVar7;
  uint uVar8;
  int iVar9;
  uint uVar10;
  long *plVar11;
  long lVar12;
  
  lVar12 = *(long *)(param_2 + 0x10);
  ptr = (long *)CRYPTO_zalloc(0xc0,"crypto/evp/evp_rand.c",0x50);
  if (ptr != (long *)0x0) {
    lVar5 = CRYPTO_THREAD_lock_new();
    ptr[5] = lVar5;
    if (lVar5 != 0) {
      plVar1 = ptr + 4;
      *(int *)plVar1 = 1;
      *(undefined4 *)(ptr + 1) = param_1;
      pvVar6 = (void *)ossl_algorithm_get1_first_name(param_2);
      ptr[2] = (long)pvVar6;
      if (pvVar6 == (void *)0x0) {
        do {
          lVar12 = *plVar1;
          iVar4 = (int)lVar12 + -1;
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(plVar1,0x10);
          if (bVar3) {
            *(int *)plVar1 = iVar4;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        if (iVar4 == 0) {
          DataMemoryBarrier(2,1);
          pvVar6 = (void *)ptr[2];
        }
        else {
          pvVar6 = (void *)0x0;
          if (1 < (int)lVar12) {
            return (long *)0x0;
          }
        }
        CRYPTO_free(pvVar6);
        ossl_provider_free(*ptr);
        CRYPTO_THREAD_lock_free(ptr[5]);
        CRYPTO_free(ptr);
        return (long *)0x0;
      }
      iVar4 = 0;
      iVar9 = 0;
      uVar10 = 0;
      ptr[3] = *(long *)(param_2 + 0x18);
      uVar8 = 0;
      ptr[6] = lVar12;
      plVar11 = (long *)(lVar12 + 8);
LAB_00ac922c:
      switch((int)plVar11[-1]) {
      case 0:
        goto switchD_00ac9240_caseD_0;
      case 1:
        if (ptr[7] == 0) {
          iVar9 = iVar9 + 1;
          ptr[7] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 2:
        if (ptr[8] == 0) {
          iVar9 = iVar9 + 1;
          ptr[8] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 3:
        if (ptr[9] == 0) {
          iVar4 = iVar4 + 1;
          ptr[9] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 4:
        if (ptr[10] == 0) {
          iVar4 = iVar4 + 1;
          ptr[10] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 5:
        if (ptr[0xb] == 0) {
          iVar4 = iVar4 + 1;
          ptr[0xb] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 6:
        if (ptr[0xc] == 0) {
          ptr[0xc] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 7:
        if (ptr[0xd] == 0) {
          ptr[0xd] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 8:
        if (ptr[0xe] == 0) {
          uVar8 = uVar8 + 1;
          ptr[0xe] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 9:
        if (ptr[0xf] == 0) {
          uVar10 = uVar10 + 1;
          ptr[0xf] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 10:
        if (ptr[0x10] == 0) {
          uVar10 = uVar10 + 1;
          ptr[0x10] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 0xb:
        if (ptr[0x11] == 0) {
          ptr[0x11] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 0xc:
        if (ptr[0x12] == 0) {
          ptr[0x12] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 0xd:
        if (ptr[0x13] == 0) {
          ptr[0x13] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 0xe:
        if (ptr[0x14] == 0) {
          ptr[0x14] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 0xf:
        if (ptr[0x15] == 0) {
          iVar9 = iVar9 + 1;
          ptr[0x15] = *plVar11;
          plVar11 = plVar11 + 2;
          goto LAB_00ac922c;
        }
        break;
      case 0x10:
        if (ptr[0x16] != 0) break;
        ptr[0x16] = *plVar11;
        plVar11 = plVar11 + 2;
        goto LAB_00ac922c;
      case 0x11:
        if (ptr[0x17] == 0) {
          ptr[0x17] = *plVar11;
        }
      }
      plVar11 = plVar11 + 2;
      goto LAB_00ac922c;
    }
  }
  CRYPTO_free(ptr);
  ERR_new();
  ERR_set_debug("crypto/evp/evp_rand.c",0x7f,"evp_rand_from_algorithm");
  uVar7 = 0xc0100;
  goto LAB_00ac9418;
switchD_00ac9240_caseD_0:
  if (((((uVar10 | 2) != 2) || (iVar4 != 3)) || (iVar9 != 3)) || (1 < uVar8)) {
    do {
      lVar12 = *plVar1;
      iVar4 = (int)lVar12 + -1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(plVar1,0x10);
      if (bVar3) {
        *(int *)plVar1 = iVar4;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (iVar4 == 0) {
      DataMemoryBarrier(2,1);
      pvVar6 = (void *)ptr[2];
LAB_00ac9508:
      CRYPTO_free(pvVar6);
      ossl_provider_free(*ptr);
      CRYPTO_THREAD_lock_free(ptr[5]);
      CRYPTO_free(ptr);
    }
    else if ((int)lVar12 < 2) goto LAB_00ac9508;
    ERR_new();
    ERR_set_debug("crypto/evp/evp_rand.c",0x103,"evp_rand_from_algorithm");
    uVar7 = 0xc1;
    goto LAB_00ac9418;
  }
  if ((param_3 == 0) || (iVar4 = ossl_provider_up_ref(param_3), iVar4 != 0)) {
    *ptr = param_3;
    return ptr;
  }
  do {
    lVar12 = *plVar1;
    iVar4 = (int)lVar12 + -1;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(plVar1,0x10);
    if (bVar3) {
      *(int *)plVar1 = iVar4;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (iVar4 == 0) {
    DataMemoryBarrier(2,1);
LAB_00ac956c:
    CRYPTO_free((void *)ptr[2]);
    ossl_provider_free(*ptr);
    CRYPTO_THREAD_lock_free(ptr[5]);
    CRYPTO_free(ptr);
  }
  else if ((int)lVar12 < 2) goto LAB_00ac956c;
  ERR_new();
  ERR_set_debug("crypto/evp/evp_rand.c",0x109,"evp_rand_from_algorithm");
  uVar7 = 0xc0103;
LAB_00ac9418:
  ERR_set_error(6,uVar7,0);
  return (long *)0x0;
}

