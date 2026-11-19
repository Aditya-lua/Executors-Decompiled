/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2a44
 */

PKCS8_PRIV_KEY_INFO * d2i_PKCS8_PRIV_KEY_INFO(PKCS8_PRIV_KEY_INFO **a,uchar **in,long len)

{
  PKCS8_PRIV_KEY_INFO *pPVar1;
  
  pPVar1 = (PKCS8_PRIV_KEY_INFO *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58a40);
  return pPVar1;
}

