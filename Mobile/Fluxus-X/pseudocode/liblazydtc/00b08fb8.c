/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08fb8
 */

int X509_CRL_cmp(X509_CRL *a,X509_CRL *b)

{
  int iVar1;
  
  iVar1 = X509_NAME_cmp(*(X509_NAME **)&a->references,*(X509_NAME **)&b->references);
  return iVar1;
}

