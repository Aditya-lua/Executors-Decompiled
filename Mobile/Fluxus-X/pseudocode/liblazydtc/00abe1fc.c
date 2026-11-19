/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe1fc
 */

void PKCS7_DIGEST_free(PKCS7_DIGEST *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7ba28);
  return;
}

