/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7467c
 */

undefined8 FUN_00b7467c(long param_1,void *param_2,size_t param_3)

{
  long lVar1;
  
  lVar1 = DAT_00d25b08;
  memcpy(param_2,(void *)(param_1 + DAT_00d25b08),param_3);
  DAT_00d25b08 = lVar1 + param_3;
  return 0;
}

