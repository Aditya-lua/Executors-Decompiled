/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac871c
 */

long FUN_00ac871c(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4)

{
  char *pcVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
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
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 local_118;
  undefined8 local_110 [25];
  undefined8 local_48;
  undefined4 local_34;
  
  local_48 = param_4;
  local_34 = param_3;
  lVar3 = ossl_lib_ctx_get_data(param_1,5,&DAT_00c7ca38);
  if (lVar3 != 0) {
    pcVar1 = "CTR-DRBG";
    if (*(char **)(lVar3 + 0x20) != (char *)0x0) {
      pcVar1 = *(char **)(lVar3 + 0x20);
    }
    lVar4 = EVP_RAND_fetch(param_1,pcVar1,*(undefined8 *)(lVar3 + 0x38));
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("crypto/rand/rand_lib.c",0x241,"rand_new_drbg");
      ERR_set_error(0x24,0x90,0);
    }
    else {
      lVar5 = EVP_RAND_CTX_new(lVar4,param_2);
      EVP_RAND_free(lVar4);
      if (lVar5 == 0) {
        ERR_new();
        ERR_set_debug("crypto/rand/rand_lib.c",0x247,"rand_new_drbg");
        ERR_set_error(0x24,0x8f,0);
        return 0;
      }
      pcVar1 = "AES-256-CTR";
      if (*(char **)(lVar3 + 0x28) != (char *)0x0) {
        pcVar1 = *(char **)(lVar3 + 0x28);
      }
      puVar6 = &local_138;
      OSSL_PARAM_construct_utf8_string(&local_188,"cipher",pcVar1,0);
      local_140 = local_168;
      uStack_158 = uStack_180;
      local_160 = local_188;
      uStack_148 = uStack_170;
      uStack_150 = local_178;
      if (*(long *)(lVar3 + 0x30) != 0) {
        puVar6 = local_110;
        OSSL_PARAM_construct_utf8_string(&local_188,"digest",*(long *)(lVar3 + 0x30),0);
        local_118 = local_168;
        uStack_130 = uStack_180;
        local_138 = local_188;
        uStack_120 = uStack_170;
        uStack_128 = local_178;
      }
      puVar7 = puVar6;
      if (*(long *)(lVar3 + 0x38) != 0) {
        puVar7 = puVar6 + 5;
        OSSL_PARAM_construct_utf8_string(&local_188,"properties",*(long *)(lVar3 + 0x38),0);
        puVar6[4] = local_168;
        puVar6[1] = uStack_180;
        *puVar6 = local_188;
        puVar6[3] = uStack_170;
        puVar6[2] = local_178;
      }
      OSSL_PARAM_construct_utf8_string(&local_188,&DAT_002d42ff,&DAT_002c35d3,0);
      puVar7[4] = local_168;
      puVar7[1] = uStack_180;
      *puVar7 = local_188;
      puVar7[3] = uStack_170;
      puVar7[2] = local_178;
      OSSL_PARAM_construct_uint(&local_188,"reseed_requests",&local_34);
      puVar7[9] = local_168;
      puVar7[8] = uStack_170;
      puVar7[7] = local_178;
      puVar7[6] = uStack_180;
      puVar7[5] = local_188;
      OSSL_PARAM_construct_time_t(&local_188,"reseed_time_interval",&local_48);
      puVar7[0xe] = local_168;
      puVar7[0xb] = uStack_180;
      puVar7[10] = local_188;
      puVar7[0xd] = uStack_170;
      puVar7[0xc] = local_178;
      OSSL_PARAM_construct_end(&local_188);
      puVar7[0x13] = local_168;
      puVar7[0x12] = uStack_170;
      puVar7[0x11] = local_178;
      puVar7[0x10] = uStack_180;
      puVar7[0xf] = local_188;
      iVar2 = EVP_RAND_instantiate(lVar5,0,0,0,0,&local_160);
      if (iVar2 != 0) {
        return lVar5;
      }
      ERR_new();
      ERR_set_debug("crypto/rand/rand_lib.c",0x25f,"rand_new_drbg");
      ERR_set_error(0x24,0x6c,0);
      EVP_RAND_CTX_free(lVar5);
    }
  }
  return 0;
}

