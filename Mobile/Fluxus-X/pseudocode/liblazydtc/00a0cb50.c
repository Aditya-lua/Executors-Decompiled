/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb50
 */

void * CONF_imodule_get_usr_data(CONF_IMODULE *md)

{
  return *(void **)(md + 0x20);
}

