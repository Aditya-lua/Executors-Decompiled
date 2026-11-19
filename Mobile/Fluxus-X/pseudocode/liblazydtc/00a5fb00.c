/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fb00
 */

int EVP_MD_CTX_test_flags(EVP_MD_CTX *ctx,int flags)

{
  return *(uint *)&ctx->md_data & flags;
}

