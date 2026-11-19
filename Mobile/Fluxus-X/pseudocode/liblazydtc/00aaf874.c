/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf874
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_RESPID * OCSP_RESPID_new(void)

{
  OCSP_RESPID *pOVar1;
  
  pOVar1 = (OCSP_RESPID *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a080);
  return pOVar1;
}

