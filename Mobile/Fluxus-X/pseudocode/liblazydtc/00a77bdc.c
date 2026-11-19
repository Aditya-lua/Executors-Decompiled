/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bdc
 */

void EVP_PKEY_CTX_set_app_data(EVP_PKEY_CTX *ctx,void *data)

{
  *(void **)(ctx + 0x58) = data;
  return;
}

