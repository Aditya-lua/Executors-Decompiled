/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891e8c
 */

void FUN_00891e8c(undefined8 *param_1)

{
  undefined8 *puVar1;
  void *pvVar2;
  
  puVar1 = (void *)param_1[5];
  while (puVar1 != (void *)0x0) {
    pvVar2 = (void *)*puVar1;
    operator_delete(puVar1,0x20);
    puVar1 = pvVar2;
  }
  pvVar2 = (void *)param_1[3];
  param_1[3] = 0;
  if (pvVar2 != (void *)0x0) {
    operator_delete(pvVar2,param_1[4] << 3);
  }
  pvVar2 = (void *)*param_1;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  param_1[1] = pvVar2;
  operator_delete(pvVar2,param_1[2] - (long)pvVar2);
  return;
}

