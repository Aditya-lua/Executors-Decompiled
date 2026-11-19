/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15d80
 */

X509_CRL * d2i_X509_CRL_fp(FILE *fp,X509_CRL **crl)

{
  ASN1_ITEM *it;
  X509_CRL *pXVar1;
  
  it = (ASN1_ITEM *)X509_CRL_it();
  pXVar1 = ASN1_item_d2i_fp(it,fp,crl);
  return pXVar1;
}

