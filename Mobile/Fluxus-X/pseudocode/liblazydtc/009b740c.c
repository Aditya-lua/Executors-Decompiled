/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b740c
 */

void SSL_set_info_callback(SSL *ssl,cb *cb)

{
  ssl[3].psk_client_callback = (_func_3153 *)cb;
  return;
}

