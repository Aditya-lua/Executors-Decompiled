/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53b54
 */

int ENGINE_set_pkey_meths(ENGINE *e,ENGINE_PKEY_METHS_PTR f)

{
  *(ENGINE_PKEY_METHS_PTR *)(e + 0x48) = f;
  return 1;
}

