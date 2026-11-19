/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe184
 */

void PKCS7_SIGN_ENVELOPE_free(PKCS7_SIGN_ENVELOPE *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b9b8);
  return;
}

