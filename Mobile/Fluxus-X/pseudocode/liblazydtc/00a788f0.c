/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a788f0
 */

bool ossl_dh_kdf_X9_42_asn1
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,long param_6,undefined8 param_7,undefined8 param_8,
               undefined8 param_9,undefined8 param_10)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  bool bVar5;
  undefined8 *puVar6;
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
  undefined8 local_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 local_b8 [11];
  
  uVar2 = EVP_MD_get0_name(param_8);
  lVar3 = EVP_KDF_fetch(param_9,"X942KDF-ASN1",param_10);
  if (lVar3 == 0) {
    bVar5 = false;
  }
  else {
    lVar4 = EVP_KDF_CTX_new();
    if (lVar4 == 0) {
      bVar5 = false;
    }
    else {
      OSSL_PARAM_construct_utf8_string(&local_158,"digest",uVar2,0);
      local_110 = local_138;
      uStack_128 = uStack_150;
      local_130 = local_158;
      uStack_118 = uStack_140;
      uStack_120 = local_148;
      puVar6 = &local_e0;
      OSSL_PARAM_construct_octet_string(&local_158,&DAT_002c567e,param_3,param_4);
      local_e8 = local_138;
      uStack_f0 = uStack_140;
      local_f8 = local_148;
      uStack_100 = uStack_150;
      local_108 = local_158;
      if (param_6 != 0) {
        puVar6 = local_b8;
        OSSL_PARAM_construct_octet_string(&local_158,&DAT_002bbce2,param_6,param_7);
        local_c0 = local_138;
        uStack_d8 = uStack_150;
        local_e0 = local_158;
        uStack_c8 = uStack_140;
        uStack_d0 = local_148;
      }
      OSSL_PARAM_construct_utf8_string(&local_158,"cekalg",param_5,0);
      puVar6[4] = local_138;
      puVar6[1] = uStack_150;
      *puVar6 = local_158;
      puVar6[3] = uStack_140;
      puVar6[2] = local_148;
      OSSL_PARAM_construct_end(&local_158);
      puVar6[9] = local_138;
      puVar6[8] = uStack_140;
      puVar6[7] = local_148;
      puVar6[6] = uStack_150;
      puVar6[5] = local_158;
      iVar1 = EVP_KDF_derive(lVar4,param_1,param_2,&local_130);
      bVar5 = 0 < iVar1;
    }
    EVP_KDF_CTX_free(lVar4);
    EVP_KDF_free(lVar3);
  }
  return bVar5;
}

