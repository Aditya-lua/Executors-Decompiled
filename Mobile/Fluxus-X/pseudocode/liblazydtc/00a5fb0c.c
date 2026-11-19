/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fb0c
 */

void EVP_MD_CTX_set_flags(EVP_MD_CTX *ctx,int flags)

{
  ctx->md_data = (void *)((ulong)ctx->md_data | (long)flags);
  return;
}

