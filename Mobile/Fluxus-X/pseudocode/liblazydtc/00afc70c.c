/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc70c
 */

void CRL_DIST_POINTS_free(CRL_DIST_POINTS *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7f858);
  return;
}

