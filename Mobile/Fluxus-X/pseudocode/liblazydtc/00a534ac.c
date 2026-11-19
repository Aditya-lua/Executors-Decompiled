/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a534ac
 */

void ENGINE_unregister_digests(ENGINE *e)

{
  engine_table_unregister(&DAT_00d219e8,e);
  return;
}

