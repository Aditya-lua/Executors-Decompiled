/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8d930
 */

bool psa_custom_key_parameters_are_default(int *param_1,long param_2)

{
  return param_2 == 0 && *param_1 == 0;
}

