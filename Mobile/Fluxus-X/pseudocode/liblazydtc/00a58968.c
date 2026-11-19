/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58968
 */

int EVP_Digest(void *data,size_t count,uchar *md,uint *size,EVP_MD *type,ENGINE *impl)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  uint uVar2;
  
  ctx = (EVP_MD_CTX *)CRYPTO_zalloc(0x48,"crypto/evp/digest.c",0x84);
  if (ctx == (EVP_MD_CTX *)0x0) {
    uVar2 = 0;
  }
  else {
    EVP_MD_CTX_set_flags(ctx,1);
    iVar1 = FUN_00a577c0(ctx,type,0,impl);
    if ((iVar1 == 0) || (iVar1 = EVP_DigestUpdate(ctx,data,count), iVar1 == 0)) {
      uVar2 = 0;
    }
    else {
      iVar1 = EVP_DigestFinal_ex(ctx,md,size);
      uVar2 = (uint)(iVar1 != 0);
    }
    iVar1 = EVP_MD_CTX_test_flags(ctx,0x400);
    if (iVar1 == 0) {
      EVP_PKEY_CTX_free((EVP_PKEY_CTX *)ctx->update);
      ctx->update = (_func_1088 *)0x0;
    }
    evp_md_ctx_clear_digest(ctx,0,0);
    OPENSSL_cleanse(ctx,0x48);
    CRYPTO_free(ctx);
  }
  return uVar2;
}

