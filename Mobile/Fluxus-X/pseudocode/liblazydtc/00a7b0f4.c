/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7b0f4
 */

bool ossl_ecdh_kdf_X9_63(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4
                        ,undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8
                        ,undefined8 param_9)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  bool bVar5;
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
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  
  uVar2 = EVP_MD_get0_name(param_7);
  uVar3 = EVP_KDF_fetch(param_8,"X963KDF",param_9);
  lVar4 = EVP_KDF_CTX_new();
  if (lVar4 == 0) {
    bVar5 = false;
  }
  else {
    OSSL_PARAM_construct_utf8_string(&local_138,"digest",uVar2,0);
    local_f0 = local_118;
    uStack_108 = uStack_130;
    local_110 = local_138;
    uStack_f8 = uStack_120;
    uStack_100 = local_128;
    OSSL_PARAM_construct_octet_string(&local_138,&DAT_002c567e,param_3,param_4);
    local_c8 = local_118;
    uStack_d0 = uStack_120;
    local_d8 = local_128;
    uStack_e0 = uStack_130;
    local_e8 = local_138;
    OSSL_PARAM_construct_octet_string(&local_138,&DAT_0029e225,param_5,param_6);
    local_a0 = local_118;
    uStack_a8 = uStack_120;
    local_b0 = local_128;
    uStack_b8 = uStack_130;
    local_c0 = local_138;
    OSSL_PARAM_construct_end(&local_138);
    local_78 = local_118;
    uStack_80 = uStack_120;
    local_88 = local_128;
    uStack_90 = uStack_130;
    local_98 = local_138;
    iVar1 = EVP_KDF_derive(lVar4,param_1,param_2,&local_110);
    bVar5 = 0 < iVar1;
    EVP_KDF_CTX_free(lVar4);
  }
  EVP_KDF_free(uVar3);
  return bVar5;
}

