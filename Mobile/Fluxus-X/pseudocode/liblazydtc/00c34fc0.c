/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c34fc0
 */

int X509_STORE_CTX_init(X509_STORE_CTX *ctx,X509_STORE *store,X509 *x509,stack_st_X509 *chain)

{
  int iVar1;
  
  iVar1 = X509_STORE_CTX_init(ctx,store,x509,chain);
  return iVar1;
}

