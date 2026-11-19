/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16070
 */

int i2d_RSAPrivateKey_fp(FILE *fp,RSA *rsa)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)RSAPrivateKey_it();
  iVar1 = ASN1_item_i2d_fp(it,fp,rsa);
  return iVar1;
}

