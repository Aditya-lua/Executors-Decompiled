/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afef60
 */

void NAME_CONSTRAINTS_free(NAME_CONSTRAINTS *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c807e0);
  return;
}

