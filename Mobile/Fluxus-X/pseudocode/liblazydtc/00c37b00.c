/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37b00
 */

int ASN1_item_verify(ASN1_ITEM *it,X509_ALGOR *algor1,ASN1_BIT_STRING *signature,void *data,
                    EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = ASN1_item_verify(it,algor1,signature,data,pkey);
  return iVar1;
}

