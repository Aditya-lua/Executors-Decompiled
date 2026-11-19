/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7690
 */

void SSL_CTX_set_quiet_shutdown(SSL_CTX *ctx,int mode)

{
  *(int *)ctx->tlsext_tick_hmac_key = mode;
  return;
}

