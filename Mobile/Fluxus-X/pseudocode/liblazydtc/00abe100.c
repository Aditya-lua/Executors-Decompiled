/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe100
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_RECIP_INFO * PKCS7_RECIP_INFO_new(void)

{
  PKCS7_RECIP_INFO *pPVar1;
  
  pPVar1 = (PKCS7_RECIP_INFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b918);
  return pPVar1;
}

