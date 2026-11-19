/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe1b4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKCS7_ENCRYPT * PKCS7_ENCRYPT_new(void)

{
  PKCS7_ENCRYPT *pPVar1;
  
  pPVar1 = (PKCS7_ENCRYPT *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7b9f0);
  return pPVar1;
}

