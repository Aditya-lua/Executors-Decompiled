/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf7fc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_RESPBYTES * OCSP_RESPBYTES_new(void)

{
  OCSP_RESPBYTES *pOVar1;
  
  pOVar1 = (OCSP_RESPBYTES *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a010);
  return pOVar1;
}

