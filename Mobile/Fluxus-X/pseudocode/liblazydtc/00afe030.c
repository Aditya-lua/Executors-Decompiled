/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe030
 */

void PROFESSION_INFO_set0_namingAuthority(undefined8 *param_1,undefined8 param_2)

{
  ASN1_item_free((ASN1_VALUE *)*param_1,(ASN1_ITEM *)&DAT_00c7fd70);
  *param_1 = param_2;
  return;
}

