/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58000
 */

int EVP_DigestFinal(EVP_MD_CTX *ctx,uchar *md,uint *s)

{
  int iVar1;
  int iVar2;
  
  iVar1 = EVP_DigestFinal_ex(ctx,md,s);
  if (ctx != (EVP_MD_CTX *)0x0) {
    iVar2 = EVP_MD_CTX_test_flags(ctx,0x400);
    if (iVar2 == 0) {
      EVP_PKEY_CTX_free((EVP_PKEY_CTX *)ctx->update);
      ctx->update = (_func_1088 *)0x0;
    }
    evp_md_ctx_clear_digest(ctx,0,0);
    OPENSSL_cleanse(ctx,0x48);
  }
  return iVar1;
}

