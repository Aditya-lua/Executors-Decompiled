/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf7c0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_REQUEST * OCSP_REQUEST_new(void)

{
  OCSP_REQUEST *pOVar1;
  
  pOVar1 = (OCSP_REQUEST *)ASN1_item_new((ASN1_ITEM *)&DAT_00c79fd8);
  return pOVar1;
}

