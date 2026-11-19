/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4824
 */

PKCS7 * PEM_read_bio_PKCS7(BIO *bp,PKCS7 **x,undefined1 *cb,void *u)

{
  PKCS7 *pPVar1;
  
  pPVar1 = PEM_ASN1_read_bio(d2i_PKCS7,"PKCS7",bp,x,cb,u);
  return pPVar1;
}

