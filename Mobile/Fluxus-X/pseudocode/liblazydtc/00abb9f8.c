/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb9f8
 */

ASN1_OCTET_STRING *
PKCS12_item_i2d_encrypt_ex
          (undefined8 param_1,ASN1_ITEM *param_2,undefined8 param_3,undefined4 param_4,
          ASN1_VALUE *param_5,int param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  ASN1_OCTET_STRING *a;
  long lVar2;
  undefined8 uVar3;
  uchar *local_58;
  
  local_58 = (uchar *)0x0;
  a = ASN1_OCTET_STRING_new();
  if (a == (ASN1_OCTET_STRING *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_decr.c",0xb7,"PKCS12_item_i2d_encrypt_ex");
    uVar3 = 0xc0100;
  }
  else {
    iVar1 = ASN1_item_i2d(param_5,&local_58,param_2);
    if (local_58 != (uchar *)0x0) {
      lVar2 = PKCS12_pbe_crypt_ex(param_1,param_3,param_4,local_58,iVar1,&a->data,a,1,param_7,
                                  param_8);
      if (lVar2 != 0) {
        if (param_6 != 0) {
          OPENSSL_cleanse(local_58,(long)iVar1);
        }
        CRYPTO_free(local_58);
        return a;
      }
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_decr.c",0xc1,"PKCS12_item_i2d_encrypt_ex");
      ERR_set_error(0x23,0x67,0);
      CRYPTO_free(local_58);
      goto LAB_00abbb4c;
    }
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_decr.c",0xbc,"PKCS12_item_i2d_encrypt_ex");
    uVar3 = 0x66;
  }
  ERR_set_error(0x23,uVar3,0);
LAB_00abbb4c:
  ASN1_OCTET_STRING_free(a);
  return (ASN1_OCTET_STRING *)0x0;
}

