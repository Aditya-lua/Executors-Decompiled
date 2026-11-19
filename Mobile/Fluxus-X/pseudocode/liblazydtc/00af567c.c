/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af567c
 */

void AUTHORITY_INFO_ACCESS_free(AUTHORITY_INFO_ACCESS *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7e6a0);
  return;
}

