/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afef3c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

GENERAL_SUBTREE * GENERAL_SUBTREE_new(void)

{
  GENERAL_SUBTREE *pGVar1;
  
  pGVar1 = (GENERAL_SUBTREE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c807a8);
  return pGVar1;
}

