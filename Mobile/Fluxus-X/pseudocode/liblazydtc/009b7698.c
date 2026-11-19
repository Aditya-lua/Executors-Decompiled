/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7698
 */

int SSL_CTX_get_quiet_shutdown(SSL_CTX *ctx)

{
  return *(int *)ctx->tlsext_tick_hmac_key;
}

