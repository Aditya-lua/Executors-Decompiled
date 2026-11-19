/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afdffc
 */

void PROFESSION_INFO_set0_addProfessionInfo(long param_1,undefined8 param_2)

{
  ASN1_OCTET_STRING_free(*(ASN1_STRING **)(param_1 + 0x20));
  *(undefined8 *)(param_1 + 0x20) = param_2;
  return;
}

