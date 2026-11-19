/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee920
 */

int UI_get_result_string_length(int *param_1)

{
  if (*param_1 - 1U < 2) {
    return param_1[8];
  }
  return -1;
}

