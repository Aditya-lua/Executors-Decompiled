/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6c34
 */

SSL_METHOD * SSL_get_ssl_method(SSL *s)

{
  return s->method;
}

