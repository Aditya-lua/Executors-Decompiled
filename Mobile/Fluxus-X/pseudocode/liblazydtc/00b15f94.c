/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15f94
 */

int i2d_X509_REQ_fp(FILE *fp,X509_REQ *req)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)X509_REQ_it();
  iVar1 = ASN1_item_i2d_fp(it,fp,req);
  return iVar1;
}

