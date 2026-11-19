/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b76a0
 */

void SSL_set_quiet_shutdown(SSL *ssl,int mode)

{
  ssl->quiet_shutdown = mode;
  return;
}

