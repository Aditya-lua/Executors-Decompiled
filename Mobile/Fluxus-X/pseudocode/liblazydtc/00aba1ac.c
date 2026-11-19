/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba1ac
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS12_BAGS * PKCS12_BAGS_new(void)

{
  PKCS12_BAGS *pPVar1;
  
  pPVar1 = (PKCS12_BAGS *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b0f8);
  return pPVar1;
}

