/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6a38
 */

bool tls13_generate_secret
               (long param_1,undefined8 param_2,long param_3,long param_4,undefined8 param_5,
               undefined8 param_6)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 local_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 local_190;
  undefined4 local_184;
  undefined8 local_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 local_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 uStack_140;
  undefined8 local_138;
  undefined8 local_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 local_110;
  undefined8 local_108 [21];
  
  local_184 = 1;
  uVar2 = EVP_MD_get0_name(param_2);
  uVar3 = EVP_KDF_fetch(**(undefined8 **)(param_1 + 0x9a8),"TLS13-KDF",
                        (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
  lVar4 = EVP_KDF_CTX_new();
  EVP_KDF_free(uVar3);
  if (lVar4 == 0) {
    ERR_new();
    ERR_set_debug("ssl/tls13_enc.c",0xb7,"tls13_generate_secret");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
  }
  else {
    iVar1 = EVP_MD_get_size(param_2);
    if (-1 < iVar1) {
      OSSL_PARAM_construct_int(&local_1b0,&DAT_002d7a76,&local_184);
      local_160 = local_190;
      uStack_178 = uStack_1a8;
      local_180 = local_1b0;
      uStack_168 = uStack_198;
      uStack_170 = uStack_1a0;
      puVar5 = &local_130;
      OSSL_PARAM_construct_utf8_string(&local_1b0,"digest",uVar2,0);
      local_138 = local_190;
      uStack_140 = uStack_198;
      local_148 = uStack_1a0;
      uStack_150 = uStack_1a8;
      local_158 = local_1b0;
      if (param_4 != 0) {
        puVar5 = local_108;
        OSSL_PARAM_construct_octet_string(&local_1b0,&DAT_0074ce1c,param_4,param_5);
        local_110 = local_190;
        uStack_128 = uStack_1a8;
        local_130 = local_1b0;
        uStack_118 = uStack_198;
        uStack_120 = uStack_1a0;
      }
      puVar6 = puVar5;
      if (param_3 != 0) {
        puVar6 = puVar5 + 5;
        OSSL_PARAM_construct_octet_string(&local_1b0,&DAT_002a7b6c,param_3,(long)iVar1);
        puVar5[4] = local_190;
        puVar5[1] = uStack_1a8;
        *puVar5 = local_1b0;
        puVar5[3] = uStack_198;
        puVar5[2] = uStack_1a0;
      }
      OSSL_PARAM_construct_octet_string(&local_1b0,"prefix","tls13 ",6);
      puVar6[4] = local_190;
      puVar6[1] = uStack_1a8;
      *puVar6 = local_1b0;
      puVar6[3] = uStack_198;
      puVar6[2] = uStack_1a0;
      OSSL_PARAM_construct_octet_string(&local_1b0,"label","derived",7);
      puVar6[9] = local_190;
      puVar6[8] = uStack_198;
      puVar6[7] = uStack_1a0;
      puVar6[6] = uStack_1a8;
      puVar6[5] = local_1b0;
      OSSL_PARAM_construct_end(&local_1b0);
      puVar6[0xe] = local_190;
      puVar6[0xb] = uStack_1a8;
      puVar6[10] = local_1b0;
      puVar6[0xd] = uStack_198;
      puVar6[0xc] = uStack_1a0;
      iVar1 = EVP_KDF_derive(lVar4,param_6,(long)iVar1,&local_180);
      if (iVar1 < 1) {
        ERR_new();
        ERR_set_debug("ssl/tls13_enc.c",0xd9,"tls13_generate_secret");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
      }
      EVP_KDF_CTX_free(lVar4);
      return 0 < iVar1;
    }
    ERR_new();
    ERR_set_debug("ssl/tls13_enc.c",0xbe,"tls13_generate_secret");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    EVP_KDF_CTX_free(lVar4);
  }
  return false;
}

