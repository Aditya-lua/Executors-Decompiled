/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeee24
 */

undefined8 UI_method_set_data_duplicator(long param_1,undefined8 param_2,undefined8 param_3)

{
  if (param_1 == 0) {
    return 0xffffffff;
  }
  *(undefined8 *)(param_1 + 0x30) = param_2;
  *(undefined8 *)(param_1 + 0x38) = param_3;
  return 0;
}

