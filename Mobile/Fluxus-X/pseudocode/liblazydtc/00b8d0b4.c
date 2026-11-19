/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8d0b4
 */

undefined8 psa_key_derivation_get_capacity(int *param_1,undefined8 *param_2)

{
  if (*param_1 == 0) {
    return 0xffffff77;
  }
  *param_2 = *(undefined8 *)(param_1 + 2);
  return 0;
}

