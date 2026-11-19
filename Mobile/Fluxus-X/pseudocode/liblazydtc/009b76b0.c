/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b76b0
 */

void SSL_set_shutdown(SSL *ssl,int mode)

{
  ssl->shutdown = mode;
  return;
}

