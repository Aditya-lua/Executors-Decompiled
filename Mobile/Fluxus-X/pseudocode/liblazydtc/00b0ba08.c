/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ba08
 */

int X509_STORE_set1_param(X509_STORE *ctx,X509_VERIFY_PARAM *pm)

{
  int iVar1;
  
  iVar1 = X509_VERIFY_PARAM_set1(ctx->param,pm);
  return iVar1;
}

