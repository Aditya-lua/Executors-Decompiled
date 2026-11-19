/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb43c
 */

PKCS8_PRIV_KEY_INFO * PKCS12_decrypt_skey(PKCS12_SAFEBAG *bag,char *pass,int passlen)

{
  PKCS8_PRIV_KEY_INFO *pPVar1;
  
  pPVar1 = (PKCS8_PRIV_KEY_INFO *)PKCS8_decrypt_ex((bag->value).bag,pass,passlen,0,0);
  return pPVar1;
}

