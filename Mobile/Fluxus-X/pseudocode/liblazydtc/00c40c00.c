/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40c00
 */

int X509_CRL_add_ext(X509_CRL *x,X509_EXTENSION *ex,int loc)

{
  int iVar1;
  
  iVar1 = X509_CRL_add_ext(x,ex,loc);
  return iVar1;
}

