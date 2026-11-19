/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a522cc
 */

int ENGINE_set_load_privkey_function(ENGINE *e,ENGINE_LOAD_KEY_PTR loadpriv_f)

{
  *(ENGINE_LOAD_KEY_PTR *)(e + 0x78) = loadpriv_f;
  return 1;
}

