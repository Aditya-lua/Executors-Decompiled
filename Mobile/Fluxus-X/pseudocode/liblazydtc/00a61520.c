/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a61520
 */

long * FUN_00a61520(undefined8 *param_1,long param_2,long param_3)

{
  long *plVar1;
  undefined4 uVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  undefined8 uVar7;
  long *ptr;
  long lVar8;
  void *ptr_00;
  long *plVar9;
  long lVar10;
  
  ossl_provider_libctx(param_2);
  uVar7 = ossl_namemap_stored();
  iVar6 = ossl_namemap_add_names(uVar7,0,*param_1,0x3a);
  if (iVar6 == 0) goto LAB_00a617f0;
  lVar10 = param_1[2];
  uVar7 = ossl_provider_libctx(param_2);
  ptr = (long *)CRYPTO_zalloc(0x88,"crypto/encode_decode/encoder_meth.c",0x1f);
  if (ptr != (long *)0x0) {
    lVar8 = CRYPTO_THREAD_lock_new();
    plVar1 = ptr + 5;
    ptr[6] = lVar8;
    if (lVar8 == 0) {
      do {
        lVar10 = *plVar1;
        iVar6 = (int)lVar10 + -1;
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
        if (bVar4) {
          *(int *)plVar1 = iVar6;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      if (iVar6 == 0) {
        DataMemoryBarrier(2,1);
      }
      else if (1 < (int)lVar10) goto LAB_00a617c0;
      CRYPTO_free((void *)ptr[2]);
      ossl_property_free(ptr[4]);
      ossl_provider_free(*ptr);
      CRYPTO_THREAD_lock_free(ptr[6]);
      CRYPTO_free(ptr);
      goto LAB_00a617c0;
    }
    *(int *)plVar1 = 1;
    *(int *)(ptr + 1) = iVar6;
    lVar8 = ossl_algorithm_get1_first_name(param_1);
    ptr[2] = lVar8;
    if (lVar8 != 0) {
      ptr[3] = (long)param_1;
      lVar8 = ossl_parse_property(uVar7,param_1[1]);
      ptr[4] = lVar8;
      if (lVar8 != 0) {
        plVar9 = (long *)(lVar10 + 8);
LAB_00a6162c:
        switch((int)plVar9[-1]) {
        case 0:
          goto switchD_00a61640_caseD_0;
        case 1:
          if (ptr[7] == 0) {
            ptr[7] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 2:
          if (ptr[8] == 0) {
            ptr[8] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 3:
          if (ptr[9] == 0) {
            ptr[9] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 4:
          if (ptr[10] == 0) {
            ptr[10] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 5:
          if (ptr[0xb] == 0) {
            ptr[0xb] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 6:
          if (ptr[0xc] == 0) {
            ptr[0xc] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 10:
          if (ptr[0xd] == 0) {
            ptr[0xd] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 0xb:
          if (ptr[0xe] == 0) {
            ptr[0xe] = *plVar9;
            plVar9 = plVar9 + 2;
            goto LAB_00a6162c;
          }
          break;
        case 0x14:
          if (ptr[0xf] != 0) break;
          ptr[0xf] = *plVar9;
          plVar9 = plVar9 + 2;
          goto LAB_00a6162c;
        case 0x15:
          if (ptr[0x10] == 0) {
            ptr[0x10] = *plVar9;
          }
        }
        plVar9 = plVar9 + 2;
        goto LAB_00a6162c;
      }
      do {
        iVar6 = (int)*plVar1;
        iVar5 = iVar6 + -1;
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
        if (bVar4) {
          *(int *)plVar1 = iVar5;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      goto LAB_00a6171c;
    }
    do {
      lVar10 = *plVar1;
      iVar6 = (int)lVar10 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
      if (bVar4) {
        *(int *)plVar1 = iVar6;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar6 == 0) goto LAB_00a61720;
    ptr_00 = (void *)0x0;
    if (1 < (int)lVar10) goto LAB_00a617f0;
    goto LAB_00a61728;
  }
LAB_00a617c0:
  ERR_new();
  ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x22,"ossl_encoder_new");
  uVar2 = 0xc0100;
  goto LAB_00a617e8;
switchD_00a61640_caseD_0:
  if (ptr[7] == 0) {
    if (ptr[8] != 0) goto LAB_00a61820;
LAB_00a61840:
    if (ptr[0xe] != 0) {
      if ((param_2 == 0) || (iVar6 = ossl_provider_up_ref(param_2), iVar6 != 0)) {
        *ptr = param_2;
        return ptr;
      }
      do {
        iVar6 = (int)*plVar1;
        iVar5 = iVar6 + -1;
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
        if (bVar4) {
          *(int *)plVar1 = iVar5;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
LAB_00a6171c:
      if (iVar5 == 0) {
LAB_00a61720:
        DataMemoryBarrier(2,1);
      }
      else if (1 < iVar6) goto LAB_00a617f0;
      ptr_00 = (void *)ptr[2];
LAB_00a61728:
      CRYPTO_free(ptr_00);
      ossl_property_free(ptr[4]);
      ossl_provider_free(*ptr);
      CRYPTO_THREAD_lock_free(ptr[6]);
      CRYPTO_free(ptr);
      goto LAB_00a617f0;
    }
  }
  else {
    if (ptr[8] != 0) goto LAB_00a61840;
LAB_00a61820:
    if (ptr[0xf] == 0) {
      if (ptr[0x10] == 0) goto LAB_00a61840;
    }
    else if (ptr[0x10] != 0) goto LAB_00a61840;
  }
  do {
    lVar10 = *plVar1;
    iVar6 = (int)lVar10 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
    if (bVar4) {
      *(int *)plVar1 = iVar6;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar6 == 0) {
    DataMemoryBarrier(2,1);
LAB_00a61898:
    CRYPTO_free((void *)ptr[2]);
    ossl_property_free(ptr[4]);
    ossl_provider_free(*ptr);
    CRYPTO_THREAD_lock_free(ptr[6]);
    CRYPTO_free(ptr);
  }
  else if ((int)lVar10 < 2) goto LAB_00a61898;
  ERR_new();
  ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x131,"encoder_from_algorithm");
  uVar2 = 0xc0108;
LAB_00a617e8:
  ERR_set_error(0x3b,uVar2,0);
LAB_00a617f0:
  *(byte *)(param_3 + 0x28) = *(byte *)(param_3 + 0x28) | 1;
  return (long *)0x0;
}

