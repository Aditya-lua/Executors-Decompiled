/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a513dc
 */

int ENGINE_free(ENGINE *e)

{
  engine_free_util(e,1);
  return 1;
}

