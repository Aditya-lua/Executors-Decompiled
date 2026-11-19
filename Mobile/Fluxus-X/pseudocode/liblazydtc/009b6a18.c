/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6a18
 */

int SSL_version(SSL *ssl)

{
  return ssl->version;
}

