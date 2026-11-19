/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f37c
 */

X509 * X509_STORE_CTX_get0_current_issuer(X509_STORE_CTX *ctx)

{
  return ctx->current_cert;
}

