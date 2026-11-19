/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15ea0
 */

int i2d_PKCS7_fp(FILE *fp,PKCS7 *p7)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)PKCS7_it();
  iVar1 = ASN1_item_i2d_fp(it,fp,p7);
  return iVar1;
}

