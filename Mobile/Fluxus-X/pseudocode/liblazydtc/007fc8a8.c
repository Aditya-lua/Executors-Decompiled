/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc8a8
 */

void FUN_007fc8a8(undefined8 *param_1)

{
  undefined8 *puVar1;
  void *pvVar2;
  
  puVar1 = (void *)param_1[2];
  while (puVar1 != (void *)0x0) {
    pvVar2 = (void *)*puVar1;
    operator_delete(puVar1,0x20);
    puVar1 = pvVar2;
  }
  pvVar2 = (void *)*param_1;
  *param_1 = 0;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar2,param_1[1] << 3);
  return;
}

