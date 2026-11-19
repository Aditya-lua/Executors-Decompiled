/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4f14
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EDIPARTYNAME * EDIPARTYNAME_new(void)

{
  EDIPARTYNAME *pEVar1;
  
  pEVar1 = (EDIPARTYNAME *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e2c0);
  return pEVar1;
}

