/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6600
 */

bool tls13_hkdf_expand(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                      ulong param_5,long param_6,undefined8 param_7,undefined8 param_8,
                      undefined8 param_9,int param_10)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 local_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 local_1a0;
  undefined4 local_194;
  undefined8 local_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 local_170;
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 local_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 local_120;
  undefined8 local_118;
  undefined8 uStack_110;
  undefined8 local_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 local_a0 [8];
  
  uVar3 = EVP_KDF_fetch(**(undefined8 **)(param_1 + 0x9a8),"TLS13-KDF",
                        (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
  local_194 = 2;
  uVar4 = EVP_MD_get0_name(param_2);
  lVar5 = EVP_KDF_CTX_new(uVar3);
  EVP_KDF_free(uVar3);
  if (lVar5 == 0) {
    bVar1 = false;
  }
  else if (param_5 < 0xfa) {
    iVar2 = EVP_MD_get_size(param_2);
    if (iVar2 < 1) {
      EVP_KDF_CTX_free(lVar5);
      ERR_new();
      if (param_10 == 0) {
        ERR_set_debug("ssl/tls13_enc.c",0x48,"tls13_hkdf_expand");
        ERR_set_error(0x14,0xc0103,0);
        bVar1 = false;
      }
      else {
        ERR_set_debug("ssl/tls13_enc.c",0x46,"tls13_hkdf_expand");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
        bVar1 = false;
      }
    }
    else {
      OSSL_PARAM_construct_int(&local_1c0,&DAT_002d7a76,&local_194);
      local_170 = local_1a0;
      uStack_188 = uStack_1b8;
      local_190 = local_1c0;
      uStack_178 = uStack_1a8;
      uStack_180 = uStack_1b0;
      OSSL_PARAM_construct_utf8_string(&local_1c0,"digest",uVar4,0);
      local_148 = local_1a0;
      uStack_150 = uStack_1a8;
      local_158 = uStack_1b0;
      uStack_160 = uStack_1b8;
      local_168 = local_1c0;
      OSSL_PARAM_construct_octet_string(&local_1c0,&DAT_0074ce1c,param_3,(long)iVar2);
      local_120 = local_1a0;
      uStack_138 = uStack_1b8;
      local_140 = local_1c0;
      uStack_128 = uStack_1a8;
      uStack_130 = uStack_1b0;
      OSSL_PARAM_construct_octet_string(&local_1c0,"prefix","tls13 ",6);
      local_f8 = local_1a0;
      uStack_100 = uStack_1a8;
      local_108 = uStack_1b0;
      uStack_110 = uStack_1b8;
      local_118 = local_1c0;
      puVar6 = &local_c8;
      OSSL_PARAM_construct_octet_string(&local_1c0,"label",param_4,param_5);
      local_d0 = local_1a0;
      uStack_e8 = uStack_1b8;
      local_f0 = local_1c0;
      uStack_d8 = uStack_1a8;
      uStack_e0 = uStack_1b0;
      if (param_6 != 0) {
        puVar6 = local_a0;
        OSSL_PARAM_construct_octet_string(&local_1c0,&DAT_002d167a,param_6,param_7);
        local_a8 = local_1a0;
        uStack_c0 = uStack_1b8;
        local_c8 = local_1c0;
        uStack_b0 = uStack_1a8;
        uStack_b8 = uStack_1b0;
      }
      OSSL_PARAM_construct_end(&local_1c0);
      puVar6[4] = local_1a0;
      puVar6[1] = uStack_1b8;
      *puVar6 = local_1c0;
      puVar6[3] = uStack_1a8;
      puVar6[2] = uStack_1b0;
      iVar2 = EVP_KDF_derive(lVar5,param_8,param_9,&local_190);
      EVP_KDF_CTX_free(lVar5);
      if (iVar2 < 1) {
        ERR_new();
        if (param_10 == 0) {
          ERR_set_debug("ssl/tls13_enc.c",100,"tls13_hkdf_expand");
          ERR_set_error(0x14,0xc0103,0);
        }
        else {
          ERR_set_debug("ssl/tls13_enc.c",0x62,"tls13_hkdf_expand");
          ossl_statem_fatal(param_1,0x50,0xc0103,0);
        }
      }
      bVar1 = 0 < iVar2;
    }
  }
  else {
    ERR_new();
    if (param_10 == 0) {
      ERR_set_debug("ssl/tls13_enc.c",0x3d,"tls13_hkdf_expand");
      ERR_set_error(0x14,0x16f,0);
    }
    else {
      ERR_set_debug("ssl/tls13_enc.c",0x37,"tls13_hkdf_expand");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
    }
    EVP_KDF_CTX_free(lVar5);
    bVar1 = false;
  }
  return bVar1;
}

