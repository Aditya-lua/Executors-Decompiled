/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10908
 */

X509_VERIFY_PARAM * X509_STORE_CTX_get0_param(X509_STORE_CTX *ctx)

{
  return (X509_VERIFY_PARAM *)ctx->crls;
}

