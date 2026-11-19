/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a56dc8
 */

undefined8 EVP_PKEY_CTX_set_dh_pad(int *param_1,undefined4 param_2)

{
  undefined8 uVar1;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  undefined4 local_14;
  
  local_14 = param_2;
  if ((param_1 == (int *)0x0) || (*param_1 != 0x800)) {
    ERR_new();
    ERR_set_debug("crypto/evp/dh_ctrl.c",0xa6,"EVP_PKEY_CTX_set_dh_pad");
    ERR_set_error(6,0x93,0);
    uVar1 = 0xfffffffe;
  }
  else {
    OSSL_PARAM_construct_uint(&local_98,&DAT_002d7e5c,&local_14);
    local_50 = local_78;
    uStack_68 = uStack_90;
    local_70 = local_98;
    uStack_58 = uStack_80;
    uStack_60 = local_88;
    OSSL_PARAM_construct_end(&local_98);
    local_28 = local_78;
    uStack_30 = uStack_80;
    local_38 = local_88;
    uStack_40 = uStack_90;
    local_48 = local_98;
    uVar1 = evp_pkey_ctx_set_params_strict(param_1,&local_70);
  }
  return uVar1;
}

