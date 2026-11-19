/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16234
 */

int i2d_DSAPrivateKey_fp(FILE *fp,DSA *dsa)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_fp(i2d_DSAPrivateKey,fp,dsa);
  return iVar1;
}

