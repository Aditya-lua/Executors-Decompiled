/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a539cc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void ENGINE_register_all_pkey_meths(void)

{
  int iVar1;
  ENGINE *e;
  undefined8 local_28;
  
  e = ENGINE_get_first();
  if (e != (ENGINE *)0x0) {
    do {
      if ((*(code **)(e + 0x48) != (code *)0x0) &&
         (iVar1 = (**(code **)(e + 0x48))(e,0,&local_28,0), 0 < iVar1)) {
        engine_table_register(&DAT_00d21a00,&LAB_00a539c0,e,local_28,iVar1,0);
      }
      e = ENGINE_get_next(e);
    } while (e != (ENGINE *)0x0);
  }
  return;
}

