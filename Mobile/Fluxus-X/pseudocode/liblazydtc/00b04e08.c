/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04e08
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

SXNETID * SXNETID_new(void)

{
  SXNETID *pSVar1;
  
  pSVar1 = (SXNETID *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80f90);
  return pSVar1;
}

