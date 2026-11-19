/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb8f4
 */

void POLICYQUALINFO_free(POLICYQUALINFO *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7efa0);
  return;
}

