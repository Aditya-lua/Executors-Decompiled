/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac72c0
 */

undefined8 ossl_property_get_number_value(long param_1)

{
  undefined8 uVar1;
  
  if (param_1 == 0) {
    return 0;
  }
  uVar1 = 0;
  if (*(int *)(param_1 + 4) == 1) {
    uVar1 = *(undefined8 *)(param_1 + 0x10);
  }
  return uVar1;
}

