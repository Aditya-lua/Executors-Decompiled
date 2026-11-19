/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a76b5c
 */

undefined8 EVP_PKEY_CTX_set_hkdf_mode(int *param_1,int param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  int local_24;
  
  local_24 = param_2;
  if ((param_1 == (int *)0x0) || (*param_1 != 0x800)) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x486,"EVP_PKEY_CTX_set_hkdf_mode");
    ERR_set_error(6,0x93,0);
    uVar2 = 0xfffffffe;
  }
  else if (*(long *)(param_1 + 0xc) == 0) {
    iVar1 = ERR_set_mark();
    ERR_new(iVar1);
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x5f6,"evp_pkey_ctx_store_cached_data");
    ERR_set_error(6,0x93,0);
    ERR_pop_to_mark();
    uVar2 = FUN_00a77554(param_1,0xffffffff,0x800,0x1007,param_2,0);
  }
  else if (param_2 < 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x492,"EVP_PKEY_CTX_set_hkdf_mode");
    ERR_set_error(6,0xde,0);
    uVar2 = 0;
  }
  else {
    OSSL_PARAM_construct_int(&local_a8,&DAT_002d7a76,&local_24);
    local_60 = local_88;
    uStack_78 = uStack_a0;
    local_80 = local_a8;
    uStack_68 = uStack_90;
    uStack_70 = local_98;
    OSSL_PARAM_construct_end(&local_a8);
    local_38 = local_88;
    uStack_40 = uStack_90;
    local_48 = local_98;
    uStack_50 = uStack_a0;
    local_58 = local_a8;
    uVar2 = EVP_PKEY_CTX_set_params(param_1,&local_80);
  }
  return uVar2;
}

