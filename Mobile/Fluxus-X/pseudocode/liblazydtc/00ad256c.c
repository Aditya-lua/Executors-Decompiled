/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad256c
 */

undefined8
FUN_00ad256c(uint *param_1,int param_2,uint param_3,undefined8 param_4,long param_5,
            undefined8 param_6,long param_7)

{
  int iVar1;
  char *pcVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70 [6];
  
  if (((param_1 == (uint *)0x0) || (param_5 == 0)) || ((*param_1 & param_3) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_lib.c",0x37c,"int_set_rsa_md_name");
    ERR_set_error(6,0x93,0);
    return 0xfffffffe;
  }
  if (param_2 == -1) {
    iVar1 = EVP_PKEY_CTX_is_a(param_1,&DAT_002db996);
    if (iVar1 != 0) goto LAB_00ad261c;
    pcVar2 = "RSA-PSS";
  }
  else {
    pcVar2 = (char *)evp_pkey_type2name(param_2);
  }
  iVar1 = EVP_PKEY_CTX_is_a(param_1,pcVar2);
  if (iVar1 == 0) {
    return 0xffffffff;
  }
LAB_00ad261c:
  puVar4 = &local_98;
  OSSL_PARAM_construct_utf8_string(&local_e8,param_4,param_5,0);
  local_a0 = local_c8;
  uStack_b8 = uStack_e0;
  local_c0 = local_e8;
  uStack_a8 = uStack_d0;
  uStack_b0 = local_d8;
  if ((param_7 != 0) && (*(long *)(param_1 + 8) != 0)) {
    puVar4 = local_70;
    OSSL_PARAM_construct_utf8_string(&local_e8,param_6,param_7,0);
    local_78 = local_c8;
    uStack_90 = uStack_e0;
    local_98 = local_e8;
    uStack_80 = uStack_d0;
    uStack_88 = local_d8;
  }
  OSSL_PARAM_construct_end(&local_e8);
  puVar4[4] = local_c8;
  puVar4[1] = uStack_e0;
  *puVar4 = local_e8;
  puVar4[3] = uStack_d0;
  puVar4[2] = local_d8;
  uVar3 = evp_pkey_ctx_set_params_strict(param_1,&local_c0);
  return uVar3;
}

