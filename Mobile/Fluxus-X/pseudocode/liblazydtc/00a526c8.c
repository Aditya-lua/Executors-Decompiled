/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a526c8
 */

int ENGINE_register_pkey_asn1_meths(ENGINE *e)

{
  int iVar1;
  undefined8 local_18;
  
  if ((*(code **)(e + 0x50) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x50))(e,0,&local_18,0), iVar1 < 1)) {
    iVar1 = 1;
  }
  else {
    iVar1 = engine_table_register(&DAT_00d219c8,&LAB_00a52730,e,local_18,iVar1,0);
  }
  return iVar1;
}

