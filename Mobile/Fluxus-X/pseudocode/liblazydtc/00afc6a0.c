/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc6a0
 */

void DIST_POINT_NAME_free(DIST_POINT_NAME *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7f7b8);
  return;
}

