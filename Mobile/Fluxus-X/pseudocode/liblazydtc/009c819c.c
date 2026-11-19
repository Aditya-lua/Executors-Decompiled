/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c819c
 */

void SSL_set_tmp_dh_callback(SSL *ssl,dh *dh)

{
  SSL_callback_ctrl(ssl,6,(_func_3375 *)dh);
  return;
}

