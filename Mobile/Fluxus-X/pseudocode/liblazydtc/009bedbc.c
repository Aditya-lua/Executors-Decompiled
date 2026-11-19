/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bedbc
 */

void SSL_CTX_set_cookie_generate_cb(SSL_CTX *ctx,app_gen_cookie_cb *app_gen_cookie_cb)

{
  (ctx->ex_data).sk = (stack_st_void *)app_gen_cookie_cb;
  return;
}

