/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abdebc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7 * PKCS7_new(void)

{
  PKCS7 *pPVar1;
  
  pPVar1 = (PKCS7 *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b7a0);
  return pPVar1;
}

