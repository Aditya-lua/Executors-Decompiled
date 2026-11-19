/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf8ec
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_CERTSTATUS * OCSP_CERTSTATUS_new(void)

{
  OCSP_CERTSTATUS *pOVar1;
  
  pOVar1 = (OCSP_CERTSTATUS *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a0f0);
  return pOVar1;
}

