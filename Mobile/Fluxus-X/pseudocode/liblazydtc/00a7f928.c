/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f928
 */

int HMAC_Update(HMAC_CTX *ctx,uchar *data,size_t len)

{
  int iVar1;
  
  if (ctx->md == (EVP_MD *)0x0) {
    return 0;
  }
  iVar1 = EVP_DigestUpdate((EVP_MD_CTX *)(ctx->md_ctx).digest,data,len);
  return iVar1;
}

