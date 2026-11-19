/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb90c
 */

ASN1_VALUE *
PKCS12_item_decrypt_d2i_ex
          (undefined8 param_1,ASN1_ITEM *param_2,undefined8 param_3,undefined4 param_4,
          undefined4 *param_5,int param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  ASN1_VALUE *pAVar2;
  int local_34;
  uchar *local_30;
  uchar *local_28;
  
  local_28 = (uchar *)0x0;
  local_34 = 0;
  lVar1 = PKCS12_pbe_crypt_ex(param_1,param_3,param_4,*(undefined8 *)(param_5 + 2),*param_5,
                              &local_28,&local_34,0,param_7,param_8);
  if (lVar1 == 0) {
    pAVar2 = (ASN1_VALUE *)0x0;
  }
  else {
    local_30 = local_28;
    pAVar2 = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_30,(long)local_34,param_2);
    if (param_6 != 0) {
      OPENSSL_cleanse(local_28,(long)local_34);
    }
    if (pAVar2 == (ASN1_VALUE *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_decr.c",0x99,"PKCS12_item_decrypt_d2i_ex");
      ERR_set_error(0x23,0x65,0);
    }
    CRYPTO_free(local_28);
  }
  return pAVar2;
}

