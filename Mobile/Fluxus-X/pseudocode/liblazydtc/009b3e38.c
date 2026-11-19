/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3e38
 */

int SSL_set_rfd(SSL *s,int fd)

{
  int iVar1;
  BIO *b;
  long lVar2;
  BIO_METHOD *type;
  
  if (s->bbio == (BIO *)0x0) {
    b = s->wbio;
  }
  else {
    b = BIO_next(s->bbio);
  }
  if (((b == (BIO *)0x0) || (iVar1 = BIO_method_type(b), iVar1 != 0x505)) ||
     (lVar2 = BIO_ctrl(b,0x69,0,(void *)0x0), (int)lVar2 != fd)) {
    type = BIO_s_socket();
    b = BIO_new(type);
    if (b == (BIO *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x5b6,"SSL_set_rfd");
      ERR_set_error(0x14,0x80007,0);
      return 0;
    }
    BIO_int_ctrl(b,0x68,0,fd);
  }
  else {
    BIO_up_ref(b);
  }
  BIO_free_all(s->rbio);
  s->rbio = b;
  return 1;
}

