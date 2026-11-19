/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851f8c
 */

void FUN_00851f8c(undefined4 *param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 1) = param_2;
  *param_1 = DAT_00d1ea60;
  return;
}

