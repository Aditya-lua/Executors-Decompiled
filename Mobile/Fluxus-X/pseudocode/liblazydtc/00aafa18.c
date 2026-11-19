/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafa18
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_SERVICELOC * OCSP_SERVICELOC_new(void)

{
  OCSP_SERVICELOC *pOVar1;
  
  pOVar1 = (OCSP_SERVICELOC *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a208);
  return pOVar1;
}

