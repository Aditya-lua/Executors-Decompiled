/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16314
 */

int i2d_EC_PUBKEY_fp(FILE *fp,EC_KEY *eckey)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_fp(i2d_EC_PUBKEY,fp,eckey);
  return iVar1;
}

