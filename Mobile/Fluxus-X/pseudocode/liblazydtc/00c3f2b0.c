/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f2b0
 */

PKCS8_PRIV_KEY_INFO * PKCS8_decrypt(X509_SIG *p8,char *pass,int passlen)

{
  PKCS8_PRIV_KEY_INFO *pPVar1;
  
  pPVar1 = PKCS8_decrypt(p8,pass,passlen);
  return pPVar1;
}

