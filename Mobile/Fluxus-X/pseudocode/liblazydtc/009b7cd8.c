/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7cd8
 */

void SSL_set_psk_client_callback(SSL *ssl,psk_client_callback *psk_client_callback)

{
  ssl[3].ctx = (SSL_CTX *)psk_client_callback;
  return;
}

