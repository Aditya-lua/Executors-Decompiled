/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a538d8
 */

undefined8 ENGINE_set_default_EC(long param_1)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 0x28) == 0) {
    return 1;
  }
  uVar1 = engine_table_register(&DAT_00d219f8,&LAB_00a53854,param_1,&DAT_00766008,1,1);
  return uVar1;
}

