/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29234
 */

/* operator delete(void*) */

void operator_delete(void *param_1)

{
  free(param_1);
  return;
}

