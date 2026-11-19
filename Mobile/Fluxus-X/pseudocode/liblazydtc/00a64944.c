/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a64944
 */

/* WARNING: Removing unreachable block (ram,0x00a64bd8) */

int FUN_00a64944(int *param_1,int param_2,undefined8 param_3)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 uVar9;
  long lVar10;
  void *ptr;
  code *pcVar11;
  uint uVar12;
  void *pvVar13;
  void *ptr_00;
  long local_68;
  
  local_68 = 0;
  if ((param_1 == (int *)0x0) || (*(long *)(param_1 + 6) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/kem.c",0x20,"evp_kem_init");
    ERR_set_error(6,0x86,0);
    return 0;
  }
  evp_pkey_ctx_free_old_ops(param_1);
  *param_1 = param_2;
  if (*(long *)(param_1 + 0x22) == 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/kem.c",0x28,"evp_kem_init");
    uVar9 = 0x9a;
  }
  else {
    lVar10 = *(long *)(*(long *)(param_1 + 0x22) + 0x60);
    lVar6 = *(long *)(param_1 + 8);
    if (lVar10 != 0) {
      if (lVar10 != *(long *)(param_1 + 8)) {
        ERR_new();
        ERR_set_debug("crypto/evp/kem.c",0x31,"evp_kem_init");
        uVar9 = 0xc0103;
        goto LAB_00a64d88;
      }
      lVar6 = lVar10;
    }
    lVar6 = evp_keymgmt_util_query_operation_name(lVar6,0xe);
    if (lVar6 == 0) {
      ERR_new();
      uVar9 = 0x37;
    }
    else {
      uVar9 = 0;
      pvVar13 = (void *)0x0;
      ptr_00 = (void *)0x0;
      ptr = (void *)0x0;
      uVar12 = 1;
      do {
        if (pvVar13 != (void *)0x0) {
          piVar1 = (int *)((long)pvVar13 + 0x20);
          do {
            iVar5 = *piVar1;
            iVar4 = iVar5 + -1;
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
            if (bVar3) {
              *piVar1 = iVar4;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
          if (iVar4 == 0) {
            DataMemoryBarrier(2,1);
          }
          else if (1 < iVar5) goto LAB_00a64ac4;
          CRYPTO_free(*(void **)((long)pvVar13 + 8));
          ossl_provider_free(*(undefined8 *)((long)pvVar13 + 0x18));
          CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar13 + 0x28));
          CRYPTO_free(ptr_00);
        }
LAB_00a64ac4:
        EVP_KEYMGMT_free(local_68);
        if ((uVar12 & 0x7fffffff) == 2) {
          uVar9 = EVP_KEYMGMT_get0_provider(*(undefined8 *)(param_1 + 8));
          ptr = (void *)evp_generic_fetch_from_prov
                                  (uVar9,0xe,lVar6,*(undefined8 *)(param_1 + 4),&LAB_00a6503c,
                                   EVP_KEM_up_ref,EVP_KEM_free);
          if (ptr == (void *)0x0) {
            ERR_new();
            uVar9 = 0x66;
            goto LAB_00a64c9c;
          }
LAB_00a64b54:
          pvVar13 = ptr;
          ptr_00 = ptr;
LAB_00a64b64:
          uVar7 = EVP_KEYMGMT_get0_name(*(undefined8 *)(param_1 + 8));
          lVar8 = evp_keymgmt_fetch_from_prov(uVar9,uVar7,*(undefined8 *)(param_1 + 4));
          local_68 = lVar8;
          if (lVar8 == 0) {
            lVar10 = 0;
LAB_00a64bac:
            EVP_KEYMGMT_free(lVar8);
          }
          else {
            lVar10 = evp_pkey_export_to_provider
                               (*(undefined8 *)(param_1 + 0x22),*(undefined8 *)(param_1 + 2),
                                &local_68,*(undefined8 *)(param_1 + 4));
            if (local_68 == 0) goto LAB_00a64bac;
          }
          if (lVar10 != 0) break;
        }
        else if ((uVar12 & 0x7fffffff) == 1) {
          ptr = (void *)evp_generic_fetch(*(undefined8 *)(param_1 + 2),0xe,lVar6,
                                          *(undefined8 *)(param_1 + 4),&LAB_00a6503c,EVP_KEM_up_ref,
                                          EVP_KEM_free);
          if (ptr != (void *)0x0) {
            uVar9 = *(undefined8 *)((long)ptr + 0x18);
            goto LAB_00a64b54;
          }
          ptr_00 = (void *)0x0;
          pvVar13 = (void *)0x0;
          lVar10 = 0;
        }
        else {
          if (pvVar13 != (void *)0x0) goto LAB_00a64b64;
          ptr = (void *)0x0;
          ptr_00 = (void *)0x0;
          lVar10 = 0;
        }
        uVar12 = uVar12 + 1;
      } while (uVar12 < 3);
      if (lVar10 == 0) {
        if (pvVar13 != (void *)0x0) {
          piVar1 = (int *)((long)pvVar13 + 0x20);
          do {
            iVar5 = *piVar1;
            iVar4 = iVar5 + -1;
            cVar2 = '\x01';
            bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
            if (bVar3) {
              *piVar1 = iVar4;
              cVar2 = ExclusiveMonitorsStatus();
            }
          } while (cVar2 != '\0');
          if (iVar4 == 0) {
            DataMemoryBarrier(2,1);
          }
          else if (1 < iVar5) goto LAB_00a64d64;
          CRYPTO_free(*(void **)((long)pvVar13 + 8));
          ossl_provider_free(*(undefined8 *)((long)pvVar13 + 0x18));
          CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar13 + 0x28));
          CRYPTO_free(ptr);
        }
LAB_00a64d64:
        ERR_new();
        uVar9 = 0x85;
      }
      else {
        *(void **)(param_1 + 10) = ptr;
        pcVar11 = *(code **)((long)pvVar13 + 0x30);
        ossl_provider_ctx(*(undefined8 *)((long)pvVar13 + 0x18));
        lVar6 = (*pcVar11)();
        *(long *)(param_1 + 0xc) = lVar6;
        if (lVar6 != 0) {
          if (param_2 == 0x2000) {
            pcVar11 = *(code **)((long)pvVar13 + 0x48);
            if (pcVar11 != (code *)0x0) {
LAB_00a64cdc:
              iVar5 = (*pcVar11)(lVar6,lVar10,param_3);
              EVP_KEYMGMT_free(local_68);
              local_68 = 0;
              if (0 < iVar5) {
                return 1;
              }
              goto LAB_00a64d94;
            }
            ERR_new();
            uVar9 = 0x9c;
          }
          else {
            if (param_2 != 0x1000) {
              ERR_new();
              uVar9 = 0xa3;
              goto LAB_00a64d7c;
            }
            pcVar11 = *(code **)((long)pvVar13 + 0x38);
            if (pcVar11 != (code *)0x0) goto LAB_00a64cdc;
            ERR_new();
            uVar9 = 0x94;
          }
LAB_00a64c9c:
          ERR_set_debug("crypto/evp/kem.c",uVar9,"evp_kem_init");
          ERR_set_error(6,0x96,0);
          iVar5 = -2;
          goto LAB_00a64d94;
        }
        ERR_new();
        uVar9 = 0x8d;
      }
    }
LAB_00a64d7c:
    ERR_set_debug("crypto/evp/kem.c",uVar9,"evp_kem_init");
    uVar9 = 0x86;
  }
LAB_00a64d88:
  ERR_set_error(6,uVar9,0);
  iVar5 = 0;
LAB_00a64d94:
  evp_pkey_ctx_free_old_ops(param_1);
  *param_1 = 0;
  EVP_KEYMGMT_free(local_68);
  return iVar5;
}

