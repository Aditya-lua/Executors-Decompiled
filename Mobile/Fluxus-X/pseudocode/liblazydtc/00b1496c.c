/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1496c
 */

int X509_CRL_set_issuer_name(X509_CRL *x,X509_NAME *name)

{
  int iVar1;
  
  if (x == (X509_CRL *)0x0) {
    return 0;
  }
  iVar1 = X509_NAME_set((X509_NAME **)&x->references,name);
  return iVar1;
}

