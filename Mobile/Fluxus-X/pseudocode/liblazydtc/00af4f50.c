/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4f50
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

GENERAL_NAME * GENERAL_NAME_new(void)

{
  GENERAL_NAME *pGVar1;
  
  pGVar1 = (GENERAL_NAME *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e2f8);
  return pGVar1;
}

