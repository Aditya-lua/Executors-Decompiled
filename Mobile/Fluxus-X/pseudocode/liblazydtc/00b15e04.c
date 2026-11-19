/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15e04
 */

int i2d_X509_CRL_bio(BIO *bp,X509_CRL *crl)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)X509_CRL_it();
  iVar1 = ASN1_item_i2d_bio(it,bp,crl);
  return iVar1;
}

