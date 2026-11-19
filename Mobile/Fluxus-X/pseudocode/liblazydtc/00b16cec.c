/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16cec
 */

PKCS8_PRIV_KEY_INFO * d2i_PKCS8_PRIV_KEY_INFO_bio(BIO *bp,PKCS8_PRIV_KEY_INFO **p8inf)

{
  PKCS8_PRIV_KEY_INFO *pPVar1;
  
  pPVar1 = ASN1_d2i_bio(PKCS8_PRIV_KEY_INFO_new,d2i_PKCS8_PRIV_KEY_INFO,bp,p8inf);
  return pPVar1;
}

