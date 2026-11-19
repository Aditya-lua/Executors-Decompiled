/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4ed8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OTHERNAME * OTHERNAME_new(void)

{
  OTHERNAME *pOVar1;
  
  pOVar1 = (OTHERNAME *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e288);
  return pOVar1;
}

