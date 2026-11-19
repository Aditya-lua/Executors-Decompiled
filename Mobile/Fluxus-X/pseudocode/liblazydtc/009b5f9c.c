/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5f9c
 */

void SSL_CTX_set_next_protos_advertised_cb(SSL_CTX *s,cb *cb,void *arg)

{
  s[1].remove_session_cb = (_func_3088 *)cb;
  s[1].get_session_cb = arg;
  return;
}

