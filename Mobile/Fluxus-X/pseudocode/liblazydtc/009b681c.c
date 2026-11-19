/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b681c
 */

void SSL_CTX_set_cert_verify_callback(SSL_CTX *ctx,cb *cb,void *arg)

{
  ctx->default_passwd_callback = cb;
  ctx->default_passwd_callback_userdata = arg;
  return;
}

