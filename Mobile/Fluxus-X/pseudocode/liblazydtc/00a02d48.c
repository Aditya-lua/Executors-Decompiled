/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02d48
 */

bool BN_is_word(undefined8 *param_1,long param_2)

{
  if ((*(int *)(param_1 + 1) == 1) && (*(long *)*param_1 == param_2)) {
    if (param_2 == 0) {
      return true;
    }
    return *(int *)(param_1 + 2) == 0;
  }
  if (param_2 == 0) {
    return *(int *)(param_1 + 1) == 0;
  }
  return false;
}

