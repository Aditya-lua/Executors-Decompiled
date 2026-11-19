/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d10c
 */

undefined8 EVP_PKEY_new_CMAC_key(ENGINE *param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  EVP_PKEY_CTX *ctx;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined8 local_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 local_120;
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
  undefined8 local_98 [11];
  
  if (param_1 == (ENGINE *)0x0) {
    pcVar2 = (char *)0x0;
  }
  else {
    pcVar2 = ENGINE_get_id(param_1);
  }
  local_118 = 0;
  if (param_4 != 0) {
    local_118 = 0;
    lVar3 = EVP_CIPHER_get0_name(param_4);
    if (lVar3 != 0) {
      ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_name(0,&DAT_002bdb6e,0);
      if (ctx != (EVP_PKEY_CTX *)0x0) {
        iVar1 = EVP_PKEY_fromdata_init(ctx);
        if (iVar1 < 1) {
          ERR_new();
          uVar4 = 0x281;
        }
        else {
          OSSL_PARAM_construct_octet_string(&local_140,&DAT_002a3e83,param_2,param_3);
          local_f0 = local_120;
          uStack_108 = uStack_138;
          local_110 = local_140;
          uStack_f8 = uStack_128;
          uStack_100 = uStack_130;
          puVar5 = &local_c0;
          OSSL_PARAM_construct_utf8_string(&local_140,"cipher",lVar3,0);
          local_c8 = local_120;
          uStack_d0 = uStack_128;
          local_d8 = uStack_130;
          uStack_e0 = uStack_138;
          local_e8 = local_140;
          if (pcVar2 != (char *)0x0) {
            puVar5 = local_98;
            OSSL_PARAM_construct_utf8_string(&local_140,"engine",pcVar2,0);
            local_a0 = local_120;
            uStack_b8 = uStack_138;
            local_c0 = local_140;
            uStack_a8 = uStack_128;
            uStack_b0 = uStack_130;
          }
          OSSL_PARAM_construct_end(&local_140);
          puVar5[4] = local_120;
          puVar5[1] = uStack_138;
          *puVar5 = local_140;
          puVar5[3] = uStack_128;
          puVar5[2] = uStack_130;
          iVar1 = EVP_PKEY_fromdata(ctx,&local_118,0x87,&local_110);
          if (0 < iVar1) goto LAB_00a6d2d0;
          ERR_new();
          uVar4 = 0x294;
        }
        ERR_set_debug("crypto/evp/p_lib.c",uVar4,"new_cmac_key_int");
        ERR_set_error(6,0xb4,0);
      }
LAB_00a6d2d0:
      EVP_PKEY_CTX_free(ctx);
      return local_118;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/evp/p_lib.c",0x278,"new_cmac_key_int");
  ERR_set_error(6,0xb4,0);
  return 0;
}

