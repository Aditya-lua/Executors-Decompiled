/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3b9c
 */

BIO * SSL_get_rbio(SSL *s)

{
  return s->rbio;
}

