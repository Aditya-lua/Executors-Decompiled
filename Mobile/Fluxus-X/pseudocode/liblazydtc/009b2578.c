/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2578
 */

int SSL_set_session_id_context(SSL *ssl,uchar *sid_ctx,uint sid_ctx_len)

{
  if (sid_ctx_len < 0x21) {
    ssl[3].expand = (COMP_CTX *)(ulong)sid_ctx_len;
    memcpy(&ssl[3].enc_write_ctx,sid_ctx,(size_t)(ulong)sid_ctx_len);
    return 1;
  }
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0x38a,"SSL_set_session_id_context");
  ERR_set_error(0x14,0x111,0);
  return 0;
}

