/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf748
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_ONEREQ * OCSP_ONEREQ_new(void)

{
  OCSP_ONEREQ *pOVar1;
  
  pOVar1 = (OCSP_ONEREQ *)ASN1_item_new((ASN1_ITEM *)&DAT_00c79f68);
  return pOVar1;
}

