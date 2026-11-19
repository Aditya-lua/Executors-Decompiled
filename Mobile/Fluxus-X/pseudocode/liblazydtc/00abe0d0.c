/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe0d0
 */

void PKCS7_ENVELOPE_free(PKCS7_ENVELOPE *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b8e0);
  return;
}

