/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b76b8
 */

int SSL_get_shutdown(SSL *ssl)

{
  return ssl->shutdown;
}

