/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc700
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

CRL_DIST_POINTS * CRL_DIST_POINTS_new(void)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7f858);
  return (CRL_DIST_POINTS *)pAVar1;
}

