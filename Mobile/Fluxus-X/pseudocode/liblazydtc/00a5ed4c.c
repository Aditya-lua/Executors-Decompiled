/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5ed4c
 */

bool evp_cipher_cache_constants(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  undefined8 local_228;
  undefined8 uStack_220;
  undefined8 local_218;
  undefined8 uStack_210;
  undefined8 local_208;
  undefined8 local_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 local_1e0;
  undefined8 local_1d8;
  undefined8 uStack_1d0;
  undefined8 local_1c8;
  undefined8 uStack_1c0;
  undefined8 local_1b8;
  undefined8 local_1b0;
  undefined8 uStack_1a8;
  undefined8 local_1a0;
  undefined8 uStack_198;
  undefined8 local_190;
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
  uint local_64;
  undefined8 local_60;
  undefined8 local_58;
  undefined8 local_50;
  int local_44;
  undefined8 local_40;
  undefined8 local_38;
  
  local_40 = 0;
  local_38 = 0;
  local_44 = 0;
  local_58 = 0;
  local_50 = 0;
  local_60 = 0;
  local_64 = 0;
  OSSL_PARAM_construct_size_t(&local_228,"blocksize",&local_58);
  local_1e0 = local_208;
  uStack_1f8 = uStack_220;
  local_200 = local_228;
  uStack_1e8 = uStack_210;
  uStack_1f0 = local_218;
  OSSL_PARAM_construct_size_t(&local_228,"ivlen",&local_50);
  local_1b8 = local_208;
  uStack_1c0 = uStack_210;
  local_1c8 = local_218;
  uStack_1d0 = uStack_220;
  local_1d8 = local_228;
  OSSL_PARAM_construct_size_t(&local_228,"keylen",&local_60);
  local_190 = local_208;
  uStack_198 = uStack_210;
  local_1a0 = local_218;
  uStack_1a8 = uStack_220;
  local_1b0 = local_228;
  OSSL_PARAM_construct_uint(&local_228,&DAT_002d7a76,&local_64);
  local_168 = local_208;
  uStack_170 = uStack_210;
  local_178 = local_218;
  uStack_180 = uStack_220;
  local_188 = local_228;
  OSSL_PARAM_construct_int(&local_228,&DAT_002c9959,(long)&local_38 + 4);
  local_140 = local_208;
  uStack_158 = uStack_220;
  local_160 = local_228;
  uStack_148 = uStack_210;
  uStack_150 = local_218;
  OSSL_PARAM_construct_int(&local_228,"custom-iv",&local_38);
  local_118 = local_208;
  uStack_120 = uStack_210;
  local_128 = local_218;
  uStack_130 = uStack_220;
  local_138 = local_228;
  OSSL_PARAM_construct_int(&local_228,&DAT_002c5a92,(long)&local_40 + 4);
  local_f0 = local_208;
  uStack_108 = uStack_220;
  local_110 = local_228;
  uStack_f8 = uStack_210;
  uStack_100 = local_218;
  OSSL_PARAM_construct_int(&local_228,"tls-multi",&local_40);
  local_c8 = local_208;
  uStack_d0 = uStack_210;
  local_d8 = local_218;
  uStack_e0 = uStack_220;
  local_e8 = local_228;
  OSSL_PARAM_construct_int(&local_228,"has-randkey",&local_44);
  local_a0 = local_208;
  uStack_b8 = uStack_220;
  local_c0 = local_228;
  uStack_a8 = uStack_210;
  uStack_b0 = local_218;
  OSSL_PARAM_construct_end(&local_228);
  uStack_80 = uStack_210;
  local_88 = local_218;
  uStack_90 = uStack_220;
  local_98 = local_228;
  local_78 = local_208;
  iVar1 = evp_do_ciph_getparams(param_1,&local_200);
  if (0 < iVar1) {
    *(int *)(param_1 + 4) = (int)local_58;
    *(int *)(param_1 + 0xc) = (int)local_50;
    *(int *)(param_1 + 8) = (int)local_60;
    uVar4 = (ulong)local_64;
    *(ulong *)(param_1 + 0x10) = uVar4;
    if (local_38._4_4_ != 0) {
      uVar4 = uVar4 | 0x200000;
      *(ulong *)(param_1 + 0x10) = uVar4;
    }
    if ((int)local_38 != 0) {
      uVar4 = uVar4 | 0x10;
      *(ulong *)(param_1 + 0x10) = uVar4;
    }
    if (local_40._4_4_ != 0) {
      uVar4 = uVar4 | 0x4000;
      *(ulong *)(param_1 + 0x10) = uVar4;
    }
    if ((int)local_40 != 0) {
      uVar4 = uVar4 | 0x400000;
      *(ulong *)(param_1 + 0x10) = uVar4;
    }
    if (*(long *)(param_1 + 0xb8) != 0) {
      uVar4 = uVar4 | 0x100000;
      *(ulong *)(param_1 + 0x10) = uVar4;
    }
    if (local_44 != 0) {
      *(ulong *)(param_1 + 0x10) = uVar4 | 0x200;
    }
    uVar2 = EVP_CIPHER_gettable_ctx_params(param_1);
    lVar3 = OSSL_PARAM_locate_const(uVar2,"alg_id_param");
    if (lVar3 != 0) {
      *(ulong *)(param_1 + 0x10) = *(ulong *)(param_1 + 0x10) | 0x1000000;
    }
  }
  return 0 < iVar1;
}

