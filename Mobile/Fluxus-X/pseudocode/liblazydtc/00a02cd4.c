/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02cd4
 */

bool BN_abs_is_word(undefined8 *param_1,long param_2)

{
  if ((*(int *)(param_1 + 1) == 1) && (*(long *)*param_1 == param_2)) {
    return true;
  }
  if (param_2 == 0) {
    return *(int *)(param_1 + 1) == 0;
  }
  return false;
}

