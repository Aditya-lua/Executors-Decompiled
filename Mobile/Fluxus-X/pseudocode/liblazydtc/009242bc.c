/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009242bc
 */

void FUN_009242bc(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  param_1[6] = param_2;
  param_1[7] = 0;
  param_1[4] = 0;
  param_1[5] = param_3;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  *(undefined4 *)(param_1 + 7) = param_4;
  return;
}

