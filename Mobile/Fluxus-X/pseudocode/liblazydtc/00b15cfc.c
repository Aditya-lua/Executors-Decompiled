/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15cfc
 */

int i2d_X509_fp(FILE *fp,X509 *x509)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)X509_it();
  iVar1 = ASN1_item_i2d_fp(it,fp,x509);
  return iVar1;
}

