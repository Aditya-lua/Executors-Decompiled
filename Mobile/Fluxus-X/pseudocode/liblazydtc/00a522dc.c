/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a522dc
 */

int ENGINE_set_load_pubkey_function(ENGINE *e,ENGINE_LOAD_KEY_PTR loadpub_f)

{
  *(ENGINE_LOAD_KEY_PTR *)(e + 0x80) = loadpub_f;
  return 1;
}

