/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af91d0
 */

void ASIdentifiers_free(ASIdentifiers *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7ebf8);
  return;
}

