/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16a38
 */

int i2d_X509_PUBKEY_fp(FILE *param_1,void *param_2)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_fp(i2d_X509_PUBKEY,param_1,param_2);
  return iVar1;
}

