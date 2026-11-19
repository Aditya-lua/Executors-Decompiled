/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009beb04
 */

int SSL_set_session_ticket_ext(SSL *s,void *ext_data,int ext_len)

{
  int iVar1;
  BIO *pBVar2;
  
  iVar1 = 0;
  if (0x300 < s->version) {
    CRYPTO_free(s[4].bbio);
    s[4].bbio = (BIO *)0x0;
    pBVar2 = CRYPTO_malloc(ext_len + 0x10,"ssl/ssl_sess.c",0x478);
    s[4].bbio = pBVar2;
    if (pBVar2 == (BIO *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_sess.c",0x47a,"SSL_set_session_ticket_ext");
      ERR_set_error(0x14,0xc0100,0);
      iVar1 = 0;
    }
    else {
      if (ext_data == (void *)0x0) {
        *(undefined2 *)&pBVar2->method = 0;
        pBVar2->callback = (_func_603 *)0x0;
      }
      else {
        *(short *)&pBVar2->method = (short)ext_len;
        pBVar2->callback = (_func_603 *)&pBVar2->cb_arg;
        memcpy(&pBVar2->cb_arg,ext_data,(long)ext_len);
      }
      iVar1 = 1;
    }
  }
  return iVar1;
}

