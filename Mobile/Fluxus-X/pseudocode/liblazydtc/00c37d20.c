/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37d20
 */

PKCS8_PRIV_KEY_INFO * d2i_PKCS8_PRIV_KEY_INFO(PKCS8_PRIV_KEY_INFO **a,uchar **in,long len)

{
  PKCS8_PRIV_KEY_INFO *pPVar1;
  
  pPVar1 = d2i_PKCS8_PRIV_KEY_INFO(a,in,len);
  return pPVar1;
}

