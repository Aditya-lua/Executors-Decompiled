/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bbc8c
 */

int SSL_CTX_use_certificate_file(SSL_CTX *ctx,char *file,int type)

{
  int iVar1;
  BIO_METHOD *type_00;
  BIO *bp;
  long lVar2;
  X509 *pXVar3;
  undefined4 uVar4;
  X509 *local_38;
  
  local_38 = (X509 *)0x0;
  type_00 = BIO_s_file();
  bp = BIO_new(type_00);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x11e,"SSL_CTX_use_certificate_file");
    uVar4 = 0x80007;
  }
  else {
    lVar2 = BIO_ctrl(bp,0x6c,3,file);
    if ((int)lVar2 < 1) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x123,"SSL_CTX_use_certificate_file");
      uVar4 = 0x80002;
    }
    else if (type - 1U < 2) {
      local_38 = (X509 *)X509_new_ex(ctx->method,ctx[1].tlsext_ticket_key_cb);
      if (local_38 == (X509 *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",300,"SSL_CTX_use_certificate_file");
        uVar4 = 0xc0100;
      }
      else {
        if (type == 1) {
          pXVar3 = PEM_read_bio_X509(bp,&local_38,ctx->client_cert_cb,ctx->app_gen_cookie_cb);
          uVar4 = 0x80009;
joined_r0x009bbdf8:
          if (pXVar3 != (X509 *)0x0) {
            iVar1 = SSL_CTX_use_certificate(ctx,local_38);
            goto LAB_009bbe44;
          }
        }
        else {
          if (type == 2) {
            pXVar3 = d2i_X509_bio(bp,&local_38);
            uVar4 = 0x8000d;
            goto joined_r0x009bbdf8;
          }
          uVar4 = 0x180;
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x138,"SSL_CTX_use_certificate_file");
      }
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x127,"SSL_CTX_use_certificate_file");
      uVar4 = 0x7c;
    }
  }
  ERR_set_error(0x14,uVar4,0);
  iVar1 = 0;
LAB_009bbe44:
  X509_free(local_38);
  BIO_free(bp);
  return iVar1;
}

