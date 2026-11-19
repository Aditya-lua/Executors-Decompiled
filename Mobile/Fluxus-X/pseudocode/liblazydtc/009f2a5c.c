/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2a5c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS8_PRIV_KEY_INFO * PKCS8_PRIV_KEY_INFO_new(void)

{
  PKCS8_PRIV_KEY_INFO *pPVar1;
  
  pPVar1 = (PKCS8_PRIV_KEY_INFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c58a40);
  return pPVar1;
}

