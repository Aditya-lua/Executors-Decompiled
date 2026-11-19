/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5640
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ACCESS_DESCRIPTION * ACCESS_DESCRIPTION_new(void)

{
  ACCESS_DESCRIPTION *pAVar1;
  
  pAVar1 = (ACCESS_DESCRIPTION *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7e668);
  return pAVar1;
}

