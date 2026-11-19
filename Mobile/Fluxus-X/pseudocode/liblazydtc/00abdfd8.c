/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abdfd8
 */

PKCS7 * PKCS7_dup(PKCS7 *p7)

{
  PKCS7 *pPVar1;
  
  pPVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c7b7a0,p7);
  return pPVar1;
}

