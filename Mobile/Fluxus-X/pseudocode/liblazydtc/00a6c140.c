/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c140
 */

undefined8 evp_pkey_copy_downgraded(long *param_1,int *param_2)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  EVP_PKEY *pEVar4;
  undefined8 uVar5;
  EVP_PKEY_CTX *ctx;
  undefined4 *puVar6;
  EVP_PKEY *pkey;
  long lVar7;
  long lVar8;
  
  if (param_1 == (long *)0x0) {
    return 0;
  }
  if (((*(long *)(param_2 + 8) != 0) || (*(long *)(param_2 + 0x1a) != 0)) &&
     (lVar7 = *(long *)(param_2 + 0x18), lVar7 != 0)) {
    lVar8 = *(long *)(param_2 + 0x1a);
    iVar1 = *param_2;
    pcVar2 = (char *)EVP_KEYMGMT_get0_name(lVar7);
    if (iVar1 != -1) {
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/p_lib.c",0x7f0,"evp_pkey_copy_downgraded");
        ERR_set_error(6,0xc0103,"keymgmt key type = %s but legacy type = EVP_PKEY_NONE",pcVar2);
        return 0;
      }
      pcVar2 = OBJ_nid2sn(iVar1);
    }
    puVar6 = (undefined4 *)*param_1;
    if (puVar6 == (undefined4 *)0x0) {
      pEVar4 = EVP_PKEY_new();
      *param_1 = (long)pEVar4;
      pkey = pEVar4;
      if (pEVar4 == (EVP_PKEY *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/p_lib.c",0x7fe,"evp_pkey_copy_downgraded");
        ERR_set_error(6,0xc0100,0);
        return 0;
      }
    }
    else {
      evp_keymgmt_util_clear_operation_cache(puVar6,1);
      evp_pkey_free_legacy(puVar6);
      lVar3 = *(long *)(puVar6 + 0x18);
      if (lVar3 != 0) {
        evp_keymgmt_freedata(lVar3,*(undefined8 *)(puVar6 + 0x1a));
        EVP_KEYMGMT_free(*(undefined8 *)(puVar6 + 0x18));
        *(long *)(puVar6 + 0x18) = 0;
        *(undefined8 *)(puVar6 + 0x1a) = 0;
      }
      *puVar6 = 0;
      pEVar4 = (EVP_PKEY *)*param_1;
      pkey = (EVP_PKEY *)0x0;
    }
    iVar1 = FUN_00a6d2f4(pEVar4,0,iVar1,0,0xffffffff,0);
    if (iVar1 != 0) {
      if (lVar8 == 0) {
        return 1;
      }
      if (*(long *)(*(long *)(*param_1 + 8) + 0x128) == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/p_lib.c",0x80b,"evp_pkey_copy_downgraded");
        ERR_set_error(6,0xce,"key type = %s",pcVar2);
      }
      else {
        uVar5 = ossl_provider_libctx(*(undefined8 *)(lVar7 + 0x18));
        ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(uVar5,*param_1,0);
        if (ctx == (EVP_PKEY_CTX *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/evp/p_lib.c",0x818,"evp_pkey_copy_downgraded");
          ERR_set_error(6,0xc0100,0);
        }
        else {
          iVar1 = evp_keymgmt_export(lVar7,lVar8,0x87,
                                     *(undefined8 *)(*(long *)(*param_1 + 8) + 0x128),ctx);
          if (iVar1 != 0) {
            uVar5 = (**(code **)(*(long *)(*param_1 + 8) + 0x118))();
            *(undefined8 *)(*param_1 + 0x80) = uVar5;
            EVP_PKEY_CTX_free(ctx);
            return 1;
          }
        }
        EVP_PKEY_CTX_free(ctx);
      }
      ERR_new();
      ERR_set_debug("crypto/evp/p_lib.c",0x828,"evp_pkey_copy_downgraded");
      ERR_set_error(6,0xcd,"key type = %s",pcVar2);
    }
    if (pkey != (EVP_PKEY *)0x0) {
      EVP_PKEY_free(pkey);
      *param_1 = 0;
      return 0;
    }
  }
  return 0;
}

