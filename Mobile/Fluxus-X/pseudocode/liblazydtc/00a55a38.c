/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a55a38
 */

/* WARNING: Removing unreachable block (ram,0x00a55cac) */

int FUN_00a55a38(int *param_1,int param_2,undefined8 param_3)

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
  void *pvVar12;
  void *ptr_00;
  uint uVar13;
  long local_68;
  
  local_68 = 0;
  if (param_1 == (int *)0x0) {
    ERR_new();
    uVar9 = 0x20;
    goto LAB_00a55e8c;
  }
  evp_pkey_ctx_free_old_ops();
  *param_1 = param_2;
  ERR_set_mark();
  lVar6 = *(long *)(param_1 + 8);
  if (lVar6 == 0) goto LAB_00a55e30;
  if (*(long *)(param_1 + 0x22) == 0) {
    ERR_clear_last_mark();
    ERR_new();
    ERR_set_debug("crypto/evp/asymcipher.c",0x2e,"evp_pkey_asym_cipher_init");
    uVar9 = 0x9a;
LAB_00a55dcc:
    ERR_set_error(6,uVar9,0);
    iVar5 = 0;
  }
  else {
    lVar10 = *(long *)(*(long *)(param_1 + 0x22) + 0x60);
    if ((lVar10 != 0) && (lVar10 != lVar6)) {
      ERR_clear_last_mark();
      ERR_new();
      ERR_set_debug("crypto/evp/asymcipher.c",0x38,"evp_pkey_asym_cipher_init");
      uVar9 = 0xc0103;
      goto LAB_00a55dcc;
    }
    lVar6 = evp_keymgmt_util_query_operation_name(lVar6,0xd);
    if (lVar6 == 0) {
      ERR_clear_last_mark();
      ERR_new();
      uVar9 = 0x40;
LAB_00a55dc0:
      ERR_set_debug("crypto/evp/asymcipher.c",uVar9,"evp_pkey_asym_cipher_init");
      uVar9 = 0x86;
      goto LAB_00a55dcc;
    }
    uVar9 = 0;
    pvVar12 = (void *)0x0;
    ptr = (void *)0x0;
    ptr_00 = (void *)0x0;
    uVar13 = 1;
    do {
      if (pvVar12 != (void *)0x0) {
        piVar1 = (int *)((long)pvVar12 + 0x20);
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
        else if (1 < iVar5) goto LAB_00a55b98;
        CRYPTO_free(*(void **)((long)pvVar12 + 8));
        ossl_provider_free(*(undefined8 *)((long)pvVar12 + 0x18));
        CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar12 + 0x28));
        CRYPTO_free(ptr);
      }
LAB_00a55b98:
      EVP_KEYMGMT_free(local_68);
      if ((uVar13 & 0x7fffffff) == 2) {
        uVar9 = EVP_KEYMGMT_get0_provider(*(undefined8 *)(param_1 + 8));
        ptr = (void *)evp_generic_fetch_from_prov
                                (uVar9,0xd,lVar6,*(undefined8 *)(param_1 + 4),&LAB_00a56410,
                                 EVP_ASYM_CIPHER_up_ref,EVP_ASYM_CIPHER_free);
        if (ptr == (void *)0x0) goto LAB_00a55e30;
LAB_00a55c28:
        pvVar12 = ptr;
        ptr_00 = ptr;
LAB_00a55c38:
        uVar7 = EVP_KEYMGMT_get0_name(*(undefined8 *)(param_1 + 8));
        lVar8 = evp_keymgmt_fetch_from_prov(uVar9,uVar7,*(undefined8 *)(param_1 + 4));
        local_68 = lVar8;
        if (lVar8 == 0) {
          lVar10 = 0;
LAB_00a55c80:
          EVP_KEYMGMT_free(lVar8);
        }
        else {
          lVar10 = evp_pkey_export_to_provider
                             (*(undefined8 *)(param_1 + 0x22),*(undefined8 *)(param_1 + 2),&local_68
                              ,*(undefined8 *)(param_1 + 4));
          if (local_68 == 0) goto LAB_00a55c80;
        }
        if (lVar10 != 0) break;
      }
      else if ((uVar13 & 0x7fffffff) == 1) {
        ptr_00 = (void *)evp_generic_fetch(*(undefined8 *)(param_1 + 2),0xd,lVar6,
                                           *(undefined8 *)(param_1 + 4),&LAB_00a56410,
                                           EVP_ASYM_CIPHER_up_ref,EVP_ASYM_CIPHER_free);
        if (ptr_00 != (void *)0x0) {
          uVar9 = *(undefined8 *)((long)ptr_00 + 0x18);
          ptr = ptr_00;
          goto LAB_00a55c28;
        }
        lVar10 = 0;
        ptr = (void *)0x0;
        pvVar12 = (void *)0x0;
      }
      else {
        if (pvVar12 != (void *)0x0) goto LAB_00a55c38;
        lVar10 = 0;
        ptr_00 = (void *)0x0;
        ptr = (void *)0x0;
      }
      uVar13 = uVar13 + 1;
    } while (uVar13 < 3);
    if (lVar10 == 0) {
      if (pvVar12 != (void *)0x0) {
        piVar1 = (int *)((long)pvVar12 + 0x20);
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
        else if (1 < iVar5) goto LAB_00a55e30;
        CRYPTO_free(*(void **)((long)pvVar12 + 8));
        ossl_provider_free(*(undefined8 *)((long)pvVar12 + 0x18));
        CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar12 + 0x28));
        CRYPTO_free(ptr_00);
      }
