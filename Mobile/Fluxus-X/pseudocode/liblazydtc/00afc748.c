/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc748
 */

void ISSUING_DIST_POINT_free(ISSUING_DIST_POINT *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7f890);
  return;
}

