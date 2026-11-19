/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53264
 */

int ENGINE_set_default_ciphers(ENGINE *e)

{
  int iVar1;
  undefined8 local_18;
  
  if ((*(code **)(e + 0x38) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x38))(e,0,&local_18,0), iVar1 < 1)) {
    iVar1 = 1;
  }
  else {
    iVar1 = engine_table_register(&DAT_00d219d8,&LAB_00a531cc,e,local_18,iVar1,1);
  }
  return iVar1;
}

