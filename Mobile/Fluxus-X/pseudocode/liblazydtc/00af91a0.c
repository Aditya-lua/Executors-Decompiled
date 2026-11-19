/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af91a0
 */

void ASIdentifierChoice_free(ASIdentifierChoice *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7ebc0);
  return;
}

