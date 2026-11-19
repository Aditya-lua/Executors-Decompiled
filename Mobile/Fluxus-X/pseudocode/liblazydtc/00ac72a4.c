/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac72a4
 */

undefined8 ossl_property_get_string_value(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  
  if ((param_2 == 0) || (*(int *)(param_2 + 4) != 0)) {
    return 0;
  }
  uVar1 = ossl_property_value_str(param_1,*(undefined4 *)(param_2 + 0x10));
  return uVar1;
}

