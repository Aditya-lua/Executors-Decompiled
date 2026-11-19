/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f6b0
 */

void psa_generate_key_ext(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  psa_generate_key_custom(param_1,param_2,param_2 + 4,param_3,param_4);
  return;
}

