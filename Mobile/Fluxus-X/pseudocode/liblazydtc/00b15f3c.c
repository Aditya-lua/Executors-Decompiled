/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15f3c
 */

int i2d_PKCS7_bio(BIO *bp,PKCS7 *p7)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)PKCS7_it();
  iVar1 = ASN1_item_i2d_bio(it,bp,p7);
  return iVar1;
}

