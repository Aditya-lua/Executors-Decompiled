/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5cd0c
 */

int * FUN_00a5cd0c(int param_1,long param_2,long param_3)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int *ptr;
  long lVar5;
  void *pvVar6;
  undefined8 uVar7;
  int iVar8;
  undefined8 *puVar9;
  long lVar10;
  
  lVar10 = *(long *)(param_2 + 0x10);
  ptr = (int *)CRYPTO_zalloc(0x100,"crypto/evp/evp_enc.c",0x5c5);
  if (ptr != (int *)0x0) {
    lVar5 = CRYPTO_THREAD_lock_new();
    *(long *)(ptr + 0x22) = lVar5;
    if (lVar5 != 0) {
      piVar1 = ptr + 0x20;
      *piVar1 = 1;
      *ptr = 0;
      iVar4 = evp_names_do_all(param_3,param_1,&LAB_00a5d2f0,ptr);
      if ((iVar4 == 0) || (*ptr == -1)) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_enc.c",0x602,"evp_cipher_from_algorithm");
        ERR_set_error(6,0xc0103,0);
        if (ptr[6] != 0) {
          return (int *)0x0;
        }
        do {
          iVar4 = *piVar1;
          iVar8 = iVar4 + -1;
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = iVar8;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        if (iVar8 == 0) {
          DataMemoryBarrier(2,1);
        }
        else if (1 < iVar4) {
          return (int *)0x0;
        }
        pvVar6 = *(void **)(ptr + 0x1a);
      }
      else {
        ptr[0x18] = param_1;
        pvVar6 = (void *)ossl_algorithm_get1_first_name(param_2);
        *(void **)(ptr + 0x1a) = pvVar6;
        if (pvVar6 != (void *)0x0) {
          iVar4 = 0;
          iVar8 = 0;
          *(undefined8 *)(ptr + 0x1c) = *(undefined8 *)(param_2 + 0x18);
          puVar9 = (undefined8 *)(lVar10 + 8);
LAB_00a5cdc8:
          switch(*(undefined4 *)(puVar9 + -1)) {
          case 0:
            goto switchD_00a5cddc_caseD_0;
          case 1:
            if (*(long *)(ptr + 0x24) == 0) {
              iVar8 = iVar8 + 1;
              *(undefined8 *)(ptr + 0x24) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 2:
            if (*(long *)(ptr + 0x26) == 0) {
              iVar4 = iVar4 + 1;
              *(undefined8 *)(ptr + 0x26) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 3:
            if (*(long *)(ptr + 0x28) == 0) {
              iVar4 = iVar4 + 1;
              *(undefined8 *)(ptr + 0x28) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 4:
            if (*(long *)(ptr + 0x2a) == 0) {
              iVar4 = iVar4 + 1;
              *(undefined8 *)(ptr + 0x2a) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 5:
            if (*(long *)(ptr + 0x2c) == 0) {
              iVar4 = iVar4 + 1;
              *(undefined8 *)(ptr + 0x2c) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 6:
            if (*(long *)(ptr + 0x2e) == 0) {
              *(undefined8 *)(ptr + 0x2e) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 7:
            if (*(long *)(ptr + 0x30) == 0) {
              iVar8 = iVar8 + 1;
              *(undefined8 *)(ptr + 0x30) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 8:
            if (*(long *)(ptr + 0x32) == 0) {
              *(undefined8 *)(ptr + 0x32) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 9:
            if (*(long *)(ptr + 0x34) == 0) {
              *(undefined8 *)(ptr + 0x34) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 10:
            if (*(long *)(ptr + 0x36) == 0) {
              *(undefined8 *)(ptr + 0x36) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 0xb:
            if (*(long *)(ptr + 0x38) == 0) {
              *(undefined8 *)(ptr + 0x38) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 0xc:
            if (*(long *)(ptr + 0x3a) == 0) {
              *(undefined8 *)(ptr + 0x3a) = *puVar9;
              puVar9 = puVar9 + 2;
              goto LAB_00a5cdc8;
            }
            break;
          case 0xd:
            if (*(long *)(ptr + 0x3c) != 0) break;
            *(undefined8 *)(ptr + 0x3c) = *puVar9;
            puVar9 = puVar9 + 2;
            goto LAB_00a5cdc8;
          case 0xe:
            if (*(long *)(ptr + 0x3e) == 0) {
              *(undefined8 *)(ptr + 0x3e) = *puVar9;
            }
          }
          puVar9 = puVar9 + 2;
          goto LAB_00a5cdc8;
        }
        if (ptr[6] != 0) {
          return (int *)0x0;
        }
        do {
          iVar4 = *piVar1;
          iVar8 = iVar4 + -1;
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = iVar8;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        if (iVar8 == 0) {
          DataMemoryBarrier(2,1);
          pvVar6 = *(void **)(ptr + 0x1a);
        }
        else {
          pvVar6 = (void *)0x0;
          if (1 < iVar4) {
            return (int *)0x0;
          }
        }
      }
      CRYPTO_free(pvVar6);
      ossl_provider_free(*(undefined8 *)(ptr + 0x1e));
      CRYPTO_THREAD_lock_free(*(undefined8 *)(ptr + 0x22));
      CRYPTO_free(ptr);
      return (int *)0x0;
    }
    CRYPTO_free(ptr);
  }
  ERR_new();
  ERR_set_debug("crypto/evp/evp_enc.c",0x5fa,"evp_cipher_from_algorithm");
  uVar7 = 0xc0100;
  goto LAB_00a5cfa8;
switchD_00a5cddc_caseD_0:
  if (iVar4 - 3U < 2) {
    if (iVar8 == 2) goto LAB_00a5d01c;
  }
  else if (((iVar4 == 0) && (iVar8 == 2)) && (*(long *)(ptr + 0x2e) != 0)) {
LAB_00a5d01c:
    *(long *)(ptr + 0x1e) = param_3;
    if (param_3 != 0) {
      ossl_provider_up_ref(param_3);
    }
    iVar4 = evp_cipher_cache_constants(ptr);
    if (iVar4 != 0) {
      return ptr;
    }
    if (ptr[6] == 0) {
      do {
        iVar4 = *piVar1;
        iVar8 = iVar4 + -1;
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
        if (bVar3) {
          *piVar1 = iVar8;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
      if (iVar8 == 0) {
        DataMemoryBarrier(2,1);
      }
      else if (1 < iVar4) goto LAB_00a5d19c;
      CRYPTO_free(*(void **)(ptr + 0x1a));
      ossl_provider_free(*(undefined8 *)(ptr + 0x1e));
      CRYPTO_THREAD_lock_free(*(undefined8 *)(ptr + 0x22));
      CRYPTO_free(ptr);
    }
LAB_00a5d19c:
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x674,"evp_cipher_from_algorithm");
    uVar7 = 0xe1;
    goto LAB_00a5cfa8;
  }
  if (ptr[6] == 0) {
    do {
      iVar4 = *piVar1;
      iVar8 = iVar4 + -1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar3) {
        *piVar1 = iVar8;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (iVar8 == 0) {
      DataMemoryBarrier(2,1);
      pvVar6 = *(void **)(ptr + 0x1a);
    }
    else if (1 < iVar4) goto LAB_00a5d110;
    CRYPTO_free(pvVar6);
    ossl_provider_free(*(undefined8 *)(ptr + 0x1e));
    CRYPTO_THREAD_lock_free(*(undefined8 *)(ptr + 0x22));
    CRYPTO_free(ptr);
  }
LAB_00a5d110:
  ERR_new();
  ERR_set_debug("crypto/evp/evp_enc.c",0x66b,"evp_cipher_from_algorithm");
  uVar7 = 0xc1;
LAB_00a5cfa8:
  ERR_set_error(6,uVar7,0);
  return (int *)0x0;
}

