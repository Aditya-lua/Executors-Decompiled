/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ce0
 */

void SSL_CTX_set_psk_client_callback(SSL_CTX *ctx,psk_client_callback *psk_client_callback)

{
  ctx[1].app_verify_callback = (_func_3090 *)psk_client_callback;
  return;
}

