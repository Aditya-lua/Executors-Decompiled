/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6aad4
 */

undefined8
PKCS5_PBE_keyivgen_ex
          (EVP_CIPHER_CTX *param_1,char *param_2,int param_3,int *param_4,EVP_CIPHER *param_5,
          undefined8 param_6,int param_7,undefined8 param_8,undefined8 param_9)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  PBEPARAM *a;
  size_t sVar7;
  uchar *puVar8;
  long lVar9;
  undefined8 local_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 local_1b0;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
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
  undefined4 local_fc;
  uchar auStack_f8 [16];
  uchar auStack_e8 [64];
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  
  uVar5 = EVP_MD_get0_name(param_6);
  if (((param_4 == (int *)0x0) || (*param_4 != 0x10)) || (*(long *)(param_4 + 2) == 0)) {
    ERR_new();
    uVar5 = 0x2f;
LAB_00a6aba0:
    ERR_set_debug("crypto/evp/p5_crpt.c",uVar5,"PKCS5_PBE_keyivgen_ex");
    ERR_set_error(6,0x72,0);
    return 0;
  }
  uVar6 = PBEPARAM_it();
  a = (PBEPARAM *)ASN1_TYPE_unpack_sequence(uVar6,param_4);
  if (a == (PBEPARAM *)0x0) {
    ERR_new();
    uVar5 = 0x35;
    goto LAB_00a6aba0;
  }
  uVar1 = EVP_CIPHER_get_iv_length(param_5);
  if (uVar1 < 0x11) {
    uVar2 = EVP_CIPHER_get_key_length(param_5);
    if (0x40 < uVar2) {
      ERR_new();
      ERR_set_debug("crypto/evp/p5_crpt.c",0x40,"PKCS5_PBE_keyivgen_ex");
      uVar5 = 0x82;
      goto LAB_00a6ac30;
    }
    if (a->iter == (ASN1_INTEGER *)0x0) {
      local_fc = 1;
    }
    else {
      lVar9 = ASN1_INTEGER_get(a->iter);
      local_fc = (undefined4)lVar9;
    }
    puVar8 = a->salt->data;
    iVar4 = a->salt->length;
    if (param_2 == (char *)0x0) {
      param_3 = 0;
    }
    else if (param_3 == -1) {
      sVar7 = strlen(param_2);
      param_3 = (int)sVar7;
    }
    iVar3 = EVP_MD_get_size(param_6);
    if (-1 < iVar3) {
      uVar6 = EVP_KDF_fetch(param_8,"PBKDF1",param_9);
      lVar9 = EVP_KDF_CTX_new();
      EVP_KDF_free(uVar6);
      if (lVar9 != 0) {
        OSSL_PARAM_construct_octet_string(&local_a8,&DAT_002c3a6a,param_2,(long)param_3);
        local_1b0 = local_88;
        uStack_1c8 = uStack_a0;
        local_1d0 = local_a8;
        uStack_1b8 = uStack_90;
        uStack_1c0 = local_98;
        OSSL_PARAM_construct_octet_string(&local_a8,&DAT_002a7b6c,puVar8,(long)iVar4);
        local_188 = local_88;
        uStack_190 = uStack_90;
        local_198 = local_98;
        uStack_1a0 = uStack_a0;
        local_1a8 = local_a8;
        OSSL_PARAM_construct_int(&local_a8,&DAT_002ac172,&local_fc);
        local_160 = local_88;
        uStack_178 = uStack_a0;
        local_180 = local_a8;
        uStack_168 = uStack_90;
        uStack_170 = local_98;
        OSSL_PARAM_construct_utf8_string(&local_a8,"digest",uVar5,0);
        local_138 = local_88;
        uStack_140 = uStack_90;
        local_148 = local_98;
        uStack_150 = uStack_a0;
        local_158 = local_a8;
        OSSL_PARAM_construct_end(&local_a8);
        local_110 = local_88;
        uStack_128 = uStack_a0;
        local_130 = local_a8;
        uStack_118 = uStack_90;
        uStack_120 = local_98;
        iVar4 = EVP_KDF_derive(lVar9,&local_a8,(long)iVar3,&local_1d0);
        if (iVar4 == 1) {
          memcpy(auStack_e8,&local_a8,(long)(int)uVar2);
          memcpy(auStack_f8,(void *)((long)&local_98 - (long)(int)uVar1),(long)(int)uVar1);
          iVar4 = EVP_CipherInit_ex(param_1,param_5,(ENGINE *)0x0,auStack_e8,auStack_f8,param_7);
          if (iVar4 != 0) {
            OPENSSL_cleanse(&local_a8,0x40);
            OPENSSL_cleanse(auStack_e8,0x40);
            OPENSSL_cleanse(auStack_f8,0x10);
            uVar5 = 1;
            goto LAB_00a6ac40;
          }
        }
      }
      uVar5 = 0;
      goto LAB_00a6ac40;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p5_crpt.c",0x3b,"PKCS5_PBE_keyivgen_ex");
    uVar5 = 0xc2;
LAB_00a6ac30:
    ERR_set_error(6,uVar5,0);
  }
  uVar5 = 0;
  lVar9 = 0;
LAB_00a6ac40:
  EVP_KDF_CTX_free(lVar9);
  PBEPARAM_free(a);
  return uVar5;
}

