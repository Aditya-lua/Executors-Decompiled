/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bed7c
 */

void SSL_CTX_sess_set_remove_cb(SSL_CTX *ctx,remove_session_cb *remove_session_cb)

{
  *(remove_session_cb **)&ctx->stats = remove_session_cb;
  return;
}

