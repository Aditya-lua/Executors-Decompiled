/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f344
 */

int X509_STORE_CTX_get_error_depth(X509_STORE_CTX *ctx)

{
  return *(int *)((long)&ctx->tree + 4);
}

