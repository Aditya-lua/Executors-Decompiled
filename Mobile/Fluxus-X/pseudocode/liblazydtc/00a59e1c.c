/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59e1c
 */

void EVP_DecodeInit(EVP_ENCODE_CTX *ctx)

{
  ctx->num = 0;
  ctx->length = 0;
  ctx->line_num = 0;
  ctx->expect_nl = 0;
  return;
}

