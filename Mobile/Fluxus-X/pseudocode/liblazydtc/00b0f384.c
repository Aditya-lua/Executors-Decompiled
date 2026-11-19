/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f384
 */

X509_CRL * X509_STORE_CTX_get0_current_crl(X509_STORE_CTX *ctx)

{
  return (X509_CRL *)ctx->current_issuer;
}

