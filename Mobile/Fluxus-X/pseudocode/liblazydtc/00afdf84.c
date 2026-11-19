/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afdf84
 */

void ADMISSIONS_set0_namingAuthority(long param_1,undefined8 param_2)

{
  ASN1_item_free(*(ASN1_VALUE **)(param_1 + 8),(ASN1_ITEM *)&DAT_00c7fd70);
  *(undefined8 *)(param_1 + 8) = param_2;
  return;
}

