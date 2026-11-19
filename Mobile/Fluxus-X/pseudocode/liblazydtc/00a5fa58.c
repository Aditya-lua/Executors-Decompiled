/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fa58
 */

EVP_MD * EVP_MD_CTX_md(EVP_MD_CTX *ctx)

{
  EVP_MD *pEVar1;
  
  pEVar1 = (EVP_MD *)0x0;
  if (ctx != (EVP_MD_CTX *)0x0) {
    pEVar1 = ctx->digest;
  }
  return pEVar1;
}

