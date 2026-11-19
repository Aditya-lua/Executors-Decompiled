/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3dd4
 */

/* ix::SocketOpenSSL::openSSLAddCARootsFromString(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >) */

byte __thiscall ix::SocketOpenSSL::openSSLAddCARootsFromString(SocketOpenSSL *this,byte *param_2)

{
  byte bVar1;
  int iVar2;
  X509_STORE *ctx;
  byte *buf;
  BIO *bp;
  X509 *x;
  ulong uVar3;
  uint len;
  long lVar4;
  
  ctx = SSL_CTX_get_cert_store(*(SSL_CTX **)(this + 0x48));
  bVar1 = 0;
  if (ctx != (X509_STORE *)0x0) {
    X509_STORE_set_flags(ctx,0x88000);
    if ((*param_2 & 1) == 0) {
      buf = param_2 + 1;
      len = (uint)(*param_2 >> 1);
    }
    else {
      len = (uint)*(undefined8 *)(param_2 + 8);
      buf = *(byte **)(param_2 + 0x10);
    }
    bp = BIO_new_mem_buf(buf,len);
    bVar1 = 0;
    if (bp != (BIO *)0x0) {
      x = PEM_read_bio_X509_AUX(bp,(X509 **)0x0,(undefined1 *)0x0,&DAT_002ab32c);
      ERR_clear_error();
      lVar4 = 0;
      while (x != (X509 *)0x0) {
        iVar2 = X509_STORE_add_cert(ctx,x);
        if ((iVar2 == 0) &&
           ((uVar3 = ERR_get_error(), (uVar3 & 0xff800000) != 0x5800000 ||
            ((((int)(uint)uVar3 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar3) != 0x65)))) {
          X509_free(x);
          bVar1 = 0;
          goto LAB_009a3edc;
        }
        X509_free(x);
        lVar4 = lVar4 + 1;
        x = PEM_read_bio_X509_AUX(bp,(X509 **)0x0,(undefined1 *)0x0,&DAT_002ab32c);
        ERR_clear_error();
      }
      bVar1 = 1;
LAB_009a3edc:
      BIO_free(bp);
      bVar1 = lVar4 != 0 & bVar1;
    }
  }
  return bVar1;
}

