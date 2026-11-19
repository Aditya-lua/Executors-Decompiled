/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe0c4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_ENVELOPE * PKCS7_ENVELOPE_new(void)

{
  PKCS7_ENVELOPE *pPVar1;
  
  pPVar1 = (PKCS7_ENVELOPE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b8e0);
  return pPVar1;
}

