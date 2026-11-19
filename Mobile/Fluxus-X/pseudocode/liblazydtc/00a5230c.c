/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5230c
 */

ENGINE_SSL_CLIENT_CERT_PTR ENGINE_get_ssl_client_cert_function(ENGINE *e)

{
  return *(ENGINE_SSL_CLIENT_CERT_PTR *)(e + 0x88);
}

