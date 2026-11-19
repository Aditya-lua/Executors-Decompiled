/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844700
 */

void FUN_00844700(undefined8 *param_1)

{
  void *pvVar1;
  void *pvVar2;
  void *pvVar3;
  
  pvVar2 = (void *)*param_1;
  if (pvVar2 == (void *)0x0) {
    return;
  }
  pvVar3 = (void *)param_1[1];
  pvVar1 = pvVar2;
  if (pvVar2 != pvVar3) {
    do {
      pvVar1 = *(void **)((long)pvVar3 + -0x28);
      if (pvVar1 != (void *)0x0) {
        *(void **)((long)pvVar3 + -0x20) = pvVar1;
        operator_delete(pvVar1,*(long *)((long)pvVar3 + -0x18) - (long)pvVar1);
      }
      pvVar1 = *(void **)((long)pvVar3 + -0x40);
      if (pvVar1 != (void *)0x0) {
        *(void **)((long)pvVar3 + -0x38) = pvVar1;
        operator_delete(pvVar1,*(long *)((long)pvVar3 + -0x30) - (long)pvVar1);
      }
      pvVar3 = (void *)((long)pvVar3 + -0x60);
    } while (pvVar3 != pvVar2);
    pvVar1 = (void *)*param_1;
  }
  param_1[1] = pvVar2;
  operator_delete(pvVar1,param_1[2] - (long)pvVar1);
  return;
}

