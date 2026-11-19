/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53d80
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void ENGINE_register_all_RSA(void)

{
  ENGINE *e;
  
  e = ENGINE_get_first();
  if (e != (ENGINE *)0x0) {
    do {
      if (*(long *)(e + 0x10) != 0) {
        engine_table_register(&DAT_00d21a10,&LAB_00a53d74,e,&DAT_00766010,1,0);
      }
      e = ENGINE_get_next(e);
    } while (e != (ENGINE *)0x0);
  }
  return;
}

