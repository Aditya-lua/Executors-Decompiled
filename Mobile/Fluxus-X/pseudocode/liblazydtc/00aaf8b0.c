/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf8b0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_REVOKEDINFO * OCSP_REVOKEDINFO_new(void)

{
  OCSP_REVOKEDINFO *pOVar1;
  
  pOVar1 = (OCSP_REVOKEDINFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a0b8);
  return pOVar1;
}

