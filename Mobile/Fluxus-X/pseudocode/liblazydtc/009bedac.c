/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bedac
 */

void SSL_CTX_set_client_cert_cb(SSL_CTX *ctx,client_cert_cb *client_cert_cb)

{
  ctx->app_verify_cookie_cb = (_func_3093 *)client_cert_cb;
  return;
}

