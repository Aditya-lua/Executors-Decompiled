/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f334
 */

int X509_STORE_CTX_get_error(X509_STORE_CTX *ctx)

{
  return ctx->explicit_policy;
}

