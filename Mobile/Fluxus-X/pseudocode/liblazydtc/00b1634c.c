/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1634c
 */

int i2d_ECPrivateKey_fp(FILE *fp,EC_KEY *eckey)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_fp(i2d_ECPrivateKey,fp,eckey);
  return iVar1;
}

