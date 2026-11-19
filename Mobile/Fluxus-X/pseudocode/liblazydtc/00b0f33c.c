/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f33c
 */

void X509_STORE_CTX_set_error(X509_STORE_CTX *ctx,int s)

{
  ctx->explicit_policy = s;
  return;
}

