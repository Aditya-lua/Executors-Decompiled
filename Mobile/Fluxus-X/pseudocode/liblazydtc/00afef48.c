/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afef48
 */

void GENERAL_SUBTREE_free(GENERAL_SUBTREE *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c807a8);
  return;
}

