/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb80
 */

void CONF_module_set_usr_data(CONF_MODULE *pmod,void *usr_data)

{
  *(void **)(pmod + 0x28) = usr_data;
  return;
}

