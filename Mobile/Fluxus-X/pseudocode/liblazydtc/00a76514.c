/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a76514
 */

int FUN_00a76514(uint *param_1,long param_2,int param_3,uint param_4,undefined4 param_5)

{
  int iVar1;
  undefined1 *puVar2;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  
  if ((param_1 == (uint *)0x0) || ((*param_1 & param_4) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x3bd,"evp_pkey_ctx_set_md");
    ERR_set_error(6,0x93,0);
    return -2;
  }
  if (param_3 == 0) {
    if (param_2 == 0) {
      puVar2 = &DAT_002ab32c;
    }
    else {
      puVar2 = (undefined1 *)EVP_MD_get0_name(param_2);
    }
    OSSL_PARAM_construct_utf8_string(&local_b8,"digest",puVar2,0);
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
    iVar1 = EVP_PKEY_CTX_set_params(param_1,&local_90);
  }
  else {
    ERR_set_mark();
    iVar1 = FUN_00a772a4(param_1,0xffffffff,param_4,param_5,0,param_2,0);
    if (iVar1 == -2) {
      ERR_pop_to_mark();
    }
    else {
      ERR_clear_last_mark();
      if (iVar1 < 1) {
        return iVar1;
      }
      if (*param_1 == 0) {
        return iVar1;
      }
    }
    iVar1 = FUN_00a77554(param_1,0xffffffff,param_4,param_5,0,param_2);
  }
  return iVar1;
}

