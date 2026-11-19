/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe148
 */

void PKCS7_ENC_CONTENT_free(PKCS7_ENC_CONTENT *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b980);
  return;
}

