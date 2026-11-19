/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51724
 */

ENGINE_GEN_INT_FUNC_PTR ENGINE_get_destroy_function(ENGINE *e)

{
  return *(ENGINE_GEN_INT_FUNC_PTR *)(e + 0x58);
}

