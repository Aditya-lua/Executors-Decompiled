/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ce8
 */

void SSL_set_psk_server_callback(SSL *ssl,psk_server_callback *psk_server_callback)

{
  *(psk_server_callback **)&ssl[3].debug = psk_server_callback;
  return;
}

