/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3a80
 */

void SSL_set_bio(SSL *s,BIO *rbio,BIO *wbio)

{
  BIO *pBVar1;
  BIO *pBVar2;
  
  if (s->rbio == rbio) {
    if (s->bbio == (BIO *)0x0) {
      pBVar1 = s->wbio;
    }
    else {
      pBVar1 = BIO_next(s->bbio);
    }
    if (pBVar1 == wbio) {
      return;
    }
  }
  if ((rbio != (BIO *)0x0) && (rbio == wbio)) {
    BIO_up_ref(rbio);
  }
  pBVar1 = s->bbio;
  if (s->rbio == rbio) {
    pBVar2 = s->wbio;
  }
  else {
    if (pBVar1 == (BIO *)0x0) {
      pBVar1 = s->wbio;
    }
    else {
      pBVar1 = BIO_next(pBVar1);
    }
    if (pBVar1 == wbio) {
      pBVar1 = s->rbio;
      if (s->bbio == (BIO *)0x0) {
        pBVar2 = s->wbio;
      }
      else {
        pBVar2 = BIO_next(s->bbio);
      }
      if (pBVar1 != pBVar2) {
        BIO_free_all(s->rbio);
        s->rbio = rbio;
        return;
      }
    }
    BIO_free_all(s->rbio);
    pBVar2 = s->wbio;
    pBVar1 = s->bbio;
    s->rbio = rbio;
  }
  if (pBVar1 != (BIO *)0x0) {
    pBVar2 = BIO_pop(pBVar2);
    s->wbio = pBVar2;
  }
  BIO_free_all(pBVar2);
  s->wbio = wbio;
  if (s->bbio != (BIO *)0x0) {
    pBVar1 = BIO_push(s->bbio,wbio);
    s->wbio = pBVar1;
  }
  return;
}

