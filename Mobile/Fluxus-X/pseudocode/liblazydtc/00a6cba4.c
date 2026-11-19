/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6cba4
 */

EVP_PKEY *
FUN_00a6cba4(undefined8 param_1,char *param_2,undefined8 param_3,int param_4,long param_5,
            undefined8 param_6,undefined8 param_7,int param_8)

{
  undefined *puVar1;
  ENGINE *pEVar2;
  int iVar3;
  EVP_PKEY_ASN1_METHOD *pEVar4;
  char *pcVar5;
  undefined8 uVar6;
  long lVar7;
  EVP_PKEY_CTX *ctx;
  ENGINE *local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  ENGINE *local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  EVP_PKEY *local_68;
  
  ctx = (EVP_PKEY_CTX *)0x0;
  local_68 = (EVP_PKEY *)0x0;
  if (param_5 == 0) {
    local_c0 = (ENGINE *)0x0;
    if (param_2 == (char *)0x0) {
      if (param_4 == 0) {
        pEVar4 = (EVP_PKEY_ASN1_METHOD *)0x0;
      }
      else {
        pEVar4 = EVP_PKEY_asn1_find(&local_c0,param_4);
      }
    }
    else {
      pEVar4 = EVP_PKEY_asn1_find_str(&local_c0,param_2,-1);
    }
    pEVar2 = local_c0;
    ENGINE_finish(local_c0);
    if ((pEVar4 != (EVP_PKEY_ASN1_METHOD *)0x0) &&
       (ctx = (EVP_PKEY_CTX *)0x0, pEVar2 != (ENGINE *)0x0)) goto LAB_00a6cd00;
    pcVar5 = param_2;
    if (param_2 == (char *)0x0) {
      pcVar5 = OBJ_nid2sn(param_4);
    }
    ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_name(param_1,pcVar5,param_3);
    if (ctx != (EVP_PKEY_CTX *)0x0) {
      ERR_set_mark();
      iVar3 = EVP_PKEY_fromdata_init(ctx);
      if (iVar3 != 1) {
        ERR_pop_to_mark();
        goto LAB_00a6cd00;
      }
      memset(&local_c0,0,0x50);
      ERR_clear_last_mark();
      puVar1 = &DAT_002ad463;
      if (param_8 != 0) {
        puVar1 = &DAT_002a3e83;
      }
      OSSL_PARAM_construct_octet_string(&local_e8,puVar1,param_6,param_7);
      local_a0 = local_c8;
      uStack_b8 = uStack_e0;
      local_c0 = local_e8;
      uStack_a8 = uStack_d0;
      uStack_b0 = local_d8;
      iVar3 = EVP_PKEY_fromdata(ctx,&local_68,0x87,&local_c0);
      if (iVar3 == 1) goto LAB_00a6ce34;
      ERR_new();
      uVar6 = 0x1ad;
      goto LAB_00a6cdc8;
    }
  }
  else {
LAB_00a6cd00:
    local_68 = EVP_PKEY_new();
    if (local_68 == (EVP_PKEY *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/p_lib.c",0x1bd,"new_raw_key_int");
      uVar6 = 0xc0100;
    }
    else {
      iVar3 = FUN_00a6d2f4(local_68,param_5,param_4,param_2,0xffffffff,0);
      if ((iVar3 == 0) || (lVar7 = *(long *)&local_68->references, lVar7 == 0)) goto LAB_00a6ce28;
      if (param_8 == 0) {
        if (*(code **)(lVar7 + 0x100) == (code *)0x0) {
          ERR_new();
          uVar6 = 0x1d5;
          goto LAB_00a6ce14;
        }
        iVar3 = (**(code **)(lVar7 + 0x100))(local_68,param_6,param_7);
        if (iVar3 != 0) goto LAB_00a6ce34;
        ERR_new();
        uVar6 = 0x1da;
      }
      else {
        if (*(code **)(lVar7 + 0xf8) == (code *)0x0) {
          ERR_new();
          uVar6 = 0x1cb;
LAB_00a6ce14:
          ERR_set_debug("crypto/evp/p_lib.c",uVar6,"new_raw_key_int");
          uVar6 = 0x96;
          goto LAB_00a6ce20;
        }
        iVar3 = (**(code **)(lVar7 + 0xf8))(local_68,param_6,param_7);
        if (iVar3 != 0) goto LAB_00a6ce34;
        ERR_new();
        uVar6 = 0x1d0;
      }
LAB_00a6cdc8:
      ERR_set_debug("crypto/evp/p_lib.c",uVar6,"new_raw_key_int");
      uVar6 = 0xb4;
    }
LAB_00a6ce20:
    ERR_set_error(6,uVar6,0);
  }
LAB_00a6ce28:
  EVP_PKEY_free(local_68);
  local_68 = (EVP_PKEY *)0x0;
LAB_00a6ce34:
  EVP_PKEY_CTX_free(ctx);
  return local_68;
}

