/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a63494
 */

/* WARNING: Removing unreachable block (ram,0x00a63754) */

uint EVP_PKEY_derive_init_ex(undefined4 *param_1,undefined8 param_2)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  stack_st_X509_ATTRIBUTE *psVar7;
  long lVar8;
  undefined8 uVar9;
  long lVar10;
  undefined8 uVar11;
  long lVar12;
  EVP_PKEY *pkey;
  void *pvVar13;
  code *pcVar14;
  void *ptr;
  void *ptr_00;
  long local_68;
  
  local_68 = 0;
  if (param_1 == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/exchange.c",0xd3,"EVP_PKEY_derive_init_ex");
    uVar11 = 0xc0102;
    goto LAB_00a638e8;
  }
  evp_pkey_ctx_free_old_ops();
  *param_1 = 0x800;
  ERR_set_mark();
  if (*(long *)(param_1 + 8) == 0) goto LAB_00a63884;
  pkey = *(EVP_PKEY **)(param_1 + 0x22);
  if (pkey == (EVP_PKEY *)0x0) {
    pkey = EVP_PKEY_new();
    if ((pkey != (EVP_PKEY *)0x0) &&
       (iVar5 = EVP_PKEY_set_type_by_keymgmt(pkey,*(undefined8 *)(param_1 + 8)), iVar5 != 0)) {
      psVar7 = (stack_st_X509_ATTRIBUTE *)evp_keymgmt_newdata(*(undefined8 *)(param_1 + 8));
      pkey[1].attributes = psVar7;
      if (psVar7 != (stack_st_X509_ATTRIBUTE *)0x0) {
        *(EVP_PKEY **)(param_1 + 0x22) = pkey;
        goto LAB_00a634e4;
      }
    }
    ERR_clear_last_mark();
    EVP_PKEY_free(pkey);
    ERR_new();
    uVar11 = 0xeb;
  }
  else {
LAB_00a634e4:
    lVar12 = *(long *)&pkey[1].save_parameters;
    lVar8 = *(long *)(param_1 + 8);
    if (lVar12 != 0) {
      if (lVar12 != *(long *)(param_1 + 8)) {
        ERR_clear_last_mark();
        ERR_new();
        ERR_set_debug("crypto/evp/exchange.c",0xf7,"EVP_PKEY_derive_init_ex");
        uVar11 = 0xc0103;
        goto LAB_00a63820;
      }
      lVar8 = lVar12;
    }
    lVar8 = evp_keymgmt_util_query_operation_name(lVar8,0xb);
    if (lVar8 == 0) {
      ERR_clear_last_mark();
      ERR_new();
      uVar11 = 0xfe;
    }
    else {
      uVar11 = 0;
      pvVar13 = (void *)0x0;
      ptr = (void *)0x0;
      ptr_00 = (void *)0x0;
      uVar6 = 1;
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
          else if (1 < iVar5) goto LAB_00a63640;
          CRYPTO_free(*(void **)((long)pvVar13 + 8));
          ossl_provider_free(*(undefined8 *)((long)pvVar13 + 0x18));
          CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar13 + 0x28));
          CRYPTO_free(ptr);
        }
