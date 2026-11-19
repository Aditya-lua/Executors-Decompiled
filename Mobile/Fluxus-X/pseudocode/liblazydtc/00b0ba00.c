/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ba00
 */

int X509_STORE_set_trust(X509_STORE *ctx,int trust)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set_trust(ctx->param,trust);
  return iVar1;
}

