/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8190
 */

void SSL_CTX_set_tmp_dh_callback(SSL_CTX *ctx,dh *dh)

{
  SSL_CTX_callback_ctrl(ctx,6,(_func_3378 *)dh);
  return;
}

