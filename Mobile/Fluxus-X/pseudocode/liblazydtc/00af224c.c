/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af224c
 */

int X509_load_crl_file(X509_LOOKUP *ctx,char *file,int type)

{
  int iVar1;
  int iVar2;
  BIO_METHOD *type_00;
  BIO *bp;
  long lVar3;
  X509_CRL *x;
  ulong uVar4;
  undefined8 uVar5;
  
  type_00 = BIO_s_file();
  bp = BIO_new(type_00);
  if ((bp == (BIO *)0x0) || (lVar3 = BIO_ctrl(bp,0x6c,3,file), (int)lVar3 < 1)) {
    ERR_new();
    ERR_set_debug("crypto/x509/by_file.c",0xa9,"X509_load_crl_file");
    uVar5 = 0x80002;
    goto LAB_00af2338;
  }
  if (type == 2) {
    x = d2i_X509_CRL_bio(bp,(X509_CRL **)0x0);
    if (x == (X509_CRL *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/by_file.c",0xc5,"X509_load_crl_file");
      ERR_set_error(0xb,0x8000d,0);
LAB_00af2420:
      iVar2 = 0;
    }
    else {
      iVar2 = X509_STORE_add_crl(ctx->store_ctx,x);
    }
    goto LAB_00af2348;
  }
  if (type == 1) {
    x = PEM_read_bio_X509_CRL(bp,(X509_CRL **)0x0,(undefined1 *)0x0,&DAT_002ab32c);
    if (x == (X509_CRL *)0x0) {
      iVar2 = 0;
    }
    else {
      iVar2 = 0;
      do {
        iVar1 = X509_STORE_add_crl(ctx->store_ctx,x);
        if (iVar1 == 0) goto LAB_00af2420;
        iVar2 = iVar2 + 1;
        X509_CRL_free(x);
        x = PEM_read_bio_X509_CRL(bp,(X509_CRL **)0x0,(undefined1 *)0x0,&DAT_002ab32c);
      } while (x != (X509_CRL *)0x0);
    }
    uVar4 = ERR_peek_last_error();
    if ((iVar2 == 0) ||
       ((((int)(uint)uVar4 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar4) != 0x6c)) {
      ERR_new();
      ERR_set_debug("crypto/x509/by_file.c",0xb6,"X509_load_crl_file");
      uVar5 = 0x80009;
      goto LAB_00af2338;
    }
    ERR_clear_error();
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/x509/by_file.c",0xcd,"X509_load_crl_file");
    uVar5 = 100;
LAB_00af2338:
    ERR_set_error(0xb,uVar5,0);
    iVar2 = 0;
  }
  x = (X509_CRL *)0x0;
LAB_00af2348:
  X509_CRL_free(x);
  BIO_free(bp);
  return iVar2;
}

