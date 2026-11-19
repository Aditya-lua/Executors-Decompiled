/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092525c
 */

void FUN_0092525c(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  if ((param_1[1] != 0) && ((code *)*param_1 != (code *)0x0)) {
    (*(code *)*param_1)();
  }
  *param_1 = param_4;
  param_1[1] = param_2;
  param_1[2] = param_3;
  return;
}

