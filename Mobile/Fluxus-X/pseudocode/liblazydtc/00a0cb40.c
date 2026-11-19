/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb40
 */

char * CONF_imodule_get_name(CONF_IMODULE *md)

{
  return *(char **)(md + 8);
}

