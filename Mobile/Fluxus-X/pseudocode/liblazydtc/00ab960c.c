/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab960c
 */

X509_SIG * PEM_read_bio_PKCS8(BIO *bp,X509_SIG **x,undefined1 *cb,void *u)

{
  X509_SIG *pXVar1;
  
  pXVar1 = PEM_ASN1_read_bio(d2i_X509_SIG,"ENCRYPTED PRIVATE KEY",bp,x,cb,u);
  return pXVar1;
}

