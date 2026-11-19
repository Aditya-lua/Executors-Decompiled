/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b17068
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

NETSCAPE_SPKAC * NETSCAPE_SPKAC_new(void)

{
  NETSCAPE_SPKAC *pNVar1;
  
  pNVar1 = (NETSCAPE_SPKAC *)ASN1_item_new((ASN1_ITEM *)&DAT_00c81e38);
  return pNVar1;
}

