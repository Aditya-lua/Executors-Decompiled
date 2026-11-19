/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53860
 */

void ENGINE_register_all_EC(void)

{
  ENGINE *e;
  
  e = ENGINE_get_first();
  if (e != (ENGINE *)0x0) {
    do {
      if (*(long *)(e + 0x28) != 0) {
        engine_table_register(&DAT_00d219f8,&LAB_00a53854,e,&DAT_00766008,1,0);
      }
      e = ENGINE_get_next(e);
    } while (e != (ENGINE *)0x0);
  }
  return;
}

