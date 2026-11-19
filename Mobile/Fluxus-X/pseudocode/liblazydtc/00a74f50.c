/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74f50
 */

/* WARNING: Type propagation algorithm not settling */

EVP_PKEY_CTX *
FUN_00a74f50(undefined8 param_1,int *param_2,ENGINE *param_3,char *param_4,char *param_5,int param_6
            )

{
  bool bVar1;
  int iVar2;
  EVP_PKEY_METHOD *pEVar3;
  EVP_PKEY_CTX *ctx;
  undefined8 *puVar4;
  char *pcVar5;
  undefined8 uVar6;
  byte bVar7;
  long lVar8;
  EVP_PKEY_METHOD *local_170;
  int local_168 [66];
  
  if (param_6 == -1) {
    if (param_2 == (int *)0x0) {
LAB_00a75034:
      if ((param_4 != (char *)0x0) && (param_6 = evp_pkey_name2type(param_4), param_6 != 0))
      goto LAB_00a750d0;
    }
    else {
      if (*(long *)(param_2 + 0x18) != 0) {
        param_4 = (char *)EVP_KEYMGMT_get0_name();
        goto LAB_00a75034;
      }
      param_6 = *param_2;
LAB_00a750d0:
      if (param_6 != -1) goto LAB_00a74f98;
    }
    if (param_3 != (ENGINE *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/pmeth_lib.c",0xd6,"int_ctx_new");
      uVar6 = 0x9c;
      goto LAB_00a75108;
    }
    param_6 = -1;
    bVar7 = 1;
joined_r0x00a75128:
    bVar1 = true;
    pEVar3 = (EVP_PKEY_METHOD *)0x0;
joined_r0x00a75128:
    if (param_4 == (char *)0x0) {
LAB_00a75308:
      param_3 = (ENGINE *)0x0;
      goto joined_r0x00a7530c;
    }
LAB_00a7512c:
    if (!bVar1) goto LAB_00a75308;
    if ((param_2 == (int *)0x0) || (*(long *)(param_2 + 0x18) == 0)) {
      lVar8 = EVP_KEYMGMT_fetch(param_1,param_4,param_5);
    }
    else {
      iVar2 = EVP_KEYMGMT_up_ref();
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/pmeth_lib.c",0x115,"int_ctx_new");
        uVar6 = 0x86;
LAB_00a75108:
        ERR_set_error(6,uVar6,0);
        return (EVP_PKEY_CTX *)0x0;
      }
      lVar8 = *(long *)(param_2 + 0x18);
    }
    if (lVar8 == 0) {
      return (EVP_PKEY_CTX *)0x0;
    }
    local_168[0] = 0;
    EVP_KEYMGMT_names_do_all(lVar8,&LAB_00a77e74,local_168);
    iVar2 = param_6;
    if (local_168[0] != 0) {
      iVar2 = local_168[0];
    }
    if ((bool)(bVar7 | local_168[0] == 0)) {
      param_6 = iVar2;
LAB_00a75208:
      bVar1 = pEVar3 == (EVP_PKEY_METHOD *)0x0;
      param_3 = (ENGINE *)0x0;
      goto LAB_00a74fcc;
    }
    if (param_6 == local_168[0]) goto LAB_00a75208;
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x132,"int_ctx_new");
    ERR_set_error(6,0xc0103,0);
LAB_00a7541c:
    EVP_KEYMGMT_free(lVar8);
  }
  else {
LAB_00a74f98:
    pcVar5 = (char *)0x0;
    if (param_3 == (ENGINE *)0x0) {
      if (param_2 == (int *)0x0) {
        param_4 = OBJ_nid2sn(param_6);
        bVar1 = false;
      }
      else {
        if ((*(byte *)(param_2 + 0x13) & 1) == 0) {
          param_4 = OBJ_nid2sn(param_6);
        }
        param_3 = *(ENGINE **)(param_2 + 6);
        pcVar5 = param_4;
        if ((param_3 != (ENGINE *)0x0) ||
           (param_3 = *(ENGINE **)(param_2 + 4), param_3 != (ENGINE *)0x0)) goto LAB_00a74fa4;
        bVar1 = true;
      }
      param_3 = ENGINE_get_pkey_meth_engine(param_6);
      if (param_3 == (ENGINE *)0x0) {
        if ((!bVar1) || ((*(byte *)(param_2 + 0x13) & 1) == 0)) {
          if (DAT_00d21b48 == 0) {
LAB_00a751ec:
            bVar7 = 0;
            goto joined_r0x00a75128;
          }
          local_168[0] = param_6;
          iVar2 = OPENSSL_sk_find(DAT_00d21b48,local_168);
          if (iVar2 < 0) goto LAB_00a751ec;
          pEVar3 = (EVP_PKEY_METHOD *)OPENSSL_sk_value(DAT_00d21b48,iVar2);
          bVar1 = pEVar3 == (EVP_PKEY_METHOD *)0x0;
          bVar7 = 0;
          goto joined_r0x00a75128;
        }
        if (DAT_00d21b48 == 0) {
LAB_00a752b4:
          local_170 = (EVP_PKEY_METHOD *)local_168;
          local_168[0] = param_6;
          puVar4 = OBJ_bsearch_(&local_170,&switchD_00a75b78::switchdataD_00cc8ed8,10,8,
                                (cmp *)&LAB_00a77e44);
          if ((puVar4 == (undefined8 *)0x0) || ((code *)*puVar4 == (code *)0x0)) {
            pEVar3 = (EVP_PKEY_METHOD *)0x0;
          }
          else {
            pEVar3 = (EVP_PKEY_METHOD *)(*(code *)*puVar4)();
          }
        }
        else {
          local_168[0] = param_6;
          iVar2 = OPENSSL_sk_find(DAT_00d21b48,local_168);
          if (iVar2 < 0) goto LAB_00a752b4;
          pEVar3 = (EVP_PKEY_METHOD *)OPENSSL_sk_value(DAT_00d21b48,iVar2);
          local_170 = pEVar3;
          if (pEVar3 == (EVP_PKEY_METHOD *)0x0) goto LAB_00a752b4;
        }
        bVar7 = 0;
        bVar1 = true;
        if (param_4 != (char *)0x0) goto LAB_00a7512c;
        goto LAB_00a75308;
      }
    }
    else {
LAB_00a74fa4:
      iVar2 = ENGINE_init(param_3);
      param_4 = pcVar5;
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/pmeth_lib.c",0xf1,"int_ctx_new");
        uVar6 = 0x80026;
        goto LAB_00a75108;
      }
    }
    pEVar3 = ENGINE_get_pkey_meth(param_3,param_6);
