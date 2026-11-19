/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b54f4
 */

lhash_st_SSL_SESSION * SSL_CTX_sessions(SSL_CTX *ctx)

{
  return (lhash_st_SSL_SESSION *)ctx->session_cache_head;
}

