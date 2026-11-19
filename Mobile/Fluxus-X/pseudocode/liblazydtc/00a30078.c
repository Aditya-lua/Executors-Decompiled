/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30078
 */

void EC_KEY_METHOD_set_init
               (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  *(undefined8 *)(param_1 + 0x10) = param_2;
  *(undefined8 *)(param_1 + 0x18) = param_3;
  *(undefined8 *)(param_1 + 0x20) = param_4;
  *(undefined8 *)(param_1 + 0x28) = param_5;
  *(undefined8 *)(param_1 + 0x30) = param_6;
  *(undefined8 *)(param_1 + 0x38) = param_7;
  return;
}

