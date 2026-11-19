/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53360
 */

int ENGINE_set_ciphers(ENGINE *e,ENGINE_CIPHERS_PTR f)

{
  *(ENGINE_CIPHERS_PTR *)(e + 0x38) = f;
  return 1;
}

