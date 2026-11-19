/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bee98
 */

SSL_SESSION * PEM_read_SSL_SESSION(FILE *fp,SSL_SESSION **x,undefined1 *cb,void *u)

{
  SSL_SESSION *pSVar1;
  
  pSVar1 = PEM_ASN1_read(d2i_SSL_SESSION,"SSL SESSION PARAMETERS",fp,x,cb,u);
  return pSVar1;
}

