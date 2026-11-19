/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b108f8
 */

int X509_STORE_CTX_get_explicit_policy(X509_STORE_CTX *ctx)

{
  return *(int *)&ctx->tree;
}

