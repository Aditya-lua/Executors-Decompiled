/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc6d0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DIST_POINT * DIST_POINT_new(void)

{
  DIST_POINT *pDVar1;
  
  pDVar1 = (DIST_POINT *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7f820);
  return pDVar1;
}

