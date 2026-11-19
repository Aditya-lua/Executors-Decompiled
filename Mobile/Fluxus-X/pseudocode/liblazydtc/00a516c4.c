/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a516c4
 */

int ENGINE_set_init_function(ENGINE *e,ENGINE_GEN_INT_FUNC_PTR init_f)

{
  *(ENGINE_GEN_INT_FUNC_PTR *)(e + 0x60) = init_f;
  return 1;
}

