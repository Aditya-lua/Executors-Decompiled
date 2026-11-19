/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf784
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_REQINFO * OCSP_REQINFO_new(void)

{
  OCSP_REQINFO *pOVar1;
  
  pOVar1 = (OCSP_REQINFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c79fa0);
  return pOVar1;
}

