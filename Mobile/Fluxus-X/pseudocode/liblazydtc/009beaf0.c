/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009beaf0
 */

int SSL_set_session_ticket_ext_cb(SSL *s,tls_session_ticket_ext_cb_fn cb,void *arg)

{
  if (s != (SSL *)0x0) {
    *(tls_session_ticket_ext_cb_fn *)&s[4].rwstate = cb;
    s[4].handshake_func = arg;
  }
  return (uint)(s != (SSL *)0x0);
}

