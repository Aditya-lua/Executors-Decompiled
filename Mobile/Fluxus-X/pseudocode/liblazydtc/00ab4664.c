/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4664
 */

X509_CRL * PEM_read_bio_X509_CRL(BIO *bp,X509_CRL **x,undefined1 *cb,void *u)

{
  X509_CRL *pXVar1;
  
  pXVar1 = PEM_ASN1_read_bio(d2i_X509_CRL,"X509 CRL",bp,x,cb,u);
  return pXVar1;
}

