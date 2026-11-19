/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53808
 */

void ENGINE_unregister_EC(undefined8 param_1)

{
  engine_table_unregister(&DAT_00d219f8,param_1);
  return;
}

