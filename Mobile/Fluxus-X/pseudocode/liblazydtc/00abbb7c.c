/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abbb7c
 */

ASN1_OCTET_STRING *
PKCS12_item_i2d_encrypt(X509_ALGOR *algor,ASN1_ITEM *it,char *pass,int passlen,void *obj,int zbuf)

{
  ASN1_OCTET_STRING *pAVar1;
  
  pAVar1 = (ASN1_OCTET_STRING *)PKCS12_item_i2d_encrypt_ex();
  return pAVar1;
}

