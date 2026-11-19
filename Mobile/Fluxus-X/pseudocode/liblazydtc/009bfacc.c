/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bfacc
 */

bool tls_provider_set_tls_params
               (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  int iVar2;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  long local_28;
  
  local_28 = 0;
  uVar1 = EVP_CIPHER_get_flags(param_3);
  if ((((uVar1 >> 0x15 & 1) == 0) && (*(int *)(param_1 + 0xb2c) == 0)) &&
     (iVar2 = EVP_MD_get_size(param_4), -1 < iVar2)) {
    local_28 = (long)iVar2;
  }
  OSSL_PARAM_construct_int(&local_d8,"tls-version",param_1);
  local_90 = local_b8;
  uStack_a8 = uStack_d0;
  local_b0 = local_d8;
  uStack_98 = uStack_c0;
  uStack_a0 = local_c8;
  OSSL_PARAM_construct_size_t(&local_d8,"tls-mac-size",&local_28);
  local_68 = local_b8;
  uStack_70 = uStack_c0;
  local_78 = local_c8;
  uStack_80 = uStack_d0;
  local_88 = local_d8;
  OSSL_PARAM_construct_end(&local_d8);
  local_40 = local_b8;
  uStack_58 = uStack_d0;
  local_60 = local_d8;
  uStack_48 = uStack_c0;
  uStack_50 = local_c8;
  iVar2 = EVP_CIPHER_CTX_set_params(param_2,&local_b0);
  if (iVar2 == 0) {
    ERR_new();
    ERR_set_debug("ssl/t1_enc.c",0xa7,"tls_provider_set_tls_params");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
  }
  return iVar2 != 0;
}

