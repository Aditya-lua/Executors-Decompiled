/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b67e4
 */

void SSL_CTX_set_default_passwd_cb_userdata(SSL_CTX *ctx,void *u)

{
  ctx->app_gen_cookie_cb = u;
  return;
}

