/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53724
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void ENGINE_register_all_DSA(void)

{
  ENGINE *e;
  
  e = ENGINE_get_first();
  if (e != (ENGINE *)0x0) {
    do {
      if (*(long *)(e + 0x18) != 0) {
        engine_table_register(&DAT_00d219f0,&LAB_00a53718,e,&DAT_00766004,1,0);
      }
      e = ENGINE_get_next(e);
    } while (e != (ENGINE *)0x0);
  }
  return;
}

