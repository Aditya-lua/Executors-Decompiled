/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9634
 */

X509_SIG * PEM_read_PKCS8(FILE *fp,X509_SIG **x,undefined1 *cb,void *u)

{
  X509_SIG *pXVar1;
  
  pXVar1 = PEM_ASN1_read(d2i_X509_SIG,"ENCRYPTED PRIVATE KEY",fp,x,cb,u);
  return pXVar1;
}

