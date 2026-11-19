/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53370
 */

void ENGINE_unregister_DH(ENGINE *e)

{
  engine_table_unregister(&DAT_00d219e0,e);
  return;
}

