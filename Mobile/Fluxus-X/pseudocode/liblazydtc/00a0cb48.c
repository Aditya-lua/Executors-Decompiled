/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb48
 */

char * CONF_imodule_get_value(CONF_IMODULE *md)

{
  return *(char **)(md + 0x10);
}

