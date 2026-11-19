/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2770
 */

undefined8
FUN_00ad2770(uint *param_1,int param_2,uint param_3,undefined8 param_4,long param_5,
            undefined8 param_6)

{
  int iVar1;
  char *pcVar2;
  undefined8 uVar3;
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
  
  if (((param_1 == (uint *)0x0) || (param_5 == 0)) || ((*param_1 & param_3) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_lib.c",0x3a4,"int_get_rsa_md_name");
    ERR_set_error(6,0x93,0);
    return 0xfffffffe;
  }
  if (param_2 == -1) {
    iVar1 = EVP_PKEY_CTX_is_a(param_1,&DAT_002db996);
    if (iVar1 != 0) goto LAB_00ad2818;
    pcVar2 = "RSA-PSS";
  }
  else {
    pcVar2 = (char *)evp_pkey_type2name(param_2);
  }
  iVar1 = EVP_PKEY_CTX_is_a(param_1,pcVar2);
  if (iVar1 == 0) {
    return 0xffffffff;
  }
LAB_00ad2818:
  OSSL_PARAM_construct_utf8_string(&local_a8,param_4,param_5,param_6);
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
  uVar3 = evp_pkey_ctx_get_params_strict(param_1,&local_80);
  return uVar3;
}

