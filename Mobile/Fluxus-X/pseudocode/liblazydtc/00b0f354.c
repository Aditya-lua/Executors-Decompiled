/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f354
 */

X509 * X509_STORE_CTX_get_current_cert(X509_STORE_CTX *ctx)

{
  return *(X509 **)&ctx->error;
}

