/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a534c0
 */

int ENGINE_register_digests(ENGINE *e)

{
  int iVar1;
  undefined8 local_18;
  
  if ((*(code **)(e + 0x40) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x40))(e,0,&local_18,0), iVar1 < 1)) {
    iVar1 = 1;
  }
  else {
    iVar1 = engine_table_register(&DAT_00d219e8,&LAB_00a53528,e,local_18,iVar1,0);
  }
  return iVar1;
}

