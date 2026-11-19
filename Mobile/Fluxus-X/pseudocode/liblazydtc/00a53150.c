/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53150
 */

void ENGINE_unregister_ciphers(ENGINE *e)

{
  engine_table_unregister(&DAT_00d219d8,e);
  return;
}

