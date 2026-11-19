/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32c00
 */

X509_LOOKUP * X509_STORE_add_lookup(X509_STORE *v,X509_LOOKUP_METHOD *m)

{
  X509_LOOKUP *pXVar1;
  
  pXVar1 = X509_STORE_add_lookup(v,m);
  return pXVar1;
}

