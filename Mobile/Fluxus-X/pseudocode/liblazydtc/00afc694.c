/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc694
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DIST_POINT_NAME * DIST_POINT_NAME_new(void)

{
  DIST_POINT_NAME *pDVar1;
  
  pDVar1 = (DIST_POINT_NAME *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7f7b8);
  return pDVar1;
}