LAB_00a63640:
        EVP_KEYMGMT_free(local_68);
        if ((uVar6 & 0x7fffffff) == 2) {
          uVar11 = EVP_KEYMGMT_get0_provider(*(undefined8 *)(param_1 + 8));
          pvVar13 = (void *)evp_generic_fetch_from_prov
                                      (uVar11,0xb,lVar8,*(undefined8 *)(param_1 + 4),&LAB_00a63150,
                                       EVP_KEYEXCH_up_ref,EVP_KEYEXCH_free);
          if (pvVar13 == (void *)0x0) goto LAB_00a63884;
LAB_00a636d0:
          ptr = pvVar13;
          ptr_00 = pvVar13;
LAB_00a636e0:
          uVar9 = EVP_KEYMGMT_get0_name(*(undefined8 *)(param_1 + 8));
          lVar10 = evp_keymgmt_fetch_from_prov(uVar11,uVar9,*(undefined8 *)(param_1 + 4));
          local_68 = lVar10;
          if (lVar10 == 0) {
            lVar12 = 0;
LAB_00a63728:
            EVP_KEYMGMT_free(lVar10);
          }
          else {
            lVar12 = evp_pkey_export_to_provider
                               (*(undefined8 *)(param_1 + 0x22),*(undefined8 *)(param_1 + 2),
                                &local_68,*(undefined8 *)(param_1 + 4));
            if (local_68 == 0) goto LAB_00a63728;
          }
          if (lVar12 != 0) break;
        }
        else if ((uVar6 & 0x7fffffff) == 1) {
          ptr_00 = (void *)evp_generic_fetch(*(undefined8 *)(param_1 + 2),0xb,lVar8,
                                             *(undefined8 *)(param_1 + 4),&LAB_00a63150,
                                             EVP_KEYEXCH_up_ref,EVP_KEYEXCH_free);
          if (ptr_00 != (void *)0x0) {
            uVar11 = *(undefined8 *)((long)ptr_00 + 0x18);
            pvVar13 = ptr_00;
            goto LAB_00a636d0;
          }
          lVar12 = 0;
          ptr = (void *)0x0;
          pvVar13 = (void *)0x0;
        }
        else {
          if (pvVar13 != (void *)0x0) goto LAB_00a636e0;
          lVar12 = 0;
          ptr_00 = (void *)0x0;
          ptr = (void *)0x0;
        }
        uVar6 = uVar6 + 1;
      } while (uVar6 < 3);
      if (lVar12 == 0) {
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
          else if (1 < iVar5) goto LAB_00a63884;
          CRYPTO_free(*(void **)((long)pvVar13 + 8));
          ossl_provider_free(*(undefined8 *)((long)pvVar13 + 0x18));
          CRYPTO_THREAD_lock_free(*(undefined8 *)((long)pvVar13 + 0x28));
          CRYPTO_free(ptr_00);
        }
LAB_00a63884:
        iVar5 = ERR_pop_to_mark();
        lVar8 = *(long *)(param_1 + 0x1e);
        if ((lVar8 != 0) && (*(long *)(lVar8 + 0xb8) != 0)) {
          if (*(code **)(lVar8 + 0xb0) == (code *)0x0) {
            return 1;
          }
          uVar6 = (**(code **)(lVar8 + 0xb0))(param_1);
          if ((int)uVar6 < 1) {
            *param_1 = 0;
          }
          EVP_KEYMGMT_free(local_68);
          return uVar6;
        }
        ERR_new(iVar5);
        ERR_set_debug("crypto/evp/exchange.c",0x16b,"EVP_PKEY_derive_init_ex");
        uVar11 = 0x96;
LAB_00a638e8:
        ERR_set_error(6,uVar11,0);
        return 0xfffffffe;
      }
      ERR_pop_to_mark();
      *(void **)(param_1 + 10) = ptr_00;
      pcVar14 = *(code **)((long)pvVar13 + 0x30);
      ossl_provider_ctx(*(undefined8 *)((long)pvVar13 + 0x18));
      lVar8 = (*pcVar14)();
      *(long *)(param_1 + 0xc) = lVar8;
      if (lVar8 != 0) {
        iVar5 = (**(code **)((long)pvVar13 + 0x38))(lVar8,lVar12,param_2);
        EVP_KEYMGMT_free(local_68);
        return (uint)(iVar5 != 0);
      }
      ERR_new();
      uVar11 = 0x153;
    }
  }
  ERR_set_debug("crypto/evp/exchange.c",uVar11,"EVP_PKEY_derive_init_ex");
  uVar11 = 0x86;
LAB_00a63820:
  ERR_set_error(6,uVar11,0);
  evp_pkey_ctx_free_old_ops(param_1);
  *param_1 = 0;
  EVP_KEYMGMT_free(local_68);
  return 0;
}

