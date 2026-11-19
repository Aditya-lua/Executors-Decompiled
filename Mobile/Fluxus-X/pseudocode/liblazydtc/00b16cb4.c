/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16cb4
 */

int i2d_PUBKEY_fp(FILE *fp,EVP_PKEY *pkey)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_fp(i2d_PUBKEY,fp,pkey);
  return iVar1;
}

