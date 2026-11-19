/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3b40
 */

void FUN_008e3b40(long param_1,undefined8 param_2)

{
  FUN_008e3f88();
  *(undefined4 *)(param_1 + 0x30) = 0;
  *(undefined8 *)(param_1 + 0x28) = param_2;
  return;
}

