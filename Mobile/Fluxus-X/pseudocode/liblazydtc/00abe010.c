/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe010
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_SIGNED * PKCS7_SIGNED_new(void)

{
  PKCS7_SIGNED *pPVar1;
  
  pPVar1 = (PKCS7_SIGNED *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b808);
  return pPVar1;
}

