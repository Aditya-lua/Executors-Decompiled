/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0dcd8
 */

bool FUN_00a0dcd8(CONF *param_1)

{
  if (param_1 != (CONF *)0x0) {
    _CONF_free_data(param_1);
  }
  return param_1 != (CONF *)0x0;
}

