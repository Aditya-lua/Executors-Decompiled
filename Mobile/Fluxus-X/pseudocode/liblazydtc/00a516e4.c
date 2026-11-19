/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a516e4
 */

int ENGINE_set_ctrl_function(ENGINE *e,ENGINE_CTRL_FUNC_PTR ctrl_f)

{
  *(ENGINE_CTRL_FUNC_PTR *)(e + 0x70) = ctrl_f;
  return 1;
}

