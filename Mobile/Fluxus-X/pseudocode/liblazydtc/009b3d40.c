/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3d40
 */

int SSL_set_wfd(SSL *s,int fd)

{
  BIO *pBVar1;
  int iVar2;
  long lVar3;
  BIO_METHOD *type;
  BIO *b;
  BIO *pBVar4;
  
  pBVar4 = s->rbio;
  if (((pBVar4 == (BIO *)0x0) || (iVar2 = BIO_method_type(pBVar4), iVar2 != 0x505)) ||
     (lVar3 = BIO_ctrl(pBVar4,0x69,0,(void *)0x0), (int)lVar3 != fd)) {
    type = BIO_s_socket();
    pBVar4 = BIO_new(type);
    if (pBVar4 == (BIO *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x598,"SSL_set_wfd");
      ERR_set_error(0x14,0x80007,0);
      return 0;
    }
    BIO_int_ctrl(pBVar4,0x68,0,fd);
    b = s->wbio;
    pBVar1 = s->bbio;
  }
  else {
    BIO_up_ref(pBVar4);
    b = s->wbio;
    pBVar1 = s->bbio;
  }
  if (pBVar1 != (BIO *)0x0) {
    b = BIO_pop(b);
    s->wbio = b;
  }
  BIO_free_all(b);
  s->wbio = pBVar4;
  if (s->bbio != (BIO *)0x0) {
    pBVar4 = BIO_push(s->bbio,pBVar4);
    s->wbio = pBVar4;
  }
  return 1;
}

