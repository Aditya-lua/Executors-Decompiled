/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2a68
 */

void PKCS8_PRIV_KEY_INFO_free(PKCS8_PRIV_KEY_INFO *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c58a40);
  return;
}

