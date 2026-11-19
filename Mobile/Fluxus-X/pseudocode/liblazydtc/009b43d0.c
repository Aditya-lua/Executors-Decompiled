/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b43d0
 */

int SSL_accept(SSL *ssl)

{
  int iVar1;
  
  if (ssl->handshake_func == (_func_3149 *)0x0) {
    ssl->server = 1;
    ssl->shutdown = 0;
    ossl_statem_clear(ssl);
    ssl->handshake_func = (_func_3149 *)ssl->method->ssl_connect;
    FUN_009b1b60(ssl);
  }
  iVar1 = SSL_do_handshake(ssl);
  return iVar1;
}

