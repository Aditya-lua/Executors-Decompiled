/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf838
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_RESPONSE * OCSP_RESPONSE_new(void)

{
  OCSP_RESPONSE *pOVar1;
  
  pOVar1 = (OCSP_RESPONSE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a048);
  return pOVar1;
}

