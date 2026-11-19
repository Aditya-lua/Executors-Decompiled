/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb87c
 */

void CERTIFICATEPOLICIES_free(CERTIFICATEPOLICIES *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7ef30);
  return;
}

