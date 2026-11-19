/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b26038
 */

undefined8
ossl_siv128_init(undefined8 *param_1,long param_2,int param_3,long param_4,EVP_CIPHER *param_5,
                undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  undefined8 uVar2;
  EVP_CIPHER_CTX *pEVar3;
  long lVar4;
  undefined8 *puVar5;
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
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 local_58;
  
  local_58 = 0x10;
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  *param_1 = 0;
  param_1[1] = 0;
  puVar5 = param_1 + 4;
  EVP_CIPHER_CTX_free((EVP_CIPHER_CTX *)*puVar5);
  EVP_MAC_CTX_free(param_1[6]);
  EVP_MAC_free(param_1[5]);
  *puVar5 = 0;
  param_1[5] = 0;
  param_1[6] = 0;
  if (param_2 == 0) {
    return 0;
  }
  if (param_4 == 0) {
    return 0;
  }
  if (param_5 == (EVP_CIPHER *)0x0) {
    return 0;
  }
  uVar2 = EVP_CIPHER_get0_name(param_4);
  OSSL_PARAM_construct_utf8_string(&local_108,"cipher",uVar2,0);
  local_c0 = local_e8;
  uStack_d8 = uStack_100;
  local_e0 = local_108;
  uStack_c8 = uStack_f0;
  uStack_d0 = local_f8;
  OSSL_PARAM_construct_octet_string(&local_108,&DAT_002c567e,param_2,(long)param_3);
  local_98 = local_e8;
  uStack_a0 = uStack_f0;
  local_a8 = local_f8;
  uStack_b0 = uStack_100;
  local_b8 = local_108;
  OSSL_PARAM_construct_end(&local_108);
  local_70 = local_e8;
  uStack_88 = uStack_100;
  local_90 = local_108;
  uStack_78 = uStack_f0;
  uStack_80 = local_f8;
  pEVar3 = EVP_CIPHER_CTX_new();
  *puVar5 = pEVar3;
  if (pEVar3 != (EVP_CIPHER_CTX *)0x0) {
    lVar4 = EVP_MAC_fetch(param_6,&DAT_002bdb6e,param_7);
    param_1[5] = lVar4;
    if (lVar4 != 0) {
      lVar4 = EVP_MAC_CTX_new();
      param_1[6] = lVar4;
      if (((lVar4 != 0) && (iVar1 = EVP_MAC_CTX_set_params(lVar4,&local_e0), iVar1 != 0)) &&
         (iVar1 = EVP_EncryptInit_ex((EVP_CIPHER_CTX *)*puVar5,param_5,(ENGINE *)0x0,
                                     (uchar *)(param_2 + param_3),(uchar *)0x0), iVar1 != 0)) {
        lVar4 = EVP_MAC_CTX_dup(param_1[6]);
        if (((lVar4 != 0) && (iVar1 = EVP_MAC_update(lVar4,&DAT_0077c078,0x10), iVar1 != 0)) &&
           (iVar1 = EVP_MAC_final(lVar4,param_1,&local_58,0x10), iVar1 != 0)) {
          EVP_MAC_CTX_free(lVar4);
          param_1[7] = 0x1ffffffff;
          return 1;
        }
        goto LAB_00b261f8;
      }
    }
  }
  lVar4 = 0;
LAB_00b261f8:
  EVP_CIPHER_CTX_free((EVP_CIPHER_CTX *)param_1[4]);
  EVP_MAC_CTX_free(param_1[6]);
  EVP_MAC_CTX_free(lVar4);
  EVP_MAC_free(param_1[5]);
  return 0;
}

