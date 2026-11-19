/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8d0d8
 */

undefined8 psa_key_derivation_set_capacity(int *param_1,ulong param_2)

{
  if (*param_1 == 0) {
    return 0xffffff77;
  }
  if (*(ulong *)(param_1 + 2) < param_2) {
    return 0xffffff79;
  }
  *(ulong *)(param_1 + 2) = param_2;
  return 0;
}

