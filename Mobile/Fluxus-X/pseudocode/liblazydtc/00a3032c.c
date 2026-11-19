/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3032c
 */

void EC_pre_comp_free(long param_1)

{
  if (*(int *)(param_1 + 0x98) == 5) {
    EC_ec_pre_comp_free(*(undefined8 *)(param_1 + 0xa0));
  }
  *(undefined8 *)(param_1 + 0xa0) = 0;
  return;
}

