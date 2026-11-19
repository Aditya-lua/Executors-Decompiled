/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe04c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_SIGNER_INFO * PKCS7_SIGNER_INFO_new(void)

{
  PKCS7_SIGNER_INFO *pPVar1;
  
  pPVar1 = (PKCS7_SIGNER_INFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b840);
  return pPVar1;
}

