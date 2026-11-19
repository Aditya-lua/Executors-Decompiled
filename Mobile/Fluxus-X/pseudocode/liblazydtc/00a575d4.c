/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a575d4
 */

EVP_MD_CTX *
evp_md_ctx_new_ex(undefined8 param_1,undefined4 *param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  EVP_PKEY_CTX *ctx_00;
  
  ctx = (EVP_MD_CTX *)CRYPTO_zalloc(0x48,"crypto/evp/digest.c",0x84);
  if (ctx == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/digest.c",0x71,"evp_md_ctx_new_ex");
    ERR_set_error(0xd,0xc0100,0);
    EVP_PKEY_CTX_free((EVP_PKEY_CTX *)0x0);
  }
  else {
    ctx_00 = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(param_3,param_1,param_4);
    if (ctx_00 == (EVP_PKEY_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/evp/digest.c",0x71,"evp_md_ctx_new_ex");
      ERR_set_error(0xd,0xc0100,0);
      ctx_00 = (EVP_PKEY_CTX *)0x0;
    }
    else if ((param_2 == (undefined4 *)0x0) ||
            (iVar1 = EVP_PKEY_CTX_set1_id(ctx_00,*(undefined8 *)(param_2 + 2),*param_2), 0 < iVar1))
    {
      EVP_MD_CTX_set_pkey_ctx(ctx,ctx_00);
      return ctx;
    }
    EVP_PKEY_CTX_free(ctx_00);
    iVar1 = EVP_MD_CTX_test_flags(ctx,0x400);
    if (iVar1 == 0) {
      EVP_PKEY_CTX_free((EVP_PKEY_CTX *)ctx->update);
      ctx->update = (_func_1088 *)0x0;
    }
    evp_md_ctx_clear_digest(ctx,0,0);
    OPENSSL_cleanse(ctx,0x48);
    CRYPTO_free(ctx);
  }
  return (EVP_MD_CTX *)0x0;
}

