/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bc4
 */

void * EVP_PKEY_CTX_get_data(EVP_PKEY_CTX *ctx)

{
  return *(void **)(ctx + 0x98);
}

