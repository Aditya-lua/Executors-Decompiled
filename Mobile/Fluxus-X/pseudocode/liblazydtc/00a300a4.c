/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a300a4
 */

void EC_KEY_METHOD_set_verify(long param_1,undefined8 param_2,undefined8 param_3)

{
  *(undefined8 *)(param_1 + 0x68) = param_2;
  *(undefined8 *)(param_1 + 0x70) = param_3;
  return;
}

