/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16920
 */

int X509_NAME_digest(X509_NAME *data,EVP_MD *type,uchar *md,uint *len)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)X509_NAME_it();
  iVar1 = ASN1_item_digest(it,type,data,md,len);
  return iVar1;
}

