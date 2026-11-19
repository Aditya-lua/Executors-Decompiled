/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb590
 */

int SSL_use_certificate_file(SSL *ssl,char *file,int type)

{
  int iVar1;
  BIO_METHOD *type_00;
  BIO *bp;
  long lVar2;
  X509 *pXVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  X509 *local_38;
  
  local_38 = (X509 *)0x0;
  type_00 = BIO_s_file();
  bp = BIO_new(type_00);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x36,"SSL_use_certificate_file");
    uVar4 = 0x80007;
  }
  else {
    lVar2 = BIO_ctrl(bp,0x6c,3,file);
    if ((int)lVar2 < 1) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x3b,"SSL_use_certificate_file");
      uVar4 = 0x80002;
    }
    else if (type - 1U < 2) {
      puVar6 = *(undefined8 **)&ssl[3].ex_data.dummy;
      local_38 = (X509 *)X509_new_ex(*puVar6,puVar6[0x88]);
      if (local_38 == (X509 *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x45,"SSL_use_certificate_file");
        uVar4 = 0xc0100;
      }
      else {
        if (type == 1) {
          pXVar3 = PEM_read_bio_X509(bp,&local_38,ssl[10].tlsext_ellipticcurvelist,
                                     ssl[10].tlsext_opaque_prf_input);
          uVar4 = 0x80009;
        }
        else {
          if (type != 2) {
            ERR_new();
            uVar5 = 0x50;
            goto LAB_009bb604;
          }
          pXVar3 = d2i_X509_bio(bp,&local_38);
          uVar4 = 0x8000d;
        }
        if (pXVar3 != (X509 *)0x0) {
          iVar1 = SSL_use_certificate(ssl,local_38);
          goto LAB_009bb748;
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x55,"SSL_use_certificate_file");
      }
    }
    else {
      ERR_new();
      uVar5 = 0x40;
LAB_009bb604:
      ERR_set_debug("ssl/ssl_rsa.c",uVar5,"SSL_use_certificate_file");
      uVar4 = 0x7c;
    }
  }
  ERR_set_error(0x14,uVar4,0);
  iVar1 = 0;
LAB_009bb748:
  X509_free(local_38);
  BIO_free(bp);
  return iVar1;
}

