/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02e3c
 */

uint BN_is_odd(undefined8 *param_1)

{
  if (*(int *)(param_1 + 1) < 1) {
    return 0;
  }
  return *(uint *)*param_1 & 1;
}

