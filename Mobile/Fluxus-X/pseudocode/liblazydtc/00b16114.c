/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16114
 */

int i2d_RSA_PUBKEY_fp(FILE *fp,RSA *rsa)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_fp(i2d_RSA_PUBKEY,fp,rsa);
  return iVar1;
}

