/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe13c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_ENC_CONTENT * PKCS7_ENC_CONTENT_new(void)

{
  PKCS7_ENC_CONTENT *pPVar1;
  
  pPVar1 = (PKCS7_ENC_CONTENT *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b980);
  return pPVar1;
}

