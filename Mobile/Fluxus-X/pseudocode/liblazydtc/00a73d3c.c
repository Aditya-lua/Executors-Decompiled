/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a73d3c
 */

bool EVP_PBE_scrypt_ex(undefined1 *param_1,undefined8 param_2,undefined1 *param_3,undefined8 param_4
                      ,undefined8 param_5,ulong param_6,ulong param_7,long param_8,
                      undefined8 param_9,undefined8 param_10,undefined8 param_11,undefined8 param_12
                      )

{
  undefined8 uVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 local_1c8;
  undefined8 uStack_1c0;
  undefined8 local_1b8;
  undefined8 uStack_1b0;
  undefined8 local_1a8;
  undefined8 local_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 local_180;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 local_150;
  undefined8 uStack_148;
  undefined8 local_140;
  undefined8 uStack_138;
  undefined8 local_130;
  undefined8 local_128;
  undefined8 uStack_120;
  undefined8 local_118;
  undefined8 uStack_110;
  undefined8 local_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
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
  long local_80;
  ulong uStack_78;
  ulong local_70;
  undefined8 uStack_68;
  
  local_80 = param_8;
  uStack_78 = param_7;
  local_70 = param_6;
  uStack_68 = param_5;
  if ((param_7 | param_6) >> 0x20 == 0) {
    uVar1 = 0;
    if (param_1 != (undefined1 *)0x0) {
      uVar1 = param_2;
    }
    puVar2 = &DAT_002ab32c;
    if (param_1 != (undefined1 *)0x0) {
      puVar2 = param_1;
    }
    uVar3 = 0;
    if (param_3 != (undefined1 *)0x0) {
      uVar3 = param_4;
    }
    puVar4 = &DAT_002ab32c;
    if (param_3 != (undefined1 *)0x0) {
      puVar4 = param_3;
    }
    if (param_8 == 0) {
      local_80 = 0x2000000;
    }
    uVar6 = EVP_KDF_fetch(param_11,"SCRYPT",param_12);
    lVar7 = EVP_KDF_CTX_new();
    EVP_KDF_free(uVar6);
    if (lVar7 != 0) {
      OSSL_PARAM_construct_octet_string(&local_1c8,&DAT_002c3a6a,puVar2,uVar1);
      local_180 = local_1a8;
      uStack_198 = uStack_1c0;
      local_1a0 = local_1c8;
      uStack_188 = uStack_1b0;
      uStack_190 = local_1b8;
      OSSL_PARAM_construct_octet_string(&local_1c8,&DAT_002a7b6c,puVar4,uVar3);
      local_158 = local_1a8;
      uStack_160 = uStack_1b0;
      local_168 = local_1b8;
      uStack_170 = uStack_1c0;
      local_178 = local_1c8;
      OSSL_PARAM_construct_uint64(&local_1c8,&DAT_002a5623,&uStack_68);
      local_130 = local_1a8;
      uStack_138 = uStack_1b0;
      local_140 = local_1b8;
      uStack_148 = uStack_1c0;
      local_150 = local_1c8;
      OSSL_PARAM_construct_uint64(&local_1c8,&DAT_002c8cc8,&local_70);
      local_108 = local_1a8;
      uStack_110 = uStack_1b0;
      local_118 = local_1b8;
      uStack_120 = uStack_1c0;
      local_128 = local_1c8;
      OSSL_PARAM_construct_uint64(&local_1c8,&DAT_002a38e7,&uStack_78);
      local_e0 = local_1a8;
      uStack_f8 = uStack_1c0;
      local_100 = local_1c8;
      uStack_e8 = uStack_1b0;
      uStack_f0 = local_1b8;
      OSSL_PARAM_construct_uint64(&local_1c8,"maxmem_bytes",&local_80);
      local_b8 = local_1a8;
      uStack_c0 = uStack_1b0;
      local_c8 = local_1b8;
      uStack_d0 = uStack_1c0;
      local_d8 = local_1c8;
      OSSL_PARAM_construct_end(&local_1c8);
      local_90 = local_1a8;
      uStack_a8 = uStack_1c0;
      local_b0 = local_1c8;
      uStack_98 = uStack_1b0;
      uStack_a0 = local_1b8;
      iVar5 = EVP_KDF_derive(lVar7,param_9,param_10,&local_1a0);
      EVP_KDF_CTX_free(lVar7);
      return iVar5 == 1;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/pbe_scrypt.c",0x32,"EVP_PBE_scrypt_ex");
    ERR_set_error(6,0xbb,0);
  }
  return false;
}

