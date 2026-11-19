/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6824
 */

void SSL_CTX_set_verify(SSL_CTX *ctx,int mode,callback *callback)

{
  *(int *)&ctx->default_verify_callback = mode;
  ctx->tlsext_servername_arg = callback;
  return;
}

