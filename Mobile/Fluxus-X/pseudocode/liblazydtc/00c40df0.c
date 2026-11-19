/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40df0
 */

int X509_CRL_sign(X509_CRL *x,EVP_PKEY *pkey,EVP_MD *md)

{
  int iVar1;
  
  iVar1 = X509_CRL_sign(x,pkey,md);
  return iVar1;
}

