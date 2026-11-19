/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b9f8
 */

int X509_STORE_set_purpose(X509_STORE *ctx,int purpose)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set_purpose(ctx->param,purpose);
  return iVar1;
}

