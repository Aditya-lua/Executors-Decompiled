/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab96ec
 */

PKCS8_PRIV_KEY_INFO *
PEM_read_bio_PKCS8_PRIV_KEY_INFO(BIO *bp,PKCS8_PRIV_KEY_INFO **x,undefined1 *cb,void *u)

{
  PKCS8_PRIV_KEY_INFO *pPVar1;
  
  pPVar1 = PEM_ASN1_read_bio(d2i_PKCS8_PRIV_KEY_INFO,"PRIVATE KEY",bp,x,cb,u);
  return pPVar1;
}

