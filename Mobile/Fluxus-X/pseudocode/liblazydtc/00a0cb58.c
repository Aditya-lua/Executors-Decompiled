/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb58
 */

void CONF_imodule_set_usr_data(CONF_IMODULE *md,void *usr_data)

{
  *(void **)(md + 0x20) = usr_data;
  return;
}

