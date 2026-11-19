/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba134
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS12 * PKCS12_new(void)

{
  PKCS12 *pPVar1;
  
  pPVar1 = (PKCS12 *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b088);
  return pPVar1;
}

