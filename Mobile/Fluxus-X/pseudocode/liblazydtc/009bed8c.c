/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bed8c
 */

void SSL_CTX_sess_set_get_cb(SSL_CTX *ctx,get_session_cb *get_session_cb)

{
  *(get_session_cb **)&(ctx->stats).sess_connect_good = get_session_cb;
  return;
}

