/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bee70
 */

SSL_SESSION * PEM_read_bio_SSL_SESSION(BIO *bp,SSL_SESSION **x,undefined1 *cb,void *u)

{
  SSL_SESSION *pSVar1;
  
  pSVar1 = PEM_ASN1_read_bio(d2i_SSL_SESSION,"SSL SESSION PARAMETERS",bp,x,cb,u);
  return pSVar1;
}

