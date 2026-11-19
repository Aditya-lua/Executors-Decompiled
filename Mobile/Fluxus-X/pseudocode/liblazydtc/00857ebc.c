/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00857ebc
 */

void FUN_00857ebc(undefined8 *param_1)

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
      if ((*(byte *)((long)pvVar3 + -0x18) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar3 + -8),
                        *(ulong *)((long)pvVar3 + -0x18) & 0xfffffffffffffffe);
      }
      pvVar3 = (void *)((long)pvVar3 + -0x30);
    } while (pvVar3 != pvVar2);
    pvVar1 = (void *)*param_1;
  }
  param_1[1] = pvVar2;
  operator_delete(pvVar1,param_1[2] - (long)pvVar1);
  return;
}

