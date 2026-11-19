/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b17038
 */

int ASN1_item_digest(ASN1_ITEM *it,EVP_MD *type,void *data,uchar *md,uint *len)

{
  int iVar1;
  
  iVar1 = ossl_asn1_item_digest_ex((int)it);
  return iVar1;
}

