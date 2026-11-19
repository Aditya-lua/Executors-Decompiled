/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bea18
 */

int SSL_SESSION_set1_id_context(SSL_SESSION *s,uchar *sid_ctx,uint sid_ctx_len)

{
  if (0x20 < sid_ctx_len) {
    ERR_new();
    ERR_set_debug("ssl/ssl_sess.c",0x438,"SSL_SESSION_set1_id_context");
    ERR_set_error(0x14,0x111,0);
    return 0;
  }
  *(ulong *)(s[1].master_key + 0xc) = (ulong)sid_ctx_len;
  if (s[1].master_key + 0x14 != sid_ctx) {
    memcpy(s[1].master_key + 0x14,sid_ctx,(ulong)sid_ctx_len);
  }
  return 1;
}

