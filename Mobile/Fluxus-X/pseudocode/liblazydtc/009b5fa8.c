/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5fa8
 */

void SSL_CTX_set_next_proto_select_cb(SSL_CTX *s,cb *cb,void *arg)

{
  *(cb **)&s[1].stats = cb;
  *(void **)&s[1].stats.sess_connect_good = arg;
  return;
}

