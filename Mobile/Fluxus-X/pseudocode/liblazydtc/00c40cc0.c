/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40cc0
 */

int X509_REQ_sign(X509_REQ *x,EVP_PKEY *pkey,EVP_MD *md)

{
  int iVar1;
  
  iVar1 = X509_REQ_sign(x,pkey,md);
  return iVar1;
}

