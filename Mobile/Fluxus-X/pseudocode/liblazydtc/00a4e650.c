/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e650
 */

long * ossl_decoder_from_algorithm(undefined4 param_1,long param_2,long param_3)

{
  long *plVar1;
  undefined4 uVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  long *ptr;
  long lVar7;
  void *ptr_00;
  long *plVar8;
  long lVar9;
  
  lVar9 = *(long *)(param_2 + 0x10);
  uVar6 = ossl_provider_libctx(param_3);
  ptr = (long *)CRYPTO_zalloc(0x80,"crypto/encode_decode/decoder_meth.c",0x1f);
  if (ptr != (long *)0x0) {
    lVar7 = CRYPTO_THREAD_lock_new();
    plVar1 = ptr + 5;
    ptr[6] = lVar7;
    if (lVar7 != 0) {
      *(int *)plVar1 = 1;
      *(undefined4 *)(ptr + 1) = param_1;
      lVar7 = ossl_algorithm_get1_first_name(param_2);
      ptr[2] = lVar7;
      if (lVar7 == 0) {
        do {
          lVar9 = *plVar1;
          iVar5 = (int)lVar9 + -1;
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
          if (bVar4) {
            *(int *)plVar1 = iVar5;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        if (iVar5 == 0) {
          DataMemoryBarrier(2,1);
          ptr_00 = (void *)ptr[2];
        }
        else {
          ptr_00 = (void *)0x0;
          if (1 < (int)lVar9) {
            return (long *)0x0;
          }
        }
        goto LAB_00a4e91c;
      }
      ptr[3] = param_2;
      lVar7 = ossl_parse_property(uVar6,*(undefined8 *)(param_2 + 8));
      ptr[4] = lVar7;
      if (lVar7 != 0) {
        plVar8 = (long *)(lVar9 + 8);
LAB_00a4e734:
        switch((int)plVar8[-1]) {
        case 0:
          goto switchD_00a4e748_caseD_0;
        case 1:
          if (ptr[7] == 0) {
            ptr[7] = *plVar8;
            plVar8 = plVar8 + 2;
            goto LAB_00a4e734;
          }
          break;
        case 2:
          if (ptr[8] == 0) {
            ptr[8] = *plVar8;
            plVar8 = plVar8 + 2;
            goto LAB_00a4e734;
          }
          break;
        case 3:
          if (ptr[9] == 0) {
            ptr[9] = *plVar8;
            plVar8 = plVar8 + 2;
            goto LAB_00a4e734;
          }
          break;
        case 4:
          if (ptr[10] == 0) {
            ptr[10] = *plVar8;
            plVar8 = plVar8 + 2;
            goto LAB_00a4e734;
          }
          break;
        case 5:
          if (ptr[0xb] == 0) {
            ptr[0xb] = *plVar8;
            plVar8 = plVar8 + 2;
            goto LAB_00a4e734;
          }
          break;
        case 6:
          if (ptr[0xc] == 0) {
            ptr[0xc] = *plVar8;
            plVar8 = plVar8 + 2;
            goto LAB_00a4e734;
          }
          break;
        case 10:
          if (ptr[0xd] == 0) {
            ptr[0xd] = *plVar8;
            plVar8 = plVar8 + 2;
            goto LAB_00a4e734;
          }
          break;
        case 0xb:
          if (ptr[0xe] != 0) break;
          ptr[0xe] = *plVar8;
          plVar8 = plVar8 + 2;
          goto LAB_00a4e734;
        case 0x14:
          if (ptr[0xf] == 0) {
            ptr[0xf] = *plVar8;
          }
        }
        plVar8 = plVar8 + 2;
        goto LAB_00a4e734;
      }
      do {
        iVar5 = (int)*plVar1;
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
        if (bVar4) {
          *(int *)plVar1 = iVar5 + -1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      if (iVar5 + -1 == 0) goto LAB_00a4e814;
LAB_00a4e860:
      if (1 < iVar5) {
        return (long *)0x0;
      }
LAB_00a4e86c:
      ptr_00 = (void *)ptr[2];
LAB_00a4e91c:
      CRYPTO_free(ptr_00);
      ossl_property_free(ptr[4]);
      ossl_provider_free(*ptr);
      CRYPTO_THREAD_lock_free(ptr[6]);
      CRYPTO_free(ptr);
      return (long *)0x0;
    }
    do {
      lVar9 = *plVar1;
      iVar5 = (int)lVar9 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
      if (bVar4) {
        *(int *)plVar1 = iVar5;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar5 == 0) {
      DataMemoryBarrier(2,1);
    }
    else if (1 < (int)lVar9) goto LAB_00a4e8c8;
    CRYPTO_free((void *)ptr[2]);
    ossl_property_free(ptr[4]);
    ossl_provider_free(*ptr);
    CRYPTO_THREAD_lock_free(ptr[6]);
    CRYPTO_free(ptr);
  }
LAB_00a4e8c8:
  ERR_new();
  ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x22,"ossl_decoder_new");
  uVar2 = 0xc0100;
  goto LAB_00a4e8f0;
switchD_00a4e748_caseD_0:
  if (ptr[7] == 0) {
    if (ptr[8] == 0) goto LAB_00a4e828;
  }
  else if (ptr[8] != 0) {
LAB_00a4e828:
    if (ptr[0xe] != 0) {
      if ((param_3 == 0) || (iVar5 = ossl_provider_up_ref(param_3), iVar5 != 0)) {
        *ptr = param_3;
        return ptr;
      }
      do {
        iVar5 = (int)*plVar1;
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
        if (bVar4) {
          *(int *)plVar1 = iVar5 + -1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      if (iVar5 + -1 != 0) goto LAB_00a4e860;
LAB_00a4e814:
      DataMemoryBarrier(2,1);
      goto LAB_00a4e86c;
    }
  }
  do {
    lVar9 = *plVar1;
    iVar5 = (int)lVar9 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
    if (bVar4) {
      *(int *)plVar1 = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
LAB_00a4e990:
    CRYPTO_free((void *)ptr[2]);
    ossl_property_free(ptr[4]);
    ossl_provider_free(*ptr);
    CRYPTO_THREAD_lock_free(ptr[6]);
    CRYPTO_free(ptr);
  }
  else if ((int)lVar9 < 2) goto LAB_00a4e990;
  ERR_new();
  ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x127,"ossl_decoder_from_algorithm");
  uVar2 = 0xc0108;
LAB_00a4e8f0:
  ERR_set_error(0x3c,uVar2,0);
  return (long *)0x0;
}

