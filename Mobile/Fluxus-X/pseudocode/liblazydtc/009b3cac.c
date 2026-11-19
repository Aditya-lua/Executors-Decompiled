/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3cac
 */

int SSL_set_fd(SSL *s,int fd)

{
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_socket();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x57c,"SSL_set_fd");
    ERR_set_error(0x14,0x80007,0);
  }
  else {
    BIO_int_ctrl(bp,0x68,0,fd);
    SSL_set_bio(s,bp,bp);
  }
  return (int)(bp != (BIO *)0x0);
}

