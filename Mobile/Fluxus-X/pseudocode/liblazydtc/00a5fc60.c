/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fc60
 */

int EVP_CIPHER_CTX_test_flags(EVP_CIPHER_CTX *ctx,int flags)

{
  return (uint)ctx->flags & flags;
}

