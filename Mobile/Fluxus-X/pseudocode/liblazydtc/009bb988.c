/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb988
 */

int SSL_use_PrivateKey_file(SSL *ssl,char *file,int type)

{
  int iVar1;
  BIO_METHOD *type_00;
  BIO *bp;
  long lVar2;
  EVP_PKEY *pkey;
  undefined4 uVar3;
  undefined8 *puVar4;
  
  type_00 = BIO_s_file();
  bp = BIO_new(type_00);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x9e,"SSL_use_PrivateKey_file");
    uVar3 = 0x80007;
  }
  else {
    lVar2 = BIO_ctrl(bp,0x6c,3,file);
    if ((int)lVar2 < 1) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0xa3,"SSL_use_PrivateKey_file");
      uVar3 = 0x80002;
    }
    else {
      if (type == 2) {
        puVar4 = *(undefined8 **)&ssl[3].ex_data.dummy;
        pkey = (EVP_PKEY *)d2i_PrivateKey_ex_bio(bp,0,*puVar4,puVar4[0x88]);
        uVar3 = 0x8000d;
      }
      else {
        if (type != 1) {
          ERR_new();
          ERR_set_debug("ssl/ssl_rsa.c",0xb2,"SSL_use_PrivateKey_file");
          uVar3 = 0x7c;
          goto LAB_009bbb04;
        }
        puVar4 = *(undefined8 **)&ssl[3].ex_data.dummy;
        pkey = (EVP_PKEY *)
               PEM_read_bio_PrivateKey_ex
                         (bp,0,ssl[10].tlsext_ellipticcurvelist,ssl[10].tlsext_opaque_prf_input,
                          *puVar4,puVar4[0x88]);
        uVar3 = 0x80009;
      }
      if (pkey != (EVP_PKEY *)0x0) {
        iVar1 = FUN_009bb8c0(ssl[3].d1,pkey);
        EVP_PKEY_free(pkey);
        goto LAB_009bbb10;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0xb6,"SSL_use_PrivateKey_file");
    }
  }
LAB_009bbb04:
  ERR_set_error(0x14,uVar3,0);
  iVar1 = 0;
LAB_009bbb10:
  BIO_free(bp);
  return iVar1;
}

