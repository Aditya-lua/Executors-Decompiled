/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd6b8
 */

PKCS12 * d2i_PKCS12_bio(BIO *bp,PKCS12 **p12)

{
  ASN1_ITEM *it;
  PKCS12 *pPVar1;
  
  it = (ASN1_ITEM *)PKCS12_it();
  pPVar1 = ASN1_item_d2i_bio(it,bp,p12);
  return pPVar1;
}

