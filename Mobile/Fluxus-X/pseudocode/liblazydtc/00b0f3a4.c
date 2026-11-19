/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f3a4
 */

int X509_STORE_CTX_set_purpose(X509_STORE_CTX *ctx,int purpose)

{
  int iVar1;
  
  iVar1 = X509_STORE_CTX_purpose_inherit(ctx,0,purpose,0);
  return iVar1;
}

