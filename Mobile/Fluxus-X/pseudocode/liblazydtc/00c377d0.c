/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c377d0
 */

int ASN1_item_sign_ctx(ASN1_ITEM *it,X509_ALGOR *algor1,X509_ALGOR *algor2,
                      ASN1_BIT_STRING *signature,void *asn,EVP_MD_CTX *ctx)

{
  int iVar1;
  
  iVar1 = ASN1_item_sign_ctx(it,algor1,algor2,signature,asn,ctx);
  return iVar1;
}

