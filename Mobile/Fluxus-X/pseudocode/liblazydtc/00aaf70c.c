/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf70c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_CERTID * OCSP_CERTID_new(void)

{
  OCSP_CERTID *pOVar1;
  
  pOVar1 = (OCSP_CERTID *)ASN1_item_new((ASN1_ITEM *)&DAT_00c79f30);
  return pOVar1;
}

