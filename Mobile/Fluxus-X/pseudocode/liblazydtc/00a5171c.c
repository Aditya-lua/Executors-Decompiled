/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5171c
 */

char * ENGINE_get_name(ENGINE *e)

{
  return *(char **)(e + 8);
}

