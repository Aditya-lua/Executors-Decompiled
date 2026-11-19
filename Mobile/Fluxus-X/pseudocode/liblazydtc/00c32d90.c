/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32d90
 */

X509 * d2i_X509_bio(BIO *bp,X509 **x509)

{
  X509 *pXVar1;
  
  pXVar1 = d2i_X509_bio(bp,x509);
  return pXVar1;
}

