/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b169c8
 */

int i2d_PKCS8_fp(FILE *fp,X509_SIG *p8)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_fp(i2d_X509_SIG,fp,p8);
  return iVar1;
}

