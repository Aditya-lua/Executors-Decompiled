/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53944
 */

void ENGINE_unregister_pkey_meths(ENGINE *e)

{
  engine_table_unregister(&DAT_00d21a00,e);
  return;
}

