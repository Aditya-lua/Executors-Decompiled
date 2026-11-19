/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bed9c
 */

void SSL_CTX_set_info_callback(SSL_CTX *ctx,cb *cb)

{
  ctx->mode = (ulong)cb;
  return;
}

