/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16018
 */

int i2d_X509_REQ_bio(BIO *bp,X509_REQ *req)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)X509_REQ_it();
  iVar1 = ASN1_item_i2d_bio(it,bp,req);
  return iVar1;
}

