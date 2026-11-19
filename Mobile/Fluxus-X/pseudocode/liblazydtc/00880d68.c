/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00880d68
 */

void FUN_00880d68(undefined8 *param_1)

{
  void *pvVar1;
  
  pvVar1 = (void *)param_1[6];
  *param_1 = &PTR_FUN_00c4ae68;
  if (pvVar1 != (void *)0x0) {
    param_1[7] = pvVar1;
    operator_delete(pvVar1,param_1[8] - (long)pvVar1);
  }
  pvVar1 = (void *)param_1[3];
  if (pvVar1 == (void *)0x0) {
    return;
  }
  param_1[4] = pvVar1;
  operator_delete(pvVar1,param_1[5] - (long)pvVar1);
  return;
}

