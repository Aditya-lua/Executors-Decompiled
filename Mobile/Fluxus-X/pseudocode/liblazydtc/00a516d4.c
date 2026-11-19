/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a516d4
 */

int ENGINE_set_finish_function(ENGINE *e,ENGINE_GEN_INT_FUNC_PTR finish_f)

{
  *(ENGINE_GEN_INT_FUNC_PTR *)(e + 0x68) = finish_f;
  return 1;
}

