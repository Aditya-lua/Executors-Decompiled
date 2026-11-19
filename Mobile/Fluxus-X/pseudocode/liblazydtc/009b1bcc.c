/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1bcc
 */

int SSL_CTX_set_ssl_version(SSL_CTX *ctx,SSL_METHOD *meth)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  lhash_st_SSL_SESSION *plVar4;
  
  ctx->cipher_list = (stack_st_SSL_CIPHER *)meth;
  uVar2 = OSSL_default_ciphersuites();
  iVar1 = SSL_CTX_set_ciphersuites(ctx,uVar2);
  if (iVar1 == 0) {
    ERR_new();
    uVar2 = 0x29f;
  }
  else {
    plVar4 = ctx->sessions;
    uVar2 = OSSL_default_cipher_list();
    lVar3 = ssl_create_cipher_list
                      (ctx,plVar4,&ctx->cipher_list_by_id,&ctx->cert_store,uVar2,
                       *(undefined8 *)ctx->sid_ctx);
    if ((lVar3 != 0) && (iVar1 = OPENSSL_sk_num(), 0 < iVar1)) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x2a8;
  }
  ERR_set_debug("ssl/ssl_lib.c",uVar2,"SSL_CTX_set_ssl_version");
  ERR_set_error(0x14,0xe6,0);
  return 0;
}

