/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8d74
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_PKEY * X509_PKEY_new(void)

{
  X509_PKEY *ptr;
  X509_ALGOR *pXVar1;
  ASN1_OCTET_STRING *pAVar2;
  
  ptr = (X509_PKEY *)CRYPTO_zalloc(0x50,"crypto/asn1/x_pkey.c",0x14);
  if (ptr != (X509_PKEY *)0x0) {
    pXVar1 = X509_ALGOR_new();
    ptr->enc_algor = pXVar1;
    pAVar2 = ASN1_OCTET_STRING_new();
    ptr->enc_pkey = pAVar2;
    if ((pAVar2 != (ASN1_OCTET_STRING *)0x0) && (ptr->enc_algor != (X509_ALGOR *)0x0)) {
      return ptr;
    }
    X509_ALGOR_free(ptr->enc_algor);
    ASN1_OCTET_STRING_free(ptr->enc_pkey);
    EVP_PKEY_free(ptr->dec_pkey);
    if (ptr->key_free != 0) {
      CRYPTO_free(ptr->key_data);
    }
    CRYPTO_free(ptr);
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/x_pkey.c",0x20,"X509_PKEY_new");
  ERR_set_error(0xd,0xc0100,0);
  return (X509_PKEY *)0x0;
}

