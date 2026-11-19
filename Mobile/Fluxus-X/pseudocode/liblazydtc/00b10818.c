/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10818
 */

void X509_STORE_CTX_set_depth(X509_STORE_CTX *ctx,int depth)

{
  X509_VERIFY_PARAM_set_depth((X509_VERIFY_PARAM *)ctx->crls,depth);
  return;
}

