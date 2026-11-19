/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe0e4
 */

void PROFESSION_INFO_set0_registrationNumber(long param_1,undefined8 param_2)

{
  ASN1_PRINTABLESTRING_free(*(ASN1_STRING **)(param_1 + 0x18));
  *(undefined8 *)(param_1 + 0x18) = param_2;
  return;
}

