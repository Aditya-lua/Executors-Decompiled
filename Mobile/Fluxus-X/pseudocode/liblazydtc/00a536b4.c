/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a536b4
 */

ENGINE_DIGESTS_PTR ENGINE_get_digests(ENGINE *e)

{
  return *(ENGINE_DIGESTS_PTR *)(e + 0x40);
}

