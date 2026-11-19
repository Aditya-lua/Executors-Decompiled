/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7ba84
 */

/* WARNING: Removing unreachable block (ram,0x00a7bd18) */

int FUN_00a7ba84(int *param_1,int param_2,undefined8 param_3)

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
    ERR_set_debug("crypto/evp/signature.c",0x196,"evp_pkey_signature_init");
    ERR_set_error(6,0xc0102,0);
    return -1;
  }
  evp_pkey_ctx_free_old_ops();
  *param_1 = param_2;
  ERR_set_mark();
  lVar6 = *(long *)(param_1 + 8);
  if (lVar6 == 0) goto LAB_00a7be30;
  if (*(long *)(param_1 + 0x22) == 0) {
    ERR_clear_last_mark();
    ERR_new();
    ERR_set_debug("crypto/evp/signature.c",0x1a4,"evp_pkey_signature_init");
    uVar9 = 0x9a;
LAB_00a7bf20:
    ERR_set_error(6,uVar9,0);
    iVar5 = 0;
  }
  else {
    lVar10 = *(long *)(*(long *)(param_1 + 0x22) + 0x60);
    if ((lVar10 != 0) && (lVar10 != lVar6)) {
      ERR_clear_last_mark();
      ERR_new();
      ERR_set_debug("crypto/evp/signature.c",0x1ae,"evp_pkey_signature_init");
      uVar9 = 0xc0103;
      goto LAB_00a7bf20;
    }
    lVar6 = evp_keymgmt_util_query_operation_name(lVar6,0xc);
    if (lVar6 == 0) {
      ERR_clear_last_mark();
      ERR_new();
      uVar9 = 0x1b5;
LAB_00a7bf14:
      ERR_set_debug("crypto/evp/signature.c",uVar9,"evp_pkey_signature_init");
      uVar9 = 0x86;
      goto LAB_00a7bf20;
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
        else if (1 < iVar5) goto LAB_00a7bc04;
        CRYPTO_free(*(void **)((long)pvVar12 + 8));
        ossl_provider_free(*(undefined8 *)((long)pvVar12 + 0x18));
        CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar12 + 0x28));
        CRYPTO_free(ptr);
      }
LAB_00a7bc04:
      EVP_KEYMGMT_free(local_68);
      if ((uVar13 & 0x7fffffff) == 2) {
        uVar9 = EVP_KEYMGMT_get0_provider(*(undefined8 *)(param_1 + 8));
        ptr = (void *)evp_generic_fetch_from_prov
                                (uVar9,0xc,lVar6,*(undefined8 *)(param_1 + 4),&LAB_00a7b364,
                                 EVP_SIGNATURE_up_ref,EVP_SIGNATURE_free);
        if (ptr == (void *)0x0) goto LAB_00a7be30;
LAB_00a7bc94:
        pvVar12 = ptr;
        ptr_00 = ptr;
LAB_00a7bca4:
        uVar7 = EVP_KEYMGMT_get0_name(*(undefined8 *)(param_1 + 8));
        lVar8 = evp_keymgmt_fetch_from_prov(uVar9,uVar7,*(undefined8 *)(param_1 + 4));
        local_68 = lVar8;
        if (lVar8 == 0) {
          lVar10 = 0;
LAB_00a7bcec:
          EVP_KEYMGMT_free(lVar8);
        }
        else {
          lVar10 = evp_pkey_export_to_provider
                             (*(undefined8 *)(param_1 + 0x22),*(undefined8 *)(param_1 + 2),&local_68
                              ,*(undefined8 *)(param_1 + 4));
          if (local_68 == 0) goto LAB_00a7bcec;
        }
        if (lVar10 != 0) break;
      }
      else if ((uVar13 & 0x7fffffff) == 1) {
        ptr_00 = (void *)evp_generic_fetch(*(undefined8 *)(param_1 + 2),0xc,lVar6,
                                           *(undefined8 *)(param_1 + 4),&LAB_00a7b364,
                                           EVP_SIGNATURE_up_ref,EVP_SIGNATURE_free);
        if (ptr_00 != (void *)0x0) {
          uVar9 = *(undefined8 *)((long)ptr_00 + 0x18);
          ptr = ptr_00;
          goto LAB_00a7bc94;
        }
        lVar10 = 0;
        ptr = (void *)0x0;
        pvVar12 = (void *)0x0;
      }
      else {
        if (pvVar12 != (void *)0x0) goto LAB_00a7bca4;
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
        else if (1 < iVar5) goto LAB_00a7be30;
        CRYPTO_free(*(void **)((long)pvVar12 + 8));
        ossl_provider_free(*(undefined8 *)((long)pvVar12 + 0x18));
        CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar12 + 0x28));
        CRYPTO_free(ptr_00);
      }
