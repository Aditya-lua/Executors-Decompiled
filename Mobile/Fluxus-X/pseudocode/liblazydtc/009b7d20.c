/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d20
 */

void SSL_set_msg_callback(SSL *ssl,cb *cb)

{
  ssl[1].tlsext_ocsp_resp = (uchar *)cb;
  return;
}

