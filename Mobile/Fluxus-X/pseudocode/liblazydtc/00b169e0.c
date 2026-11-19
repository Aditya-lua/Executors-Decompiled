/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b169e0
 */

X509_SIG * d2i_PKCS8_bio(BIO *bp,X509_SIG **p8)

{
  X509_SIG *pXVar1;
  
  pXVar1 = ASN1_d2i_bio(X509_SIG_new,d2i_X509_SIG,bp,p8);
  return pXVar1;
}

