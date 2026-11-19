/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77ba8
 */

int EVP_PKEY_CTX_get_operation(EVP_PKEY_CTX *ctx)

{
  return *(int *)ctx;
}

