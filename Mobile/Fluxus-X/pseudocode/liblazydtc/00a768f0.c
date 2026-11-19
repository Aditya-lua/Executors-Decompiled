/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a768f0
 */

undefined4 EVP_PKEY_CTX_add1_hkdf_info(long param_1,void *param_2,int param_3)

{
  long lVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  long lVar5;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  long local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  if ((param_1 == 0) || ((*(byte *)(param_1 + 1) >> 3 & 1) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x413,"evp_pkey_ctx_add1_octet_string");
    ERR_set_error(6,0x93,0);
    uVar4 = 0xfffffffe;
  }
  else if (*(long *)(param_1 + 0x30) == 0) {
    iVar3 = ERR_set_mark();
    ERR_new(iVar3);
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x5f6,"evp_pkey_ctx_store_cached_data");
    ERR_set_error(6,0x93,0);
    ERR_pop_to_mark();
    uVar4 = FUN_00a77554(param_1,0xffffffff,0x800,0x1006,param_3,param_2);
  }
  else if (param_3 < 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x41e,"evp_pkey_ctx_add1_octet_string");
    ERR_set_error(6,0xdd,0);
    uVar4 = 0;
  }
  else if (param_3 == 0) {
    uVar4 = 1;
  }
  else {
    OSSL_PARAM_construct_octet_string(&local_b8,&DAT_0029e225,0,0);
    local_70 = local_98;
    uStack_88 = uStack_b0;
    local_90 = local_b8;
    uStack_78 = uStack_a0;
    uStack_80 = local_a8;
    OSSL_PARAM_construct_end(&local_b8);
    local_48 = local_98;
    uStack_50 = uStack_a0;
    local_58 = local_a8;
    uStack_60 = uStack_b0;
    local_68 = local_b8;
    iVar3 = EVP_PKEY_CTX_get_params(param_1,&local_90);
    if (iVar3 != 0) {
      if (local_70 == -1) {
        uVar4 = FUN_00a766c4(param_1,0,&DAT_0029e225,0x800,0x1006,param_2,param_3);
        return uVar4;
      }
      lVar1 = local_70 + param_3;
      if ((lVar1 != 0) &&
         (lVar5 = CRYPTO_zalloc(lVar1,"crypto/evp/pmeth_lib.c",0x432), lVar2 = local_70, lVar5 != 0)
         ) {
        OSSL_PARAM_construct_octet_string(&local_b8,&DAT_0029e225,lVar5,lVar1);
        local_70 = local_98;
        uStack_88 = uStack_b0;
        local_90 = local_b8;
        uStack_78 = uStack_a0;
        uStack_80 = local_a8;
        if ((lVar2 == 0) || (iVar3 = EVP_PKEY_CTX_get_params(param_1,&local_90), iVar3 != 0)) {
          memcpy((void *)(lVar5 + lVar2),param_2,(long)param_3);
          uVar4 = EVP_PKEY_CTX_set_params(param_1,&local_90);
        }
        else {
          uVar4 = 0;
        }
        CRYPTO_clear_free(lVar5,lVar1,"crypto/evp/pmeth_lib.c",0x444);
        return uVar4;
      }
    }
    uVar4 = 0;
  }
  return uVar4;
}

