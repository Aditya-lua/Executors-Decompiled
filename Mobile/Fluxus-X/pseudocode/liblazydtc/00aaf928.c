/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf928
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

OCSP_SINGLERESP * OCSP_SINGLERESP_new(void)

{
  OCSP_SINGLERESP *pOVar1;
  
  pOVar1 = (OCSP_SINGLERESP *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7a128);
  return pOVar1;
}

