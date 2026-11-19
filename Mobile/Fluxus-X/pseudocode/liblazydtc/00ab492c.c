/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab492c
 */

NETSCAPE_CERT_SEQUENCE *
PEM_read_NETSCAPE_CERT_SEQUENCE(FILE *fp,NETSCAPE_CERT_SEQUENCE **x,undefined1 *cb,void *u)

{
  NETSCAPE_CERT_SEQUENCE *pNVar1;
  
  pNVar1 = PEM_ASN1_read(d2i_NETSCAPE_CERT_SEQUENCE,"CERTIFICATE",fp,x,cb,u);
  return pNVar1;
}

