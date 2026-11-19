/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3c4c
 */

int SSL_get_wfd(SSL *s)

{
  BIO *pBVar1;
  int local_14;
  
  local_14 = -1;
  if (s->bbio == (BIO *)0x0) {
    pBVar1 = s->wbio;
  }
  else {
    pBVar1 = BIO_next(s->bbio);
  }
  pBVar1 = BIO_find_type(pBVar1,0x100);
  if (pBVar1 == (BIO *)0x0) {
    local_14 = -1;
  }
  else {
    BIO_ctrl(pBVar1,0x69,0,&local_14);
  }
  return local_14;
}

