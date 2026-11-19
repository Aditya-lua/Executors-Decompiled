/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8796c
 */

void psa_crypto_local_input_free(undefined8 *param_1)

{
  free((void *)*param_1);
  *param_1 = 0;
  param_1[1] = 0;
  return;
}

