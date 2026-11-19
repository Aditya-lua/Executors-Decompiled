/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd68c
 */

int i2d_PKCS12_fp(FILE *fp,PKCS12 *p12)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)PKCS12_it();
  iVar1 = ASN1_item_i2d_fp(it,fp,p12);
  return iVar1;
}

