/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afab8c
 */

void BASIC_CONSTRAINTS_free(BASIC_CONSTRAINTS *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7ee40);
  return;
}

