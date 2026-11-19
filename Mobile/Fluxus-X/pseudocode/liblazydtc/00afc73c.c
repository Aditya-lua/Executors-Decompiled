/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc73c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ISSUING_DIST_POINT * ISSUING_DIST_POINT_new(void)

{
  ISSUING_DIST_POINT *pIVar1;
  
  pIVar1 = (ISSUING_DIST_POINT *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7f890);
  return pIVar1;
}

