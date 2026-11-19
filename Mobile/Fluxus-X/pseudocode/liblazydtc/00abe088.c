/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe088
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_ISSUER_AND_SERIAL * PKCS7_ISSUER_AND_SERIAL_new(void)

{
  PKCS7_ISSUER_AND_SERIAL *pPVar1;
  
  pPVar1 = (PKCS7_ISSUER_AND_SERIAL *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b8a8);
  return pPVar1;
}

