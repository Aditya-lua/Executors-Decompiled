/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00870ed4
 */

void FUN_00870ed4(undefined8 *param_1)

{
  undefined8 *puVar1;
  void *pvVar2;
  
  puVar1 = (void *)param_1[2];
  while (puVar1 != (void *)0x0) {
    pvVar2 = (void *)*puVar1;
    if ((*(byte *)(puVar1 + 2) & 1) != 0) {
      operator_delete((void *)puVar1[4],puVar1[2] & 0xfffffffffffffffe);
    }
    operator_delete(puVar1,0x28);
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

