/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52304
 */

ENGINE_LOAD_KEY_PTR ENGINE_get_load_pubkey_function(ENGINE *e)

{
  return *(ENGINE_LOAD_KEY_PTR *)(e + 0x80);
}

