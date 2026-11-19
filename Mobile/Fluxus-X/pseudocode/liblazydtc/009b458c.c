/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b458c
 */

void SSL_set_connect_state(SSL *s)

{
  s->server = 0;
  s->shutdown = 0;
  ossl_statem_clear();
  s->handshake_func = (_func_3149 *)s->method->ssl_read;
  FUN_009b1b60(s);
  return;
}

