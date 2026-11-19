/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a536bc
 */

int ENGINE_set_digests(ENGINE *e,ENGINE_DIGESTS_PTR f)

{
  *(ENGINE_DIGESTS_PTR *)(e + 0x40) = f;
  return 1;
}

