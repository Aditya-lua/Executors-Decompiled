/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab484c
 */

PKCS7 * PEM_read_PKCS7(FILE *fp,PKCS7 **x,undefined1 *cb,void *u)

{
  PKCS7 *pPVar1;
  
  pPVar1 = PEM_ASN1_read(d2i_PKCS7,"PKCS7",fp,x,cb,u);
  return pPVar1;
}

