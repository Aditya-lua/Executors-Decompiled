/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53b4c
 */

ENGINE_PKEY_METHS_PTR ENGINE_get_pkey_meths(ENGINE *e)

{
  return *(ENGINE_PKEY_METHS_PTR *)(e + 0x48);
}

