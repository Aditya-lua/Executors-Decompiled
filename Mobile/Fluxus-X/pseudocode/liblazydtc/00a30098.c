/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30098
 */

void EC_KEY_METHOD_set_sign(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  *(undefined8 *)(param_1 + 0x50) = param_2;
  *(undefined8 *)(param_1 + 0x58) = param_3;
  *(undefined8 *)(param_1 + 0x60) = param_4;
  return;
}

