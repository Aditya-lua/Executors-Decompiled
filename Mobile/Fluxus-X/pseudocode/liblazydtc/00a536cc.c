/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a536cc
 */

void ENGINE_unregister_DSA(ENGINE *e)

{
  engine_table_unregister(&DAT_00d219f0,e);
  return;
}

