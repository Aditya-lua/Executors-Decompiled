/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f128
 */

void EVP_CIPHER_CTX_set_app_data(EVP_CIPHER_CTX *ctx,void *data)

{
  ctx->app_data = data;
  return;
}

