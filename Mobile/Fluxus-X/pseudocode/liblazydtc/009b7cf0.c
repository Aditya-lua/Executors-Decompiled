/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7cf0
 */

void SSL_CTX_set_psk_server_callback(SSL_CTX *ctx,psk_server_callback *psk_server_callback)

{
  ctx[1].app_verify_arg = psk_server_callback;
  return;
}

