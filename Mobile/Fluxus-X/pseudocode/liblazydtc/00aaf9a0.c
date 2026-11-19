/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf9a0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_BASICRESP * OCSP_BASICRESP_new(void)

{
  OCSP_BASICRESP *pOVar1;
  
  pOVar1 = (OCSP_BASICRESP *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a198);
  return pOVar1;
}

