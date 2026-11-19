/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a526b4
 */

void ENGINE_unregister_pkey_asn1_meths(ENGINE *e)

{
  engine_table_unregister(&DAT_00d219c8,e);
  return;
}

