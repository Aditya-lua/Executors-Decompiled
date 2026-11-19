/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008521c8
 */

void FUN_008521c8(undefined4 *param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 1) = param_2;
  *param_1 = DAT_00d1eb90;
  return;
}

