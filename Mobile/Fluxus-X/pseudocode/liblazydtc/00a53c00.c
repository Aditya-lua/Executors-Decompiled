/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53c00
 */

int ENGINE_register_RAND(ENGINE *e)

{
  int iVar1;
  
  if (*(long *)(e + 0x30) == 0) {
    return 1;
  }
  iVar1 = engine_table_register(&DAT_00d21a08,&LAB_00a53c38,e,&DAT_0076600c,1,0);
  return iVar1;
}

