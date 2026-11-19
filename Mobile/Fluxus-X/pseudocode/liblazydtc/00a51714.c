/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a51714
 */

char * ENGINE_get_id(ENGINE *e)

{
  return *(char **)e;
}

