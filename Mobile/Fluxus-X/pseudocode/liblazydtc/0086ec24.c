/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086ec24
 */

void FUN_0086ec24(undefined8 *param_1)

{
  void *pvVar1;
  undefined8 *puVar3;
  long lVar2;
  undefined8 *puVar4;
  void *pvVar5;
  void *pvVar6;
  
  if ((*(byte *)(param_1 + 1) & 1) == 0) {
    puVar4 = (undefined8 *)*param_1;
    pvVar5 = (void *)*puVar4;
    if (pvVar5 != (void *)0x0) {
      pvVar6 = (void *)puVar4[1];
      pvVar1 = pvVar5;
      puVar3 = puVar4;
      if (pvVar5 != pvVar6) {
        do {
          if ((*(byte *)((long)pvVar6 + -0x18) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar6 + -8),
                            *(ulong *)((long)pvVar6 + -0x18) & 0xfffffffffffffffe);
          }
          pvVar6 = (void *)((long)pvVar6 + -0x28);
        } while (pvVar6 != pvVar5);
        pvVar1 = *(void **)*param_1;
        puVar3 = (undefined8 *)*param_1;
      }
      lVar2 = puVar3[2];
      puVar4[1] = pvVar5;
      operator_delete(pvVar1,lVar2 - (long)pvVar1);
      return;
    }
  }
  return;
}

