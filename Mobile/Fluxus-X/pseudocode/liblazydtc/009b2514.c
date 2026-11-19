/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2514
 */

int SSL_CTX_set_session_id_context(SSL_CTX *ctx,uchar *sid_ctx,uint sid_ctx_len)

{
  if (sid_ctx_len < 0x21) {
    ctx->generate_session_id = (GEN_SESSION_CB)(ulong)sid_ctx_len;
    memcpy(&ctx->param,sid_ctx,(size_t)(ulong)sid_ctx_len);
    return 1;
  }
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0x37d,"SSL_CTX_set_session_id_context");
  ERR_set_error(0x14,0x111,0);
  return 0;
}

