/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf6d0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_SIGNATURE * OCSP_SIGNATURE_new(void)

{
  OCSP_SIGNATURE *pOVar1;
  
  pOVar1 = (OCSP_SIGNATURE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c79ef8);
  return pOVar1;
}

