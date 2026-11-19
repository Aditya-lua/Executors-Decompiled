/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b169a8
 */

X509_SIG * d2i_PKCS8_fp(FILE *fp,X509_SIG **p8)

{
  X509_SIG *pXVar1;
  
  pXVar1 = ASN1_d2i_fp(X509_SIG_new,d2i_X509_SIG,fp,p8);
  return pXVar1;
}

