/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe1f0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_DIGEST * PKCS7_DIGEST_new(void)

{
  PKCS7_DIGEST *pPVar1;
  
  pPVar1 = (PKCS7_DIGEST *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7ba28);
  return pPVar1;
}

