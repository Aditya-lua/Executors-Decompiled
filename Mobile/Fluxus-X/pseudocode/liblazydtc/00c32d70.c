/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32d70
 */

PKCS12 * d2i_PKCS12_bio(BIO *bp,PKCS12 **p12)

{
  PKCS12 *pPVar1;
  
  pPVar1 = d2i_PKCS12_bio(bp,p12);
  return pPVar1;
}

