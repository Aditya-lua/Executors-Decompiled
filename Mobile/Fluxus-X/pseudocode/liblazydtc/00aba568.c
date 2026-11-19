/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba568
 */

bool PKCS12_key_gen_uni_ex
               (undefined8 param_1,int param_2,undefined8 param_3,int param_4,undefined4 param_5,
               undefined4 param_6,int param_7,undefined8 param_8,undefined8 param_9,
               undefined8 param_10,undefined8 param_11)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  undefined8 local_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 local_140;
  undefined8 local_138;
  undefined8 uStack_130;
  undefined8 local_128;
  undefined8 uStack_120;
  undefined8 local_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
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
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined4 local_68;
  undefined4 uStack_64;
  
  if ((0 < param_7) &&
     (local_68 = param_6, uStack_64 = param_5, lVar2 = EVP_KDF_fetch(param_10,"PKCS12KDF",param_11),
     lVar2 != 0)) {
    lVar3 = EVP_KDF_CTX_new();
    EVP_KDF_free(lVar2);
    if (lVar3 != 0) {
      uVar4 = EVP_MD_get0_name(param_9);
      OSSL_PARAM_construct_utf8_string(&local_188,"digest",uVar4,0);
      local_140 = local_168;
      uStack_158 = uStack_180;
      local_160 = local_188;
      uStack_148 = uStack_170;
      uStack_150 = local_178;
      OSSL_PARAM_construct_octet_string(&local_188,&DAT_002c3a6a,param_1,(long)param_2);
      local_118 = local_168;
      uStack_120 = uStack_170;
      local_128 = local_178;
      uStack_130 = uStack_180;
      local_138 = local_188;
      OSSL_PARAM_construct_octet_string(&local_188,&DAT_002a7b6c,param_3,(long)param_4);
      local_f0 = local_168;
      uStack_f8 = uStack_170;
      local_100 = local_178;
      uStack_108 = uStack_180;
      local_110 = local_188;
      OSSL_PARAM_construct_int(&local_188,&DAT_002be1ea,&uStack_64);
      local_c8 = local_168;
      uStack_d0 = uStack_170;
      local_d8 = local_178;
      uStack_e0 = uStack_180;
      local_e8 = local_188;
      OSSL_PARAM_construct_int(&local_188,&DAT_002ac172,&local_68);
      local_a0 = local_168;
      uStack_b8 = uStack_180;
      local_c0 = local_188;
      uStack_a8 = uStack_170;
      uStack_b0 = local_178;
      OSSL_PARAM_construct_end(&local_188);
      local_78 = local_168;
      uStack_80 = uStack_170;
      local_88 = local_178;
      uStack_90 = uStack_180;
      local_98 = local_188;
      iVar1 = EVP_KDF_derive(lVar3,param_8,(long)param_7,&local_160);
      EVP_KDF_CTX_free(lVar3);
      return iVar1 != 0;
    }
  }
  return false;
}

