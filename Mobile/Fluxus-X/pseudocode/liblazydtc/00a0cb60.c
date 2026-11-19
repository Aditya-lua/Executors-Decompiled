/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb60
 */

CONF_MODULE * CONF_imodule_get_module(CONF_IMODULE *md)

{
  return *(CONF_MODULE **)md;
}

