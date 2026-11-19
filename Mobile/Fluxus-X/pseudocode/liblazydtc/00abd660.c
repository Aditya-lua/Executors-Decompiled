/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd660
 */

int i2d_PKCS12_bio(BIO *bp,PKCS12 *p12)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)PKCS12_it();
  iVar1 = ASN1_item_i2d_bio(it,bp,p12);
  return iVar1;
}