LAB_00a55e30:
      ERR_pop_to_mark();
      EVP_KEYMGMT_free(local_68);
      local_68 = 0;
      lVar6 = *(long *)(param_1 + 0x1e);
      if ((lVar6 == 0) || (*(long *)(lVar6 + 0x98) == 0)) {
        ERR_new();
        uVar9 = 0xbd;
LAB_00a55e8c:
        ERR_set_debug("crypto/evp/asymcipher.c",uVar9,"evp_pkey_asym_cipher_init");
        ERR_set_error(6,0x96,0);
        return -2;
      }
      if (*param_1 == 0x400) {
        pcVar11 = *(code **)(lVar6 + 0xa0);
      }
      else {
        if (*param_1 != 0x200) {
          ERR_new();
          ERR_set_debug("crypto/evp/asymcipher.c",0xcc,"evp_pkey_asym_cipher_init");
          ERR_set_error(6,0x86,0);
          iVar5 = -1;
          goto LAB_00a55dd8;
        }
        pcVar11 = *(code **)(lVar6 + 0x90);
      }
      if (pcVar11 == (code *)0x0) {
        return 1;
      }
      iVar5 = (*pcVar11)(param_1);
      if (0 < iVar5) goto LAB_00a55de4;
    }
    else {
      ERR_pop_to_mark();
      *(void **)(param_1 + 10) = ptr_00;
      pcVar11 = *(code **)((long)pvVar12 + 0x30);
      ossl_provider_ctx(*(undefined8 *)((long)pvVar12 + 0x18));
      lVar6 = (*pcVar11)();
      *(long *)(param_1 + 0xc) = lVar6;
      if (lVar6 == 0) {
        ERR_new();
        uVar9 = 0x94;
        goto LAB_00a55dc0;
      }
      if (param_2 == 0x400) {
        pcVar11 = *(code **)((long)pvVar12 + 0x48);
        if (pcVar11 != (code *)0x0) {
LAB_00a55d80:
          iVar5 = (*pcVar11)(lVar6,lVar10,param_3);
          if (0 < iVar5) {
            EVP_KEYMGMT_free(local_68);
            return 1;
          }
          goto LAB_00a55dd8;
        }
        ERR_new();
        uVar9 = 0xa3;
      }
      else {
        if (param_2 != 0x200) {
          ERR_new();
          uVar9 = 0xaa;
          goto LAB_00a55dc0;
        }
        pcVar11 = *(code **)((long)pvVar12 + 0x38);
        if (pcVar11 != (code *)0x0) goto LAB_00a55d80;
        ERR_new();
        uVar9 = 0x9b;
      }
      ERR_set_debug("crypto/evp/asymcipher.c",uVar9,"evp_pkey_asym_cipher_init");
      ERR_set_error(6,0x96,0);
      iVar5 = -2;
    }
  }
LAB_00a55dd8:
  evp_pkey_ctx_free_old_ops(param_1);
  *param_1 = 0;
LAB_00a55de4:
  EVP_KEYMGMT_free(local_68);
  return iVar5;
}

