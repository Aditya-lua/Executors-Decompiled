/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53358
 */

ENGINE_CIPHERS_PTR ENGINE_get_ciphers(ENGINE *e)

{
  return *(ENGINE_CIPHERS_PTR *)(e + 0x38);
}

