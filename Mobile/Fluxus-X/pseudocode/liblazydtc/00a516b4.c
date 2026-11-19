/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a516b4
 */

int ENGINE_set_destroy_function(ENGINE *e,ENGINE_GEN_INT_FUNC_PTR destroy_f)

{
  *(ENGINE_GEN_INT_FUNC_PTR *)(e + 0x58) = destroy_f;
  return 1;
}

