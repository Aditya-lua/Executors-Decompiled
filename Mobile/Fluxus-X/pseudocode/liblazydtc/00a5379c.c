/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5379c
 */

int ENGINE_set_default_DSA(ENGINE *e)

{
  int iVar1;
  
  if (*(long *)(e + 0x18) == 0) {
    return 1;
  }
  iVar1 = engine_table_register(&DAT_00d219f0,&LAB_00a53718,e,&DAT_00766004,1,1);
  return iVar1;
}

