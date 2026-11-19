/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af564c
 */

void ACCESS_DESCRIPTION_free(ACCESS_DESCRIPTION *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7e668);
  return;
}

