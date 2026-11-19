/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bbc
 */

void EVP_PKEY_CTX_set_data(EVP_PKEY_CTX *ctx,void *data)

{
  *(void **)(ctx + 0x98) = data;
  return;
}

