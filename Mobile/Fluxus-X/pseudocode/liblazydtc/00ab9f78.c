/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9f78
 */

X509 * PEM_read_X509(FILE *fp,X509 **x,undefined1 *cb,void *u)

{
  X509 *pXVar1;
  
  pXVar1 = PEM_ASN1_read(d2i_X509,"CERTIFICATE",fp,x,cb,u);
  return pXVar1;
}

