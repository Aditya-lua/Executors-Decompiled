/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c550
 */

long evp_pkey_export_to_provider(int *param_1,undefined8 param_2,long *param_3,undefined8 param_4)

{
  int iVar1;
  EVP_PKEY_CTX *ctx;
  long *plVar2;
  char *pcVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  
  if (param_1 == (int *)0x0) {
    return 0;
  }
  if (*(long *)(param_1 + 8) == 0) {
    lVar6 = *(long *)(param_1 + 0x1a);
  }
  else {
    if (*(long *)(*(long *)(param_1 + 2) + 0x118) == 0) {
      return 0;
    }
    lVar6 = *(long *)(*(long *)(param_1 + 2) + 0x120);
  }
  if (lVar6 == 0) {
    return 0;
  }
  if (param_3 == (long *)0x0) {
LAB_00a6c5dc:
    ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(param_2,param_1,param_4);
    if (ctx == (EVP_PKEY_CTX *)0x0) {
      lVar6 = 0;
      lVar7 = 0;
      lVar8 = 0;
      goto LAB_00a6c7c0;
    }
    lVar8 = *(long *)(ctx + 0x20);
    *(undefined8 *)(ctx + 0x20) = 0;
    EVP_PKEY_CTX_free(ctx);
    lVar6 = lVar8;
    if (lVar8 != 0) {
      lVar7 = *(long *)(param_1 + 8);
      goto joined_r0x00a6c608;
    }
  }
  else {
    lVar6 = *param_3;
    *param_3 = 0;
    if (lVar6 == 0) goto LAB_00a6c5dc;
    lVar8 = 0;
    lVar7 = *(long *)(param_1 + 8);
joined_r0x00a6c608:
    if (lVar7 == 0) {
      lVar7 = evp_keymgmt_util_export_to_provider(param_1,lVar6,0x87);
      goto LAB_00a6c7c0;
    }
    lVar7 = (**(code **)(*(long *)(param_1 + 2) + 0x118))(param_1);
    if (lVar7 == *(long *)(param_1 + 0x20)) {
      iVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(param_1 + 0xe));
      if (iVar1 == 0) goto LAB_00a6c7bc;
      plVar2 = (long *)evp_keymgmt_util_find_operation_cache(param_1,lVar6,0x87);
      if ((plVar2 != (long *)0x0) && (*plVar2 != 0)) {
        lVar7 = plVar2[1];
        CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xe));
        goto LAB_00a6c7c0;
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xe));
    }
    pcVar3 = OBJ_nid2sn(*param_1);
    iVar1 = EVP_KEYMGMT_is_a(lVar6,pcVar3);
    if (iVar1 != 0) {
      lVar7 = evp_keymgmt_newdata(lVar6);
      if (lVar7 == 0) goto LAB_00a6c7c0;
      iVar1 = (**(code **)(*(long *)(param_1 + 2) + 0x120))
                        (param_1,lVar7,*(undefined8 *)(lVar6 + 0xb8),param_2,param_4);
      if ((iVar1 != 0) && (iVar1 = EVP_KEYMGMT_up_ref(lVar6), iVar1 != 0)) {
        iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0xe));
        if (iVar1 == 0) goto LAB_00a6c7c0;
        lVar4 = (**(code **)(*(long *)(param_1 + 2) + 0x118))(param_1);
        if ((lVar4 != *(long *)(param_1 + 0x20)) &&
           (iVar1 = evp_keymgmt_util_clear_operation_cache(param_1,0), iVar1 == 0)) {
          CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xe));
          evp_keymgmt_freedata(lVar6,lVar7);
          EVP_KEYMGMT_free(lVar6);
          goto LAB_00a6c7bc;
        }
        EVP_KEYMGMT_free(lVar6);
        plVar2 = (long *)evp_keymgmt_util_find_operation_cache(param_1,lVar6,0x87);
        if ((plVar2 != (long *)0x0) && (*plVar2 != 0)) {
          lVar4 = plVar2[1];
          CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xe));
          evp_keymgmt_freedata(lVar6,lVar7);
          lVar7 = lVar4;
          goto LAB_00a6c7c0;
        }
        iVar1 = evp_keymgmt_util_cache_keydata(param_1,lVar6,lVar7,0x87);
        if (iVar1 != 0) {
          uVar5 = (**(code **)(*(long *)(param_1 + 2) + 0x118))(param_1);
          *(undefined8 *)(param_1 + 0x20) = uVar5;
          CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xe));
          goto LAB_00a6c7c0;
        }
        CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xe));
      }
      evp_keymgmt_freedata(lVar6,lVar7);
    }
  }
LAB_00a6c7bc:
  lVar7 = 0;
LAB_00a6c7c0:
  lVar4 = 0;
  if (lVar7 != 0) {
    lVar4 = lVar6;
  }
  if ((param_3 != (long *)0x0) && (lVar4 != 0)) {
    lVar8 = 0;
    *param_3 = lVar4;
  }
  EVP_KEYMGMT_free(lVar8);
  return lVar7;
}

