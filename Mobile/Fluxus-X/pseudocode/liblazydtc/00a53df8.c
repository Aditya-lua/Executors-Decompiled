/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53df8
 */

int ENGINE_set_default_RSA(ENGINE *e)

{
  int iVar1;
  
  if (*(long *)(e + 0x10) == 0) {
    return 1;
  }
  iVar1 = engine_table_register(&DAT_00d21a10,&LAB_00a53d74,e,&DAT_00766010,1,1);
  return iVar1;
}

