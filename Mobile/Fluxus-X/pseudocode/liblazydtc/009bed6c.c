/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bed6c
 */

void SSL_CTX_sess_set_new_cb(SSL_CTX *ctx,new_session_cb *new_session_cb)

{
  ctx->get_session_cb = (_func_3089 *)new_session_cb;
  return;
}

