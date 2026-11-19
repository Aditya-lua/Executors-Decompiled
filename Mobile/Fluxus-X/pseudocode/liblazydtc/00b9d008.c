/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d008
 */

undefined8 FUN_00b9d008(long param_1,void *param_2,size_t param_3)

{
  long lVar1;
  
  lVar1 = DAT_00d26020;
  memcpy(param_2,(void *)(param_1 + DAT_00d26020),param_3);
  DAT_00d26020 = lVar1 + param_3;
  return 0;
}

