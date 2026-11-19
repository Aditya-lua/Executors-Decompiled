/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10910
 */

void X509_STORE_CTX_set0_param(X509_STORE_CTX *ctx,X509_VERIFY_PARAM *param)

{
  X509_VERIFY_PARAM_free((X509_VERIFY_PARAM *)ctx->crls);
  ctx->crls = (stack_st_X509_CRL *)param;
  return;
}