joined_r0x00a7530c:
    if (pEVar3 == (EVP_PKEY_METHOD *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/pmeth_lib.c",0x13d,"int_ctx_new");
      ERR_set_error(6,0x9c,0);
      lVar8 = 0;
      ctx = (EVP_PKEY_CTX *)0x0;
      bVar1 = true;
    }
    else {
      bVar1 = false;
      lVar8 = 0;
LAB_00a74fcc:
      ctx = (EVP_PKEY_CTX *)CRYPTO_zalloc(0xb0,"crypto/evp/pmeth_lib.c",0x13f);
      if (ctx == (EVP_PKEY_CTX *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/pmeth_lib.c",0x141,"int_ctx_new");
        ERR_set_error(6,0xc0100,0);
      }
    }
    if ((param_3 != (ENGINE *)0x0) && ((bool)(bVar1 | ctx == (EVP_PKEY_CTX *)0x0))) {
      ENGINE_finish(param_3);
    }
    if (ctx == (EVP_PKEY_CTX *)0x0) {
      EVP_KEYMGMT_free(lVar8);
      return (EVP_PKEY_CTX *)0x0;
    }
    if (param_5 != (char *)0x0) {
      pcVar5 = CRYPTO_strdup(param_5,"crypto/evp/pmeth_lib.c",0x14e);
      *(char **)(ctx + 0x10) = pcVar5;
      if (pcVar5 == (char *)0x0) {
        CRYPTO_free(ctx);
        goto LAB_00a7541c;
      }
    }
    *(undefined8 *)(ctx + 8) = param_1;
    *(char **)(ctx + 0x18) = param_4;
    *(long *)(ctx + 0x20) = lVar8;
    *(int *)(ctx + 0x74) = param_6;
    *(EVP_PKEY_METHOD **)(ctx + 0x78) = pEVar3;
    *(ENGINE **)(ctx + 0x80) = param_3;
    *(undefined4 *)ctx = 0;
    *(int **)(ctx + 0x88) = param_2;
    if (param_2 != (int *)0x0) {
      EVP_PKEY_up_ref(param_2);
    }
    if (bVar1) {
      return ctx;
    }
    if (*(code **)(pEVar3 + 8) == (code *)0x0) {
      return ctx;
    }
    iVar2 = (**(code **)(pEVar3 + 8))(ctx);
    if (0 < iVar2) {
      return ctx;
    }
    *(undefined8 *)(ctx + 0x78) = 0;
    EVP_PKEY_CTX_free(ctx);
  }
  return (EVP_PKEY_CTX *)0x0;
}

