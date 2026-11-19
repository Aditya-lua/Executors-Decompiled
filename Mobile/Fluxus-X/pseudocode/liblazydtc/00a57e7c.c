/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a57e7c
 */

int EVP_DigestInit(EVP_MD_CTX *ctx,EVP_MD *type)

{
  int iVar1;
  
  if (ctx != (EVP_MD_CTX *)0x0) {
    iVar1 = EVP_MD_CTX_test_flags(ctx,0x400);
    if (iVar1 == 0) {
      EVP_PKEY_CTX_free((EVP_PKEY_CTX *)ctx->update);
      ctx->update = (_func_1088 *)0x0;
    }
    evp_md_ctx_clear_digest(ctx,0,0);
    OPENSSL_cleanse(ctx,0x48);
  }
  iVar1 = FUN_00a577c0(ctx,type,0,0);
  return iVar1;
}

