/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afef54
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

NAME_CONSTRAINTS * NAME_CONSTRAINTS_new(void)

{
  NAME_CONSTRAINTS *pNVar1;
  
  pNVar1 = (NAME_CONSTRAINTS *)ASN1_item_new((ASN1_ITEM *)&DAT_00c807e0);
  return pNVar1;
}

