/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16964
 */

int PKCS7_ISSUER_AND_SERIAL_digest(PKCS7_ISSUER_AND_SERIAL *data,EVP_MD *type,uchar *md,uint *len)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)PKCS7_ISSUER_AND_SERIAL_it();
  iVar1 = ASN1_item_digest(it,type,data,md,len);
  return iVar1;
}

