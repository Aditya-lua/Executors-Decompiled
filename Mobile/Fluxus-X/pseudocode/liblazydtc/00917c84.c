/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00917c84
 */

void FUN_00917c84(long param_1,undefined8 param_2)

{
  if (param_1 == 0) {
    FUN_009168c8(param_2);
    return;
  }
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f628(param_1,3,2);
  }
  FUN_009168c8(param_2);
  if (*(long *)(param_1 + 0xd0) == 0) {
    return;
  }
  FUN_0093f680(param_1,3);
  return;
}

