/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afde78
 */

void NAMING_AUTHORITY_set0_authorityURL(long param_1,undefined8 param_2)

{
  ASN1_IA5STRING_free(*(ASN1_STRING **)(param_1 + 8));
  *(undefined8 *)(param_1 + 8) = param_2;
  return;
}

