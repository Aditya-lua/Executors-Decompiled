/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb924
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

USERNOTICE * USERNOTICE_new(void)

{
  USERNOTICE *pUVar1;
  
  pUVar1 = (USERNOTICE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7efd8);
  return pUVar1;
}

