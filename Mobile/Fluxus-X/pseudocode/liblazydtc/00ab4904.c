/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4904
 */

NETSCAPE_CERT_SEQUENCE *
PEM_read_bio_NETSCAPE_CERT_SEQUENCE(BIO *bp,NETSCAPE_CERT_SEQUENCE **x,undefined1 *cb,void *u)

{
  NETSCAPE_CERT_SEQUENCE *pNVar1;
  
  pNVar1 = PEM_ASN1_read_bio(d2i_NETSCAPE_CERT_SEQUENCE,"CERTIFICATE",bp,x,cb,u);
  return pNVar1;
}

