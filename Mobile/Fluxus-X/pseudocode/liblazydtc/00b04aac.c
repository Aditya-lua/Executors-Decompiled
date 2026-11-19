/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04aac
 */

ASN1_OCTET_STRING * ossl_x509_pubkey_hash(X509_PUBKEY *param_1)

{
  int iVar1;
  EVP_MD *type;
  ASN1_OCTET_STRING *str;
  undefined8 local_88;
  undefined8 uStack_80;
  uint local_78;
  uchar auStack_74 [64];
  int local_34;
  uchar *local_28;
  
  if (param_1 == (X509_PUBKEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_skid.c",0x43,"ossl_x509_pubkey_hash");
    ERR_set_error(0x22,0x72,0);
  }
  else {
    iVar1 = ossl_x509_PUBKEY_get0_libctx(&local_88,&uStack_80,param_1);
    if ((iVar1 != 0) &&
       (type = (EVP_MD *)EVP_MD_fetch(local_88,&DAT_002d142e,uStack_80), type != (EVP_MD *)0x0)) {
      str = ASN1_OCTET_STRING_new();
      if (str != (ASN1_OCTET_STRING *)0x0) {
        X509_PUBKEY_get0_param((ASN1_OBJECT **)0x0,&local_28,&local_34,(X509_ALGOR **)0x0,param_1);
        iVar1 = EVP_Digest(local_28,(long)local_34,auStack_74,&local_78,type,(ENGINE *)0x0);
        if ((iVar1 == 0) || (iVar1 = ASN1_OCTET_STRING_set(str,auStack_74,local_78), iVar1 == 0)) {
          EVP_MD_free(type);
          ASN1_OCTET_STRING_free(str);
          return (ASN1_OCTET_STRING *)0x0;
        }
      }
      EVP_MD_free(type);
      return str;
    }
  }
  return (ASN1_OCTET_STRING *)0x0;
}

