/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b228
 */

bool ossl_pkcs5_pbkdf2_hmac_ex
               (char *param_1,int param_2,undefined1 *param_3,int param_4,undefined4 param_5,
               undefined8 param_6,int param_7,undefined8 param_8,undefined8 param_9,
               undefined8 param_10)

{
  undefined1 *puVar1;
  int iVar2;
  undefined8 uVar3;
  size_t sVar4;
  long lVar5;
  long lVar6;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 local_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 local_150;
  undefined8 local_148;
  undefined8 uStack_140;
  undefined8 local_138;
  undefined8 uStack_130;
  undefined8 local_128;
  undefined8 local_120;
  undefined8 uStack_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined4 local_78;
  undefined4 auStack_74 [5];
  
  local_78 = 1;
  auStack_74[0] = param_5;
  uVar3 = EVP_MD_get0_name(param_6);
  if (param_1 == (char *)0x0) {
    param_2 = 0;
    param_1 = "";
  }
  else if (param_2 == -1) {
    sVar4 = strlen(param_1);
    param_2 = (int)sVar4;
  }
  puVar1 = &DAT_002ab32c;
  if (param_4 != 0 || param_3 != (undefined1 *)0x0) {
    puVar1 = param_3;
  }
  lVar5 = EVP_KDF_fetch(param_9,"PBKDF2",param_10);
  if (lVar5 != 0) {
    lVar6 = EVP_KDF_CTX_new();
    EVP_KDF_free(lVar5);
    if (lVar6 != 0) {
      OSSL_PARAM_construct_octet_string(&local_198,&DAT_002c3a6a,param_1,(long)param_2);
      local_150 = local_178;
      uStack_168 = uStack_190;
      local_170 = local_198;
      uStack_158 = uStack_180;
      uStack_160 = local_188;
      OSSL_PARAM_construct_int(&local_198,"pkcs5",&local_78);
      local_128 = local_178;
      uStack_130 = uStack_180;
      local_138 = local_188;
      uStack_140 = uStack_190;
      local_148 = local_198;
      OSSL_PARAM_construct_octet_string(&local_198,&DAT_002a7b6c,puVar1,(long)param_4);
      local_100 = local_178;
      uStack_108 = uStack_180;
      local_110 = local_188;
      uStack_118 = uStack_190;
      local_120 = local_198;
      OSSL_PARAM_construct_int(&local_198,&DAT_002ac172,auStack_74);
      local_d8 = local_178;
      uStack_e0 = uStack_180;
      local_e8 = local_188;
      uStack_f0 = uStack_190;
      local_f8 = local_198;
      OSSL_PARAM_construct_utf8_string(&local_198,"digest",uVar3,0);
      local_b0 = local_178;
      uStack_c8 = uStack_190;
      local_d0 = local_198;
      uStack_b8 = uStack_180;
      uStack_c0 = local_188;
      OSSL_PARAM_construct_end(&local_198);
      local_88 = local_178;
      uStack_90 = uStack_180;
      local_98 = local_188;
      uStack_a0 = uStack_190;
      local_a8 = local_198;
      iVar2 = EVP_KDF_derive(lVar6,param_8,(long)param_7,&local_170);
      EVP_KDF_CTX_free(lVar6);
      return iVar2 == 1;
    }
  }
  return false;
}

