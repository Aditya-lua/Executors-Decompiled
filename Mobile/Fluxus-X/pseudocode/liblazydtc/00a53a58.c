/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53a58
 */

int ENGINE_set_default_pkey_meths(ENGINE *e)

{
  int iVar1;
  undefined8 local_18;
  
  if ((*(code **)(e + 0x48) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x48))(e,0,&local_18,0), iVar1 < 1)) {
    iVar1 = 1;
  }
  else {
    iVar1 = engine_table_register(&DAT_00d21a00,&LAB_00a539c0,e,local_18,iVar1,1);
  }
  return iVar1;
}

