/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3ba4
 */

BIO * SSL_get_wbio(SSL *s)

{
  BIO *pBVar1;
  
  if (s->bbio == (BIO *)0x0) {
    return s->wbio;
  }
  pBVar1 = BIO_next(s->bbio);
  return pBVar1;
}

