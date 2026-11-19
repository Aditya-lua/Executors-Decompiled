/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15f68
 */

X509_REQ * d2i_X509_REQ_fp(FILE *fp,X509_REQ **req)

{
  ASN1_ITEM *it;
  X509_REQ *pXVar1;
  
  it = (ASN1_ITEM *)X509_REQ_it();
  pXVar1 = ASN1_item_d2i_fp(it,fp,req);
  return pXVar1;
}

