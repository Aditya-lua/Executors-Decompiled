/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b67dc
 */

void SSL_CTX_set_default_passwd_cb(SSL_CTX *ctx,undefined1 *cb)

{
  ctx->client_cert_cb = (_func_3091 *)cb;
  return;
}

