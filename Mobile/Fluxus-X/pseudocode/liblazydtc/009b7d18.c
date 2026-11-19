/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d18
 */

void SSL_CTX_set_msg_callback(SSL_CTX *ctx,cb *cb)

{
  *(cb **)(ctx->sid_ctx + 0x10) = cb;
  return;
}

