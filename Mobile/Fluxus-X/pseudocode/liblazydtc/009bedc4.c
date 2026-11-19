/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bedc4
 */

void SSL_CTX_set_cookie_verify_cb(SSL_CTX *ctx,app_verify_cookie_cb *app_verify_cookie_cb)

{
  *(app_verify_cookie_cb **)&(ctx->ex_data).dummy = app_verify_cookie_cb;
  return;
}

