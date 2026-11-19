/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0598
 */

undefined8
FUN_009c0598(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
            undefined8 param_9,undefined8 param_10,undefined8 param_11,undefined8 param_12,
            undefined8 param_13,int param_14)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 local_1d8;
  undefined8 uStack_1d0;
  undefined8 local_1c8;
  undefined8 uStack_1c0;
  undefined8 local_1b8;
  undefined8 local_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 local_190;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  undefined8 local_160;
  undefined8 uStack_158;
  undefined8 local_150;
  undefined8 uStack_148;
  undefined8 local_140;
  undefined8 local_138;
  undefined8 uStack_130;
  undefined8 local_128;
  undefined8 uStack_120;
  undefined8 local_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
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
  
  lVar2 = ssl_prf_md();
  if (lVar2 == 0) {
    ERR_new();
    if (param_14 == 0) {
      ERR_set_debug("ssl/t1_enc.c",0x2d,"tls1_PRF");
      ERR_set_error(0x14,0xc0103,0);
    }
    else {
      ERR_set_debug("ssl/t1_enc.c",0x2b,"tls1_PRF");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
    }
  }
  else {
    lVar3 = EVP_KDF_fetch(**(undefined8 **)(param_1 + 0x9a8),"TLS1-PRF",
                          (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
    if (lVar3 == 0) {
      lVar4 = 0;
    }
    else {
      lVar4 = EVP_KDF_CTX_new();
      EVP_KDF_free(lVar3);
      if (lVar4 != 0) {
        uVar5 = EVP_MD_get0_name(lVar2);
        OSSL_PARAM_construct_utf8_string(&local_1d8,"digest",uVar5,0);
        local_190 = local_1b8;
        uStack_1a8 = uStack_1d0;
        local_1b0 = local_1d8;
        uStack_198 = uStack_1c0;
        uStack_1a0 = local_1c8;
        OSSL_PARAM_construct_octet_string(&local_1d8,"secret",param_10,param_11);
        local_168 = local_1b8;
        uStack_170 = uStack_1c0;
        local_178 = local_1c8;
        uStack_180 = uStack_1d0;
        local_188 = local_1d8;
        OSSL_PARAM_construct_octet_string(&local_1d8,&DAT_002bb864,param_2,param_3);
        local_140 = local_1b8;
        uStack_148 = uStack_1c0;
        local_150 = local_1c8;
        uStack_158 = uStack_1d0;
        local_160 = local_1d8;
        OSSL_PARAM_construct_octet_string(&local_1d8,&DAT_002bb864,param_4,param_5);
        local_118 = local_1b8;
        uStack_120 = uStack_1c0;
        local_128 = local_1c8;
        uStack_130 = uStack_1d0;
        local_138 = local_1d8;
        OSSL_PARAM_construct_octet_string(&local_1d8,&DAT_002bb864,param_6,param_7);
        local_f0 = local_1b8;
        uStack_108 = uStack_1d0;
        local_110 = local_1d8;
        uStack_f8 = uStack_1c0;
        uStack_100 = local_1c8;
        OSSL_PARAM_construct_octet_string(&local_1d8,&DAT_002bb864,param_8,param_9);
        local_c8 = local_1b8;
        uStack_d0 = uStack_1c0;
        local_d8 = local_1c8;
        uStack_e0 = uStack_1d0;
        local_e8 = local_1d8;
        OSSL_PARAM_construct_octet_string(&local_1d8,&DAT_002bb864,0,0);
        local_a0 = local_1b8;
        uStack_b8 = uStack_1d0;
        local_c0 = local_1d8;
        uStack_a8 = uStack_1c0;
        uStack_b0 = local_1c8;
        OSSL_PARAM_construct_end(&local_1d8);
        uStack_80 = uStack_1c0;
        local_88 = local_1c8;
        uStack_90 = uStack_1d0;
        local_98 = local_1d8;
        local_78 = local_1b8;
        iVar1 = EVP_KDF_derive(lVar4,param_12,param_13,&local_1b0);
        if (iVar1 != 0) {
          EVP_KDF_CTX_free(lVar4);
          return 1;
        }
      }
    }
    ERR_new();
    if (param_14 == 0) {
      ERR_set_debug("ssl/t1_enc.c",0x51,"tls1_PRF");
      ERR_set_error(0x14,0xc0103,0);
    }
    else {
      ERR_set_debug("ssl/t1_enc.c",0x4f,"tls1_PRF");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
    }
    EVP_KDF_CTX_free(lVar4);
  }
  return 0;
}

