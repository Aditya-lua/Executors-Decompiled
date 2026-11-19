/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53d28
 */

void ENGINE_unregister_RSA(ENGINE *e)

{
  engine_table_unregister(&DAT_00d21a10,e);
  return;
}

