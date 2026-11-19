/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a599ec
 */

void EVP_EncodeInit(EVP_ENCODE_CTX *ctx)

{
  ctx->line_num = 0;
  ctx->expect_nl = 0;
  ctx->num = 0;
  ctx->length = 0x30;
  return;
}

