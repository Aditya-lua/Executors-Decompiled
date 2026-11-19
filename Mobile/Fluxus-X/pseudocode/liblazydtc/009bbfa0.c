/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bbfa0
 */

int SSL_CTX_use_PrivateKey_file(SSL_CTX *ctx,char *file,int type)

{
  int iVar1;
  BIO_METHOD *type_00;
  BIO *bp;
  long lVar2;
  EVP_PKEY *pkey;
  undefined4 uVar3;
  
  type_00 = BIO_s_file();
  bp = BIO_new(type_00);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x16a,"SSL_CTX_use_PrivateKey_file");
    uVar3 = 0x80007;
  }
  else {
    lVar2 = BIO_ctrl(bp,0x6c,3,file);
    if ((int)lVar2 < 1) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x16f,"SSL_CTX_use_PrivateKey_file");
      uVar3 = 0x80002;
    }
    else {
      if (type == 2) {
        pkey = (EVP_PKEY *)d2i_PrivateKey_ex_bio(bp,0,ctx->method,ctx[1].tlsext_ticket_key_cb);
        uVar3 = 0x8000d;
      }
      else {
        if (type != 1) {
          ERR_new();
          ERR_set_debug("ssl/ssl_rsa.c",0x17c,"SSL_CTX_use_PrivateKey_file");
          uVar3 = 0x7c;
          goto LAB_009bc110;
        }
        pkey = (EVP_PKEY *)
               PEM_read_bio_PrivateKey_ex
                         (bp,0,ctx->client_cert_cb,ctx->app_gen_cookie_cb,ctx->method,
                          ctx[1].tlsext_ticket_key_cb);
        uVar3 = 0x80009;
      }
      if (pkey != (EVP_PKEY *)0x0) {
        iVar1 = FUN_009bb8c0(*(undefined8 *)ctx->sid_ctx,pkey);
        EVP_PKEY_free(pkey);
        goto LAB_009bc11c;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x180,"SSL_CTX_use_PrivateKey_file");
    }
  }
LAB_009bc110:
  ERR_set_error(0x14,uVar3,0);
  iVar1 = 0;
LAB_009bc11c:
  BIO_free(bp);
  return iVar1;
}

