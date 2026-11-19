/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f120
 */

void * EVP_CIPHER_CTX_get_app_data(EVP_CIPHER_CTX *ctx)

{
  return ctx->app_data;
}

