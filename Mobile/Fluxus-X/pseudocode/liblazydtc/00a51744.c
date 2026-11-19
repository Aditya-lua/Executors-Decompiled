/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51744
 */

int ENGINE_get_flags(ENGINE *e)

{
  return *(int *)(e + 0x98);
}

