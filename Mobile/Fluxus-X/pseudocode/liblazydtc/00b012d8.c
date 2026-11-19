/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b012d8
 */

void PKEY_USAGE_PERIOD_free(PKEY_USAGE_PERIOD *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c80bb0);
  return;
}

