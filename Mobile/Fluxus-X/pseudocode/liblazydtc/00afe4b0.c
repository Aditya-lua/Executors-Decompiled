/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe4b0
 */

void EXTENDED_KEY_USAGE_free(EXTENDED_KEY_USAGE *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c80190);
  return;
}

