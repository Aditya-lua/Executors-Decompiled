/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13ec8
 */

void SCT_set_timestamp(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x28) = param_2;
  *(undefined4 *)(param_1 + 0x60) = 0;
  return;
}

