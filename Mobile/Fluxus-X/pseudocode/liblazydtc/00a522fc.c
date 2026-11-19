/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a522fc
 */

ENGINE_LOAD_KEY_PTR ENGINE_get_load_privkey_function(ENGINE *e)

{
  return *(ENGINE_LOAD_KEY_PTR *)(e + 0x78);
}

