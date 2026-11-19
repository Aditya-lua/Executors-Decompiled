/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf964
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_RESPDATA * OCSP_RESPDATA_new(void)

{
  OCSP_RESPDATA *pOVar1;
  
  pOVar1 = (OCSP_RESPDATA *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a160);
  return pOVar1;
}

