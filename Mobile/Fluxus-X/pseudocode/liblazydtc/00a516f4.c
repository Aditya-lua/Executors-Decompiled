/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a516f4
 */

int ENGINE_set_flags(ENGINE *e,int flags)

{
  *(int *)(e + 0x98) = flags;
  return 1;
}

