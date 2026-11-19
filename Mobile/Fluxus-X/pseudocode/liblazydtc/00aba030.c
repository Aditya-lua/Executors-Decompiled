/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba030
 */

X509 * PEM_read_bio_X509_AUX(BIO *bp,X509 **x,undefined1 *cb,void *u)

{
  X509 *pXVar1;
  
  pXVar1 = PEM_ASN1_read_bio(d2i_X509_AUX,"TRUSTED CERTIFICATE",bp,x,cb,u);
  return pXVar1;
}

