/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb78
 */

void * CONF_module_get_usr_data(CONF_MODULE *pmod)

{
  return *(void **)(pmod + 0x28);
}

