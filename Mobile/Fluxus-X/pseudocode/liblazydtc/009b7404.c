/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7404
 */

SSL_CTX * SSL_get_SSL_CTX(SSL *ssl)

{
  return *(SSL_CTX **)&ssl[3].ex_data.dummy;
}

