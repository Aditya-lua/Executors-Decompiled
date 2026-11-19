/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5173c
 */

ENGINE_CTRL_FUNC_PTR ENGINE_get_ctrl_function(ENGINE *e)

{
  return *(ENGINE_CTRL_FUNC_PTR *)(e + 0x70);
}

