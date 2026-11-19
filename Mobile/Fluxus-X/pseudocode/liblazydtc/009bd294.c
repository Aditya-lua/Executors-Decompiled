/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd294
 */

SSL_SESSION * SSL_get_session(SSL *ssl)

{
  return *(SSL_SESSION **)&ssl[3].sid_ctx_length;
}

