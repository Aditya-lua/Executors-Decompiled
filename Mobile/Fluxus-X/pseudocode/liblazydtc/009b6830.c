/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6830
 */

void SSL_CTX_set_verify_depth(SSL_CTX *ctx,int depth)

{
  X509_VERIFY_PARAM_set_depth(*(X509_VERIFY_PARAM **)(ctx->tlsext_tick_key_name + 8),depth);
  return;
}