LAB_00a7be30:
      ERR_pop_to_mark();
      EVP_KEYMGMT_free(local_68);
      local_68 = 0;
      lVar6 = *(long *)(param_1 + 0x1e);
      if (lVar6 == 0) {
LAB_00a7bec8:
        ERR_new();
        ERR_set_debug("crypto/evp/signature.c",0x243,"evp_pkey_signature_init");
        ERR_set_error(6,0x96,0);
        return -2;
      }
      if (param_2 == 0x40) {
        if (*(long *)(lVar6 + 0x68) == 0) goto LAB_00a7bec8;
        pcVar11 = *(code **)(lVar6 + 0x60);
      }
      else if (param_2 == 0x20) {
        if (*(long *)(lVar6 + 0x58) == 0) goto LAB_00a7bec8;
        pcVar11 = *(code **)(lVar6 + 0x50);
      }
      else {
        if (param_2 != 0x10) {
          ERR_new();
          uVar9 = 600;
          goto LAB_00a7bf14;
        }
        if (*(long *)(lVar6 + 0x48) == 0) goto LAB_00a7bec8;
        pcVar11 = *(code **)(lVar6 + 0x40);
      }
      if (pcVar11 == (code *)0x0) {
        return 1;
      }
      iVar5 = (*pcVar11)(param_1);
      if (0 < iVar5) {
LAB_00a7beb0:
        iVar5 = evp_pkey_ctx_use_cached_data(param_1);
        goto LAB_00a7bf3c;
      }
    }
    else {
      ERR_pop_to_mark();
      *(void **)(param_1 + 10) = ptr_00;
      pcVar11 = *(code **)((long)pvVar12 + 0x30);
      uVar9 = ossl_provider_ctx(*(undefined8 *)((long)pvVar12 + 0x18));
      lVar6 = (*pcVar11)(uVar9,*(undefined8 *)(param_1 + 4));
      *(long *)(param_1 + 0xc) = lVar6;
      if (lVar6 == 0) {
        ERR_new();
        uVar9 = 0x20b;
        goto LAB_00a7bf14;
      }
      if (param_2 == 0x40) {
        pcVar11 = *(code **)((long)pvVar12 + 0x58);
        if (pcVar11 == (code *)0x0) {
          ERR_new();
          uVar9 = 0x222;
LAB_00a7bff0:
          ERR_set_debug("crypto/evp/signature.c",uVar9,"evp_pkey_signature_init");
          ERR_set_error(6,0x96,0);
          iVar5 = -2;
          goto LAB_00a7bf2c;
        }
      }
      else if (param_2 == 0x20) {
        pcVar11 = *(code **)((long)pvVar12 + 0x48);
        if (pcVar11 == (code *)0x0) {
          ERR_new();
          uVar9 = 0x21a;
          goto LAB_00a7bff0;
        }
      }
      else {
        if (param_2 != 0x10) {
          ERR_new();
          uVar9 = 0x22a;
          goto LAB_00a7bf14;
        }
        pcVar11 = *(code **)((long)pvVar12 + 0x38);
        if (pcVar11 == (code *)0x0) {
          ERR_new();
          uVar9 = 0x212;
          goto LAB_00a7bff0;
        }
      }
      iVar5 = (*pcVar11)(lVar6,lVar10,param_3);
      if (0 < iVar5) goto LAB_00a7beb0;
      (**(code **)((long)pvVar12 + 0xa8))(*(undefined8 *)(param_1 + 0xc));
      param_1[0xc] = 0;
      param_1[0xd] = 0;
    }
  }
LAB_00a7bf2c:
  evp_pkey_ctx_free_old_ops(param_1);
  *param_1 = 0;
LAB_00a7bf3c:
  EVP_KEYMGMT_free(local_68);
  return iVar5;
}

