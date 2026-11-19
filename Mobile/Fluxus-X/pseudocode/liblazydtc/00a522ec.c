/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a522ec
 */

int ENGINE_set_load_ssl_client_cert_function(ENGINE *e,ENGINE_SSL_CLIENT_CERT_PTR loadssl_f)

{
  *(ENGINE_SSL_CLIENT_CERT_PTR *)(e + 0x88) = loadssl_f;
  return 1;
}

