/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851f20
 */

void FUN_00851f20(undefined4 *param_1,undefined8 param_2,undefined8 param_3)

{
  *(undefined8 *)(param_1 + 2) = param_2;
  *(undefined8 *)(param_1 + 4) = param_3;
  *param_1 = DAT_00d1ea20;
  return;
}

