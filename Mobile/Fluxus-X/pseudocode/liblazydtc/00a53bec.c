/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53bec
 */

void ENGINE_unregister_RAND(ENGINE *e)

{
  engine_table_unregister(&DAT_00d21a08,e);
  return;
}

