/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f940
 */

int HMAC_Final(HMAC_CTX *ctx,uchar *md,uint *len)

{
  int iVar1;
  uchar auStack_70 [64];
  uint local_24;
  
  if ((((ctx->md == (EVP_MD *)0x0) ||
       (iVar1 = EVP_DigestFinal_ex((EVP_MD_CTX *)(ctx->md_ctx).digest,auStack_70,&local_24),
       iVar1 == 0)) ||
      (iVar1 = EVP_MD_CTX_copy_ex((EVP_MD_CTX *)(ctx->md_ctx).digest,
                                  (EVP_MD_CTX *)(ctx->md_ctx).flags), iVar1 == 0)) ||
     ((iVar1 = EVP_DigestUpdate((EVP_MD_CTX *)(ctx->md_ctx).digest,auStack_70,(ulong)local_24),
      iVar1 == 0 ||
      (iVar1 = EVP_DigestFinal_ex((EVP_MD_CTX *)(ctx->md_ctx).digest,md,len), iVar1 == 0)))) {
    iVar1 = 0;
  }
  else {
    iVar1 = 1;
  }
  return iVar1;
}

