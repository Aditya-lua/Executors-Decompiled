/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f38c
 */

X509_STORE_CTX * X509_STORE_CTX_get0_parent_ctx(X509_STORE_CTX *ctx)

{
  return *(X509_STORE_CTX **)&ctx->current_crl_score;
}

