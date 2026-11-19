/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925220
 */

void FUN_00925220(undefined8 *param_1)

{
  if ((param_1[1] != 0) && ((code *)*param_1 != (code *)0x0)) {
    (*(code *)*param_1)();
  }
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  return;
}

