/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0dbc8
 */

void OPENSSL_INIT_free(undefined8 *param_1)

{
  free((void *)*param_1);
  free((void *)param_1[1]);
  free(param_1);
  return;
}

