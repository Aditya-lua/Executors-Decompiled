/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53440
 */

int ENGINE_set_default_DH(ENGINE *e)

{
  int iVar1;
  
  if (*(long *)(e + 0x20) == 0) {
    return 1;
  }
  iVar1 = engine_table_register(&DAT_00d219e0,&LAB_00a533bc,e,&DAT_00766000,1,1);
  return iVar1;
}

